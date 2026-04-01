package net.jachur.reputationmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.jachur.reputationmod.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.SAPPHIRE_BLOCK)
                .add(ModBlocks.TOPAZ_BLOCK)
                .add(ModBlocks.JADE_BLOCK)
                .add(ModBlocks.ONYX_BLOCK)
                .add(ModBlocks.OPAL_BLOCK)
                .add(ModBlocks.GARNET_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.SAPPHIRE_BLOCK)
                .add(ModBlocks.TOPAZ_BLOCK)
                .add(ModBlocks.JADE_BLOCK)
                .add(ModBlocks.ONYX_BLOCK)
                .add(ModBlocks.OPAL_BLOCK)
                .add(ModBlocks.GARNET_BLOCK);
    }
}
