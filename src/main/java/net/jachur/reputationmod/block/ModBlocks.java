package net.jachur.reputationmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jachur.reputationmod.ReputationMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block RUBY_BLOCK= registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block SAPPHIRE_BLOCK= registerBlock("sapphire_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block TOPAZ_BLOCK= registerBlock("topaz_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block JADE_BLOCK= registerBlock("jade_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block ONYX_BLOCK= registerBlock("onyx_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block OPAL_BLOCK= registerBlock("opal_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block GARNET_BLOCK= registerBlock("garnet_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ReputationMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ReputationMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        ReputationMod.LOGGER.info("Registering Mod Blocks for " + ReputationMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register( entries -> {
            entries.add(ModBlocks.RUBY_BLOCK);
            entries.add(ModBlocks.SAPPHIRE_BLOCK);
            entries.add(ModBlocks.TOPAZ_BLOCK);
            entries.add(ModBlocks.JADE_BLOCK);
            entries.add(ModBlocks.ONYX_BLOCK);
            entries.add(ModBlocks.OPAL_BLOCK);
            entries.add(ModBlocks.GARNET_BLOCK);
        });
    }
}
