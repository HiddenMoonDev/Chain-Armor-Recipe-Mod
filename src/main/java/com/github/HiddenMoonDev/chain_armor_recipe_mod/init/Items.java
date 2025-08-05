package com.github.HiddenMoonDev.chain_armor_recipe_mod.init;

import com.github.HiddenMoonDev.chain_armor_recipe_mod.item.ItemIronNugget;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import com.google.common.base.CaseFormat;

public class Items {
    public static Item ironNugget;

    public static void preInit() {
        ironNugget = new ItemIronNugget();

        register(ironNugget, "ironNugget");
    }

    public static void register(Item item, String name) {
        String itemName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, name);
        item.setUnlocalizedName(itemName);
        item.setTextureName("chain_armor_recipe_mod:" + itemName);
        GameRegistry.registerItem(item, itemName);
    }
}
