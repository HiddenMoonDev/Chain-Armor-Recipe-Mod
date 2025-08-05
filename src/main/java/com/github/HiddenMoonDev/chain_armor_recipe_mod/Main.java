package com.github.HiddenMoonDev.chain_armor_recipe_mod;

import com.github.HiddenMoonDev.chain_armor_recipe_mod.init.Items;
import com.github.HiddenMoonDev.chain_armor_recipe_mod.init.Recipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "chain_armor_recipe_mod", useMetadata = true)
public class Main {
    @SuppressWarnings("unused")
    public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "111229022024";

    @Mod.EventHandler
    @SuppressWarnings("MethodMayBeStatic")
    public void preInit(FMLPreInitializationEvent event) {
        Items.preInit();
        Recipes.preInit();
    }
}