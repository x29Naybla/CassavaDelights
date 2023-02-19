package com.x29naybla.cassavadelights.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.Potions;

import java.util.function.Supplier;

public class ModFoods {
    public static final FoodProperties CASSAVA = (new FoodProperties.Builder()).nutrition(2).saturationMod(0F).build();
    public static final FoodProperties CUT_CASSAVA = (new FoodProperties.Builder()).nutrition(1).saturationMod(0F).build();
    public static final FoodProperties FRIED_CASSAVA = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.6F).build();
}
