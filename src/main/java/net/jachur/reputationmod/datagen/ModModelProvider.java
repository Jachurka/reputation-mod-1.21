package net.jachur.reputationmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.jachur.reputationmod.block.ModBlocks;
import net.jachur.reputationmod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TOPAZ_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JADE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ONYX_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OPAL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GARNET_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOPAZ, Models.GENERATED);
        itemModelGenerator.register(ModItems.JADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ONYX, Models.GENERATED);
        itemModelGenerator.register(ModItems.OPAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.GARNET, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TOPAZ_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TOPAZ_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TOPAZ_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TOPAZ_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.JADE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.JADE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.JADE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.JADE_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ONYX_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ONYX_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ONYX_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ONYX_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.OPAL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.OPAL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.OPAL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.OPAL_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GARNET_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GARNET_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GARNET_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GARNET_BOOTS));
    }
}
