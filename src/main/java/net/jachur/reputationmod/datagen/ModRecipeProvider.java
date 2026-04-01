package net.jachur.reputationmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.jachur.reputationmod.block.ModBlocks;
import net.jachur.reputationmod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.DECORATIONS, ModBlocks.RUBY_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SAPPHIRE, RecipeCategory.DECORATIONS, ModBlocks.SAPPHIRE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TOPAZ, RecipeCategory.DECORATIONS, ModBlocks.TOPAZ_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.JADE, RecipeCategory.DECORATIONS, ModBlocks.JADE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ONYX, RecipeCategory.DECORATIONS, ModBlocks.ONYX_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.OPAL, RecipeCategory.DECORATIONS, ModBlocks.OPAL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.GARNET, RecipeCategory.DECORATIONS, ModBlocks.GARNET_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_HELMET)
                .pattern("RRR")
                .pattern("R R")
                .input('R', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_CHESTPLATE)
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_LEGGINGS)
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_BOOTS)
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))

                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SAPPHIRE_HELMET)
                .pattern("RRR")
                .pattern("R R")
                .input('R', ModItems.SAPPHIRE)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SAPPHIRE_CHESTPLATE)
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.SAPPHIRE)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SAPPHIRE_LEGGINGS)
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.SAPPHIRE)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SAPPHIRE_BOOTS)
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.SAPPHIRE)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TOPAZ_HELMET)
                .pattern("RRR")
                .pattern("R R")
                .input('R', ModItems.TOPAZ)
                .criterion(hasItem(ModItems.TOPAZ), conditionsFromItem(ModItems.TOPAZ))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TOPAZ_CHESTPLATE)
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.TOPAZ)
                .criterion(hasItem(ModItems.TOPAZ), conditionsFromItem(ModItems.TOPAZ))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TOPAZ_LEGGINGS)
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.TOPAZ)
                .criterion(hasItem(ModItems.TOPAZ), conditionsFromItem(ModItems.TOPAZ))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TOPAZ_BOOTS)
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.TOPAZ)
                .criterion(hasItem(ModItems.TOPAZ), conditionsFromItem(ModItems.TOPAZ))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.JADE_HELMET)
                .pattern("RRR")
                .pattern("R R")
                .input('R', ModItems.JADE)
                .criterion(hasItem(ModItems.JADE), conditionsFromItem(ModItems.JADE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.JADE_CHESTPLATE)
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.JADE)
                .criterion(hasItem(ModItems.JADE), conditionsFromItem(ModItems.JADE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.JADE_LEGGINGS)
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.JADE)
                .criterion(hasItem(ModItems.JADE), conditionsFromItem(ModItems.JADE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.JADE_BOOTS)
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.JADE)
                .criterion(hasItem(ModItems.JADE), conditionsFromItem(ModItems.JADE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ONYX_HELMET)
                .pattern("RRR")
                .pattern("R R")
                .input('R', ModItems.ONYX)
                .criterion(hasItem(ModItems.ONYX), conditionsFromItem(ModItems.ONYX))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ONYX_CHESTPLATE)
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.ONYX)
                .criterion(hasItem(ModItems.ONYX), conditionsFromItem(ModItems.ONYX))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ONYX_LEGGINGS)
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.ONYX)
                .criterion(hasItem(ModItems.ONYX), conditionsFromItem(ModItems.ONYX))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ONYX_BOOTS)
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.ONYX)
                .criterion(hasItem(ModItems.ONYX), conditionsFromItem(ModItems.ONYX))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OPAL_HELMET)
                .pattern("RRR")
                .pattern("R R")
                .input('R', ModItems.OPAL)
                .criterion(hasItem(ModItems.OPAL), conditionsFromItem(ModItems.OPAL))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OPAL_CHESTPLATE)
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.OPAL)
                .criterion(hasItem(ModItems.OPAL), conditionsFromItem(ModItems.OPAL))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OPAL_LEGGINGS)
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.OPAL)
                .criterion(hasItem(ModItems.OPAL), conditionsFromItem(ModItems.OPAL))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OPAL_BOOTS)
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.OPAL)
                .criterion(hasItem(ModItems.OPAL), conditionsFromItem(ModItems.OPAL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GARNET_HELMET)
                .pattern("RRR")
                .pattern("R R")
                .input('R', ModItems.GARNET)
                .criterion(hasItem(ModItems.GARNET), conditionsFromItem(ModItems.GARNET))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GARNET_CHESTPLATE)
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.GARNET)
                .criterion(hasItem(ModItems.GARNET), conditionsFromItem(ModItems.GARNET))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GARNET_LEGGINGS)
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.GARNET)
                .criterion(hasItem(ModItems.GARNET), conditionsFromItem(ModItems.GARNET))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GARNET_BOOTS)
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.GARNET)
                .criterion(hasItem(ModItems.GARNET), conditionsFromItem(ModItems.GARNET))
                .offerTo(exporter);
    }
}
