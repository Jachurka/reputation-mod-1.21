package net.jachur.reputationmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.jachur.reputationmod.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.RUBY_HELMET)
                .add(ModItems.RUBY_CHESTPLATE)
                .add(ModItems.RUBY_LEGGINGS)
                .add(ModItems.RUBY_BOOTS)

                .add(ModItems.SAPPHIRE_HELMET)
                .add(ModItems.SAPPHIRE_CHESTPLATE)
                .add(ModItems.SAPPHIRE_LEGGINGS)
                .add(ModItems.SAPPHIRE_BOOTS)

                .add(ModItems.TOPAZ_HELMET)
                .add(ModItems.TOPAZ_CHESTPLATE)
                .add(ModItems.TOPAZ_LEGGINGS)
                .add(ModItems.TOPAZ_BOOTS)

                .add(ModItems.JADE_HELMET)
                .add(ModItems.JADE_CHESTPLATE)
                .add(ModItems.JADE_LEGGINGS)
                .add(ModItems.JADE_BOOTS)

                .add(ModItems.ONYX_HELMET)
                .add(ModItems.ONYX_CHESTPLATE)
                .add(ModItems.ONYX_LEGGINGS)
                .add(ModItems.ONYX_BOOTS)

                .add(ModItems.OPAL_HELMET)
                .add(ModItems.OPAL_CHESTPLATE)
                .add(ModItems.OPAL_LEGGINGS)
                .add(ModItems.OPAL_BOOTS)

                .add(ModItems.GARNET_HELMET)
                .add(ModItems.GARNET_CHESTPLATE)
                .add(ModItems.GARNET_LEGGINGS)
                .add(ModItems.GARNET_BOOTS);
    }
}
