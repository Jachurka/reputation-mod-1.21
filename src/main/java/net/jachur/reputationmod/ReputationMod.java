package net.jachur.reputationmod;

import net.fabricmc.api.ModInitializer;

import net.jachur.reputationmod.block.ModBlocks;
import net.jachur.reputationmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReputationMod implements ModInitializer {
	public static final String MOD_ID = "reputationmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}