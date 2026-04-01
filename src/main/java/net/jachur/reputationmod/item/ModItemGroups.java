package net.jachur.reputationmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jachur.reputationmod.ReputationMod;
import net.jachur.reputationmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup GEMS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ReputationMod.MOD_ID, "gems_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE))
                    .displayName(Text.translatable("itemgroup.reputationmod.gems_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModItems.TOPAZ);
                        entries.add(ModItems.JADE);
                        entries.add(ModItems.ONYX);
                        entries.add(ModItems.OPAL);
                        entries.add(ModItems.GARNET);

                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.TOPAZ_BLOCK);
                        entries.add(ModBlocks.JADE_BLOCK);
                        entries.add(ModBlocks.ONYX_BLOCK);
                        entries.add(ModBlocks.OPAL_BLOCK);
                        entries.add(ModBlocks.GARNET_BLOCK);

                        entries.add(ModItems.RUBY_HELMET);
                        entries.add(ModItems.RUBY_CHESTPLATE);
                        entries.add(ModItems.RUBY_LEGGINGS);
                        entries.add(ModItems.RUBY_BOOTS);

                        entries.add(ModItems.SAPPHIRE_HELMET);
                        entries.add(ModItems.SAPPHIRE_CHESTPLATE);
                        entries.add(ModItems.SAPPHIRE_LEGGINGS);
                        entries.add(ModItems.SAPPHIRE_BOOTS);

                        entries.add(ModItems.TOPAZ_HELMET);
                        entries.add(ModItems.TOPAZ_CHESTPLATE);
                        entries.add(ModItems.TOPAZ_LEGGINGS);
                        entries.add(ModItems.TOPAZ_BOOTS);

                        entries.add(ModItems.JADE_HELMET);
                        entries.add(ModItems.JADE_CHESTPLATE);
                        entries.add(ModItems.JADE_LEGGINGS);
                        entries.add(ModItems.JADE_BOOTS);

                        entries.add(ModItems.ONYX_HELMET);
                        entries.add(ModItems.ONYX_CHESTPLATE);
                        entries.add(ModItems.ONYX_LEGGINGS);
                        entries.add(ModItems.ONYX_BOOTS);

                        entries.add(ModItems.OPAL_HELMET);
                        entries.add(ModItems.OPAL_CHESTPLATE);
                        entries.add(ModItems.OPAL_LEGGINGS);
                        entries.add(ModItems.OPAL_BOOTS);

                        entries.add(ModItems.GARNET_HELMET);
                        entries.add(ModItems.GARNET_CHESTPLATE);
                        entries.add(ModItems.GARNET_LEGGINGS);
                        entries.add(ModItems.GARNET_BOOTS);

                    } ).build());


    public static void registerItemGroups() {
        ReputationMod.LOGGER.info("Registering Item Groups for " + ReputationMod.MOD_ID);
    }
}
