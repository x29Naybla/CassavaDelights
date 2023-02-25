package com.x29naybla.cassavadelights.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties CASSAVA = (new FoodProperties.Builder()).nutrition(2).saturationMod(0F).build();
    public static final FoodProperties CUT_CASSAVA = (new FoodProperties.Builder()).nutrition(1).saturationMod(0F).build();
    public static final FoodProperties FRIED_CASSAVA = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.6F).build();
    public static final FoodProperties TAPIOCA_CREPE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).build();
    public static final FoodProperties CHEESE_BUNS = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.2F).build();
}
