package net.jachur.reputationmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.jachur.reputationmod.block.ModBlocks;
import net.jachur.reputationmod.item.ModItemGroups;
import net.jachur.reputationmod.item.ModItems;
import net.jachur.reputationmod.villager.ModVillagers;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReputationMod implements ModInitializer {
	public static final String MOD_ID = "reputationmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModVillagers.registerVillagers();

		TradeOfferHelper.registerVillagerOffers(ModVillagers.GEM_CUTTER,1, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 4),
					new ItemStack(ModItems.SAPPHIRE, 1), 16, 7, 0.04f));
		});

		TradeOfferHelper.registerVillagerOffers(ModVillagers.GEM_CUTTER,2, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 6),
					new ItemStack(ModItems.OPAL, 1), 16, 7, 0.04f));
		});

		TradeOfferHelper.registerVillagerOffers(ModVillagers.GEM_CUTTER,3, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 8),
					new ItemStack(ModItems.TOPAZ, 1), 16, 7, 0.04f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 8),
					new ItemStack(ModItems.GARNET, 1), 16, 7, 0.04f));
		});

		TradeOfferHelper.registerVillagerOffers(ModVillagers.GEM_CUTTER,4, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 8),
					new ItemStack(ModItems.RUBY, 1), 16, 7, 0.04f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 8),
					new ItemStack(ModItems.ONYX, 1), 16, 7, 0.04f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 8),
					new ItemStack(ModItems.JADE, 1), 16, 7, 0.04f));
		});

		TradeOfferHelper.registerVillagerOffers(ModVillagers.GEM_CUTTER,5, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 8),
					new ItemStack(ModItems.RUBY, 1), 16, 7, 0.04f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 8),
					new ItemStack(ModItems.ONYX, 1), 16, 7, 0.04f));
		});
	}
}