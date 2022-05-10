package com.lumagrade.additionalfood;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class FoodComponents {

    public static final FoodComponent SWEETBERRY_COOKIE = (new FoodComponent.Builder()).hunger(2).saturationModifier(.4f).build();
    public static final FoodComponent GLOWBERRY_COOKIE = (new FoodComponent.Builder()).hunger(2).saturationModifier(.4f).build();
    public static final FoodComponent VEGETABLE_SOUP = (new FoodComponent.Builder()).hunger(6).saturationModifier(7.2f).build();
    public static final FoodComponent PUMPKIN_SOUP = (new FoodComponent.Builder()).hunger(6).saturationModifier(7.2f).build();
    public static final FoodComponent SALMON_SOUP = (new FoodComponent.Builder()).hunger(8).saturationModifier(7.2f).build();
    public static final FoodComponent PORRIDGE = (new FoodComponent.Builder()).hunger(6).saturationModifier(7.2f).build();
    public static final FoodComponent APPLE_PIE = (new FoodComponent.Builder()).hunger(8).saturationModifier(4.8f).build();
    public static final FoodComponent SWEETBERRY_PIE = (new FoodComponent.Builder()).hunger(8).saturationModifier(4.8f).build();
    public static final FoodComponent GLOWBERRY_PIE = (new FoodComponent.Builder()).hunger(8).saturationModifier(4.8f).build();
    public static final FoodComponent CHEESE = (new FoodComponent.Builder()).hunger(3).saturationModifier(1.8f).build();
    public static final FoodComponent SMOKED_BEETROOT = (new FoodComponent.Builder()).hunger(5).saturationModifier(6f).build();
    public static final FoodComponent SMOKED_CARROT = (new FoodComponent.Builder()).hunger(5).saturationModifier(6f).build();
    public static final FoodComponent FRIED_EGG = (new FoodComponent.Builder()).hunger(5).saturationModifier(6f).build();
    public static final FoodComponent PANCAKES = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.6f).build();
    public static final FoodComponent CHOCOLATE_ICECREAM = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent PUMPKIN_SPICE_LATTE = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.5f).build();
    public static final FoodComponent MILKSHAKE = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.5f).build();
    public static final FoodComponent HOT_CHOCOLATE = (new FoodComponent.Builder()).hunger(3).saturationModifier(0.5f).build();
    public static final FoodComponent CHEESE_BREAD = (new FoodComponent.Builder()).hunger(6).saturationModifier(6f).build();
    public static final FoodComponent TEA = (new FoodComponent.Builder()).hunger(1).saturationModifier(0.1f).statusEffect( new StatusEffectInstance(StatusEffects.REGENERATION, 600, 0), 1f).build();
    public static final FoodComponent APPLE_JUICE = (new FoodComponent.Builder()).hunger(1).saturationModifier(0.1f).statusEffect( new StatusEffectInstance(StatusEffects.REGENERATION, 600, 0), 1f).build();
    public static final FoodComponent SWEETBERRY_JUICE = (new FoodComponent.Builder()).hunger(1).saturationModifier(0.1f).statusEffect( new StatusEffectInstance(StatusEffects.REGENERATION, 600, 0), 1f).build();
    public static final FoodComponent GLOWBERRY_JUICE = (new FoodComponent.Builder()).hunger(1).saturationModifier(0.1f).statusEffect( new StatusEffectInstance(StatusEffects.REGENERATION, 600, 0), 1f).build();
}
