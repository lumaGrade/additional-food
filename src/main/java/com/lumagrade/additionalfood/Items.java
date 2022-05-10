package com.lumagrade.additionalfood;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items {

    public static final Item SWEETBERRY_COOKIE;
    public static final Item GLOWBERRY_COOKIE;
    public static final SoupItem VEGETABLE_SOUP;
    public static final SoupItem PUMPKIN_SOUP;
    public static final SoupItem SALMON_SOUP;
    public static final SoupItem PORRIDGE;
    public static final Item APPLE_PIE;
    public static final Item SWEETBERRY_PIE;
    public static final Item GLOWBERRY_PIE;
    public static final Item CHEESE;
    public static final Item SMOKED_BEETROOT;
    public static final Item SMOKED_CARROT;
    public static final Item FRIED_EGG;
    public static final Item PANCAKES;
    public static final SoupItem CHOCOLATE_ICECREAM;
    public static final DrinkItem PUMPKIN_SPICE_LATTE;
    public static final DrinkItem MILKSHAKE;
    public static final DrinkItem HOT_CHOCOLATE;
    public static final Item CHEESE_BREAD;
    public static final DrinkItem TEA;
    public static final DrinkItem APPLE_JUICE;
    public static final DrinkItem SWEETBERRY_JUICE;
    public static final DrinkItem GLOWBERRY_JUICE;
    //public static final BlockItem CARROT_CAKE = register("carrot_cake", new BlockItem(Blocks.CARROT_CAKE, new Item.Settings().group(ItemGroup.FOOD)));
    //public static final BlockItem CARROT_CAKE = new BlockItem(Blocks.CARROT_CAKE, new Item.Settings().group(ItemGroup.FOOD));

    static {
        SWEETBERRY_COOKIE =  register("sweetberry_cookie", new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.SWEETBERRY_COOKIE)));
        GLOWBERRY_COOKIE = register("glowberry_cookie", new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.GLOWBERRY_COOKIE)));
        VEGETABLE_SOUP = register("vegetable_soup", new SoupItem(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.VEGETABLE_SOUP)));
        PUMPKIN_SOUP = register("pumpkin_soup", new SoupItem(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.PUMPKIN_SOUP)));
        SALMON_SOUP = register("salmon_soup", new SoupItem(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.SALMON_SOUP)));
        PORRIDGE = register("porridge", new SoupItem(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.PORRIDGE)));
        APPLE_PIE = register("apple_pie", new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.APPLE_PIE)));
        SWEETBERRY_PIE = register("sweetberry_pie", new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.SWEETBERRY_PIE)));
        GLOWBERRY_PIE = register("glowberry_pie", new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.GLOWBERRY_PIE)));
        CHEESE = register("cheese", new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.CHEESE)));
        SMOKED_BEETROOT = register("smoked_beetroot", new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.SMOKED_BEETROOT)));
        SMOKED_CARROT = register("smoked_carrot", new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.SMOKED_CARROT)));
        FRIED_EGG = register("fried_egg", new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.FRIED_EGG)));
        PANCAKES = register("pancakes", new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.PANCAKES)));
        CHOCOLATE_ICECREAM = register("chocolate_icecream", new SoupItem(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.CHOCOLATE_ICECREAM)));
        PUMPKIN_SPICE_LATTE = register("pumpkin_spice_latte", new DrinkItem(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.PUMPKIN_SPICE_LATTE)));
        MILKSHAKE = register("milkshake", new DrinkItem(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.MILKSHAKE)));
        HOT_CHOCOLATE = register("hot_chocolate", new DrinkItem(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.HOT_CHOCOLATE)));
        CHEESE_BREAD = register("cheese_bread",  new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.CHEESE_BREAD)));
        TEA = register("tea", new DrinkItem(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.TEA)));
        APPLE_JUICE = register("apple_juice", new DrinkItem(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.APPLE_JUICE)));
        SWEETBERRY_JUICE = register("sweetberry_juice", new DrinkItem(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.SWEETBERRY_JUICE)));
        GLOWBERRY_JUICE = register("glowberry_juice", new DrinkItem(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.GLOWBERRY_JUICE)));
        // CARROT_CAKE = register("carrot_cake", new BlockItem(Blocks.CARROT_CAKE, new Item.Settings().group(ItemGroup.FOOD)));
    }

    private static Item register(String id, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AdditionalFood.MOD_ID, id), item);
    }

    private static SoupItem register(String id, SoupItem item) {
        return Registry.register(Registry.ITEM, new Identifier(AdditionalFood.MOD_ID, id), item);
    }

    //public static void registerCakeItem(){
    //    Registry.register(Registry.ITEM, new Identifier(AdditionalFood.MOD_ID, "carrot_cake"), CARROT_CAKE);
    //}

    // private static BlockItem register(String id, BlockItem item) {
    //   return Registry.register(Registry.ITEM, new Identifier(AdditionalFood.MOD_ID, id), item);
    // }

    private static DrinkItem register(String id, DrinkItem item) {
        return Registry.register(Registry.ITEM, new Identifier(AdditionalFood.MOD_ID, id), item);
    }

}
