package net.istar.mobpedestal;

import net.fabricmc.api.ModInitializer;

import net.istar.mobpedestal.MobHandler.MobPedestalHandler;
import net.istar.mobpedestal.blocks.ModBlockEntities;
import net.istar.mobpedestal.blocks.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IStarsMobPedestal implements ModInitializer {
	public static final String MOD_ID = "istars-mob-pedestal";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		MobPedestalHandler.register();
		ModBlockEntities.registerBlockEntities();


		LOGGER.info("Hello Fabric world!");
	}
}