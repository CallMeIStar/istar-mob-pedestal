package net.istar.mobpedestal.blocks.pedestalblocks;

import net.istar.mobpedestal.ManageTotem.MobPedestalTracker;
import net.istar.mobpedestal.MobHandler.MobType;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
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
import net.minecraft.world.WorldAccess;


public class MobPedestalBlock extends Block implements BlockEntityProvider {
    public static final BooleanProperty ACTIVE = BooleanProperty.of("active");
    private static final VoxelShape SHAPE = Block.createCuboidShape(4, 0, 4, 12, 14, 12);

    private final MobType mobType;
    private final int radius;

    public MobPedestalBlock(Settings settings, MobType mobType, int radius) {
        super(settings);
        this.mobType = mobType;
        this.radius = radius;
        setDefaultState(getDefaultState()
                .with(Properties.HORIZONTAL_FACING, Direction.NORTH)
                .with(ACTIVE, true)); // Default to active
    }

    public MobType getMobType() {
        return mobType;
    }

    public int getRadius() {
        return radius;
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
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new MobPedestalBlockEntity(pos, state, mobType, radius);
    }

    @Override
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {
        super.onBroken(world, pos, state);
        if (!world.isClient()) {
            MobPedestalTracker.removeTotem(mobType, pos, radius);
        }
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        if (!world.isClient()) {
            MobPedestalTracker.addTotem(mobType, pos, radius);
        }
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

            // Sync the block entity's active field with the block state
            pedestal.setActive(newState.get(ACTIVE));

            if (newState.get(ACTIVE)) {
                MobPedestalTracker.addTotem(pedestal.getMobType(), pos, pedestal.getRadius());
            } else {
                MobPedestalTracker.removeTotem(pedestal.getMobType(), pos, pedestal.getRadius());
            }
        }

        // Play a click sound to emphasize the interaction
        world.playSound(null, pos, SoundEvents.BLOCK_COMPARATOR_CLICK, SoundCategory.BLOCKS, 1.0F, 1.0F);

        return ActionResult.SUCCESS;
    }
    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
        int powerLevel = world.getReceivedRedstonePower(pos);

        // Check the power level and update the active state accordingly
        if (powerLevel == 15) {
            // If the power level is at maximum, turn off the pedestal
            if (state.get(ACTIVE)) {
                world.setBlockState(pos, state.with(ACTIVE, false), Block.NOTIFY_ALL);
                MobPedestalTracker.removeTotem(mobType, pos, radius);
                updateBlockEntity(world, pos, false);
            }
        } else if (powerLevel >= 1 && powerLevel < 15) {
            // If the power level is between 1 and 14, turn on the pedestal
            if (!state.get(ACTIVE)) {
                world.setBlockState(pos, state.with(ACTIVE, true), Block.NOTIFY_ALL);
                MobPedestalTracker.addTotem(mobType, pos, radius);
                updateBlockEntity(world, pos, true);
            }
        }
    }
    private void updateBlockEntity(World world, BlockPos pos, boolean active) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof MobPedestalBlockEntity) {
            MobPedestalBlockEntity pedestal = (MobPedestalBlockEntity) blockEntity;
            pedestal.setActive(active);
        }
    }
}
