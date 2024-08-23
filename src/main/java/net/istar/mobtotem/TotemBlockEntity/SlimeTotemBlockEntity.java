package net.istar.mobtotem.TotemBlockEntity;

import net.istar.mobtotem.ManageTotem.SlimeTotemTracker;
import net.istar.mobtotem.blocks.ModBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;

public class SlimeTotemBlockEntity extends BlockEntity {

    public SlimeTotemBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SLIME_TOTEM_BLOCK_ENTITY_BLOCK, pos, state);
    }

    @Override
    public void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        System.out.println("Writing NBT for Slime Totem Block Entity at " + pos);
        // Save the block position to NBT
        nbt.putInt("PosX", pos.getX());
        nbt.putInt("PosY", pos.getY());
        nbt.putInt("PosZ", pos.getZ());
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        System.out.println("Reading NBT for Slime Totem Block Entity at " + pos);
        // Load the block position from NBT
        BlockPos totemPos = new BlockPos(nbt.getInt("PosX"), nbt.getInt("PosY"), nbt.getInt("PosZ"));
        SlimeTotemTracker.addTotem(totemPos);
    }

    @Override
    public void markRemoved() {
        super.markRemoved();
        // Remove this block's position from the tracker when it is removed
        System.out.println("Removing Slime Totem Block Entity at " + pos);
        SlimeTotemTracker.removeTotem(pos);
    }
}