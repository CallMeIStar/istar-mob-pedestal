package net.istar.mobpedestal.blocks.pedestalblocks;

import net.istar.mobpedestal.ManageTotem.MobPedestalTracker;
import net.istar.mobpedestal.MobHandler.MobType;
import net.istar.mobpedestal.blocks.ModBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;


public class MobPedestalBlockEntity extends BlockEntity {
    private MobType mobType;
    private int radius;

    public MobPedestalBlockEntity(BlockPos pos, BlockState state, MobType mobType, int radius) {
        super(ModBlockEntities.MOB_PEDESTAL_BLOCK_ENTITY, pos, state);
        this.mobType = mobType;
        this.radius = radius;
    }

    public MobType getMobType() {
        return mobType;
    }

    public int getRadius() {
        return radius;
    }

    // Save to NBT
    @Override
    public void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        nbt.putString("MobType", mobType.name());
        nbt.putInt("Radius", radius);
    }

    // Load from NBT
    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        this.mobType = MobType.valueOf(nbt.getString("MobType"));
        this.radius = nbt.getInt("Radius");
    }

    // Called when the block entity is loaded
    @Override
    public void setWorld(World world) {
        super.setWorld(world);
        if (!world.isClient && world instanceof ServerWorld) {
            BlockState state = world.getBlockState(pos);
            if (state.get(MobPedestalBlock.ACTIVE)) {
                MobPedestalTracker.addTotem(mobType, pos, radius);
            }
        }
    }

    // Called when the block entity is removed from the world
    @Override
    public void markRemoved() {
        super.markRemoved();
        if (world != null && !world.isClient) {
            MobPedestalTracker.removeTotem(mobType, pos, radius);
        }
    }
}