package net.istar.mobpedestal.blocks.pedestalblocks;

import net.istar.mobpedestal.ManageTotem.MobPedestalTracker;
import net.istar.mobpedestal.MobHandler.MobType;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class GoldenSkeletonPedestalBlock extends MobPedestalBlock {
    public static final BooleanProperty ACTIVE = BooleanProperty.of("active");
    private static final VoxelShape SHAPE = Block.createCuboidShape(4, 0, 4, 12, 14, 12);

    public GoldenSkeletonPedestalBlock(Settings settings) {
        super(settings, MobType.SKELETON, 28);
         setDefaultState(getDefaultState()
                .with(Properties.HORIZONTAL_FACING, Direction.NORTH)
                .with(ACTIVE, true)); // Default to inactive
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.HORIZONTAL_FACING, ACTIVE);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    // Return luminance based on the block state
    public static int getLuminance(BlockState state) {
        return state.get(ACTIVE) ? 15 : 0; // Full light level when activated
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient) {
            return ActionResult.SUCCESS; // Only do this on the server side
        }

        // Get the current value of the "active" property
        boolean activated = state.get(ACTIVE);

        // Toggle the "active" state and update the block state
        BlockState newState = state.with(ACTIVE, !activated);
        world.setBlockState(pos, newState);

        // Update the MobPedestalTracker based on the new state
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof MobPedestalBlockEntity) {
            MobPedestalBlockEntity pedestal = (MobPedestalBlockEntity) blockEntity;
            if (newState.get(ACTIVE)) {
                MobPedestalTracker.addTotem(pedestal.getMobType(), pos, pedestal.getRadius());
            } else {
                MobPedestalTracker.removeTotem(pedestal.getMobType(), pos, pedestal.getRadius());
            }
        }

        // Play a click sound to emphasize the interaction
        world.playSound(null, pos, SoundEvents.BLOCK_COMPARATOR_CLICK, SoundCategory.BLOCKS, 1.0F, 1.0F);

        return ActionResult.SUCCESS;
    }}
