package net.istar.mobpedestal.blocks.pedestalblocks;

import net.istar.mobpedestal.ManageTotem.MobPedestalTracker;
import net.istar.mobpedestal.MobHandler.MobType;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;


public abstract class MobPedestalBlock extends Block implements BlockEntityProvider {
    public static final BooleanProperty ACTIVE = BooleanProperty.of("active");

    private final MobType mobType;
    private final int radius;

    public MobPedestalBlock(Settings settings, MobType mobType, int radius) {
        super(settings);
        this.mobType = mobType;
        this.radius = radius;
        setDefaultState(this.stateManager.getDefaultState().with(ACTIVE, true));
    }

    public MobType getMobType() {
        return mobType;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(ACTIVE);
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
        if (!world.isClient() && state.get(ACTIVE)) {
            MobPedestalTracker.addTotem(mobType, pos, radius);
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            boolean isActive = state.get(ACTIVE);
            world.setBlockState(pos, state.with(ACTIVE, !isActive));
            if (isActive) {
                MobPedestalTracker.removeTotem(mobType, pos, radius);
            } else {
                MobPedestalTracker.addTotem(mobType, pos, radius);
            }
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }
}