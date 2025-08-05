package com.github.HiddenMoonDev.chain_armor_recipe_mod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static com.github.HiddenMoonDev.chain_armor_recipe_mod.init.Items.*;


public class Recipes {

    private Recipes() {}

    public static void preInit() {
        //Adds crafting recipe form vanilla 1.11 iron nuggets recipe
        GameRegistry.addRecipe(new ItemStack(Items.iron_ingot), "III","III","III", 'I', ironNugget);
        GameRegistry.addShapelessRecipe(new ItemStack(ironNugget, 9), Items.iron_ingot);

        //Adds crafting receipt for chain armor :D
        GameRegistry.addRecipe(new ItemStack(Items.chainmail_boots), "I I", "I I", 'I', ironNugget);
        GameRegistry.addRecipe(new ItemStack(Items.chainmail_chestplate), "I I", "III", "III", 'I', ironNugget);
        GameRegistry.addRecipe(new ItemStack(Items.chainmail_leggings), "III", "I I", "I I", 'I', ironNugget);
        GameRegistry.addRecipe(new ItemStack(Items.chainmail_helmet), "III", "I I", 'I', ironNugget);

        //Adds smelting recipe for furnace :)

        // I love free XP <3

        //Iron tools
        GameRegistry.addSmelting(Items.iron_hoe, new ItemStack(ironNugget, 18), 0.5f);
        GameRegistry.addSmelting(Items.iron_axe, new ItemStack(ironNugget, 27), 0.5f);
        GameRegistry.addSmelting(Items.iron_shovel, new ItemStack(ironNugget, 9), 0.5f);
        GameRegistry.addSmelting(Items.iron_sword, new ItemStack(ironNugget, 18), 0.5f);
        GameRegistry.addSmelting(Items.iron_pickaxe, new ItemStack(ironNugget, 27), 0.5f);

        //Iron armor
        GameRegistry.addSmelting(Items.iron_boots, new ItemStack(ironNugget, 36), 0.5f);
        GameRegistry.addSmelting(Items.iron_chestplate, new ItemStack(ironNugget, 72), 0.5f);
        GameRegistry.addSmelting(Items.iron_helmet, new ItemStack(ironNugget, 45), 0.5f);
        GameRegistry.addSmelting(Items.iron_horse_armor, new ItemStack(ironNugget, 54), 0.5f);
        GameRegistry.addSmelting(Items.iron_leggings, new ItemStack(ironNugget, 63), 0.5f);

        // Chain armor
        GameRegistry.addSmelting(Items.chainmail_boots, new ItemStack(ironNugget, 4), 0.5f);
        GameRegistry.addSmelting(Items.chainmail_helmet, new ItemStack(ironNugget, 5), 0.5f);
        GameRegistry.addSmelting(Items.chainmail_chestplate, new ItemStack(ironNugget, 8), 0.5f);
        GameRegistry.addSmelting(Items.chainmail_leggings, new ItemStack(ironNugget, 7), 0.5f);

        // Iron blocks
        GameRegistry.addSmelting(Blocks.iron_block, new ItemStack(ironNugget, 81), 5f);
        GameRegistry.addSmelting(Blocks.iron_door, new ItemStack(ironNugget, 54), 5f); //Sadly game don't want to smelt iron door :(
        GameRegistry.addSmelting(Blocks.iron_bars, new ItemStack(ironNugget, 54), 5f);
        GameRegistry.addSmelting(Blocks.anvil, new ItemStack(ironNugget, 279), 10f);
    }
}
