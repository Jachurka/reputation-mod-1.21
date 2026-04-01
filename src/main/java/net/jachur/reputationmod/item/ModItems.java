package net.jachur.reputationmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jachur.reputationmod.ReputationMod;
import net.jachur.reputationmod.item.custom.ModArmorItem;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static Item RUBY = registerItem( "ruby", new Item(new Item.Settings()));
    public static Item ONYX = registerItem("onyx", new Item(new Item.Settings()));
    public static Item JADE = registerItem("jade", new Item(new Item.Settings()));
    public static Item OPAL = registerItem("opal", new Item(new Item.Settings()));
    public static Item SAPPHIRE = registerItem("sapphire", new Item(new Item.Settings()));
    public static Item TOPAZ = registerItem("topaz", new Item(new Item.Settings()));
    public static Item GARNET = registerItem("garnet", new Item(new Item.Settings()));

    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ModArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(25))));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(25))));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(25))));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(25))));

    public static final Item SAPPHIRE_HELMET = registerItem("sapphire_helmet",
            new ModArmorItem(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(25))));
    public static final Item SAPPHIRE_CHESTPLATE = registerItem("sapphire_chestplate",
            new ArmorItem(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(25))));
    public static final Item SAPPHIRE_LEGGINGS = registerItem("sapphire_leggings",
            new ArmorItem(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(25))));
    public static final Item SAPPHIRE_BOOTS = registerItem("sapphire_boots",
            new ArmorItem(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(25))));

    public static final Item TOPAZ_HELMET = registerItem("topaz_helmet",
            new ModArmorItem(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(25))));
    public static final Item TOPAZ_CHESTPLATE = registerItem("topaz_chestplate",
            new ArmorItem(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(25))));
    public static final Item TOPAZ_LEGGINGS = registerItem("topaz_leggings",
            new ArmorItem(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(25))));
    public static final Item TOPAZ_BOOTS = registerItem("topaz_boots",
            new ArmorItem(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(25))));

    public static final Item JADE_HELMET = registerItem("jade_helmet",
            new ModArmorItem(ModArmorMaterials.JADE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(25))));
    public static final Item JADE_CHESTPLATE = registerItem("jade_chestplate",
            new ArmorItem(ModArmorMaterials.JADE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(25))));
    public static final Item JADE_LEGGINGS = registerItem("jade_leggings",
            new ArmorItem(ModArmorMaterials.JADE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(25))));
    public static final Item JADE_BOOTS = registerItem("jade_boots",
            new ArmorItem(ModArmorMaterials.JADE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(25))));

    public static final Item ONYX_HELMET = registerItem("onyx_helmet",
            new ModArmorItem(ModArmorMaterials.ONYX_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage( 40))));
    public static final Item ONYX_CHESTPLATE = registerItem("onyx_chestplate",
            new ArmorItem(ModArmorMaterials.ONYX_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(40))));
    public static final Item ONYX_LEGGINGS = registerItem("onyx_leggings",
            new ArmorItem(ModArmorMaterials.ONYX_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(40))));
    public static final Item ONYX_BOOTS = registerItem("onyx_boots",
            new ArmorItem(ModArmorMaterials.ONYX_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(40))));

    public static final Item OPAL_HELMET = registerItem("opal_helmet",
            new ModArmorItem(ModArmorMaterials.OPAL_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(25))));
    public static final Item OPAL_CHESTPLATE = registerItem("opal_chestplate",
            new ArmorItem(ModArmorMaterials.OPAL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(25))));
    public static final Item OPAL_LEGGINGS = registerItem("opal_leggings",
            new ArmorItem(ModArmorMaterials.OPAL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(25))));
    public static final Item OPAL_BOOTS = registerItem("opal_boots",
            new ArmorItem(ModArmorMaterials.OPAL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(25))));

    public static final Item GARNET_HELMET = registerItem("garnet_helmet",
            new ModArmorItem(ModArmorMaterials.GARNET_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(25))));
    public static final Item GARNET_CHESTPLATE = registerItem("garnet_chestplate",
            new ArmorItem(ModArmorMaterials.GARNET_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(25))));
    public static final Item GARNET_LEGGINGS = registerItem("garnet_leggings",
            new ArmorItem(ModArmorMaterials.GARNET_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(25))));
    public static final Item GARNET_BOOTS = registerItem("garnet_boots",
            new ArmorItem(ModArmorMaterials.GARNET_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(25))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ReputationMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ReputationMod.LOGGER.info("Registering Mod Items for " + ReputationMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RUBY);
            entries.add(ONYX);
            entries.add(JADE);
            entries.add(OPAL);
            entries.add(SAPPHIRE);
            entries.add(TOPAZ);
            entries.add(GARNET);
        });
    }
}
