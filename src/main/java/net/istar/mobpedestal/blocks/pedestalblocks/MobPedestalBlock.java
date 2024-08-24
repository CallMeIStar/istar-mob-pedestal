package net.istar.mobpedestal.blocks.pedestalblocks;

import net.istar.mobpedestal.ManageTotem.MobPedestalTracker;
import net.istar.mobpedestal.MobHandler.MobType;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;


public abstract class MobPedestalBlock extends Block implements BlockEntityProvider {
    private final MobType mobType;
    private final int radius;

    public MobPedestalBlock(Settings settings, MobType mobType, int radius) {
        super(settings);
        this.mobType = mobType;
        this.radius = radius;
    }

    public MobType getMobType() {
        return mobType;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        System.out.println("Creating BlockEntity at position: " + pos + " with mobType: " + mobType + " and radius: " + radius);
        return new MobPedestalBlockEntity(pos, state, mobType, radius);
    }

    @Override
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {
        super.onBroken(world, pos, state);
        if (!world.isClient()) {
            MobPedestalTracker.removeTotem(mobType, pos, radius);
            System.out.println("Removed totem at position: " + pos + " with mobType: " + mobType);
        }
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        if (!world.isClient()) {
            MobPedestalTracker.addTotem(mobType, pos, radius);
            System.out.println("Added totem at position: " + pos + " with mobType: " + mobType);
        }
    }

}