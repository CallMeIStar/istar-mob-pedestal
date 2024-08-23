package net.istar.mobtotem;

import net.fabricmc.api.ModInitializer;

import net.istar.mobtotem.MobHandler.SlimeHandler;
import net.istar.mobtotem.blocks.ModBlockEntities;
import net.istar.mobtotem.blocks.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IStarsMobTotems implements ModInitializer {
	public static final String MOD_ID = "istars-mob-totems";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		SlimeHandler.register();
		ModBlockEntities.registerBlockEntities();


		LOGGER.info("Hello Fabric world!");
	}
}