package com.lumagrade.additionalfood;

import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FoodItems_Deprecated {

    /*
    public static final Item SWEETBERRY_COOKIE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.SWEETBERRY_COOKIE));
    public static final Item GLOWBERRY_COOKIE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.GLOWBERRY_COOKIE));
    public static final SoupItem VEGETABLE_SOUP = new SoupItem(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.VEGETABLE_SOUP));
    public static final SoupItem PUMPKIN_SOUP = new SoupItem(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.PUMPKIN_SOUP));
    public static final SoupItem SALMON_SOUP = new SoupItem(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.SALMON_SOUP));
    public static final SoupItem PORRIDGE = new SoupItem(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.PORRIDGE));
    public static final Item APPLE_PIE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.APPLE_PIE));
    public static final Item SWEETBERRY_PIE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.SWEETBERRY_PIE));
    public static final Item GLOWBERRY_PIE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.GLOWBERRY_PIE));
    public static final Item CHEESE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.CHEESE));
    public static final Item SMOKED_BEETROOT = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.SMOKED_BEETROOT));
    public static final Item SMOKED_CARROT = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.SMOKED_CARROT));
    public static final Item FRIED_EGG = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.FRIED_EGG));
    public static final Item PANCAKES = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.PANCAKES));
    public static final SoupItem CHOCOLATE_ICECREAM = new SoupItem(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.CHOCOLATE_ICECREAM));
    public static final Item PUMPKIN_SPICE_LATTE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.PUMPKIN_SPICE_LATTE));
    public static final Item MILKSHAKE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.MILKSHAKE));
    public static final Item CHEESE_BREAD = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.CHEESE_BREAD));
   */
    public static final BlockItem CARROT_CAKE = new BlockItem(Blocks.CARROT_CAKE, new Item.Settings().group(ItemGroup.FOOD));

    /* public static final PotionItem TEST_POTIsdON = new PotionItem(new Item.Settings().group(ItemGroup.BREWING));
    public static final PotionItem KOE = new PotionItem((new Item.Settings()).maxCount(1).group(ItemGroup.BREWING));
    public static final DrinkItem CUSTOM_DRINK = new DrinkItem(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.CUSTOM_DRINK));*/



    public static void registerItems(){
/*
        Registry.register(Registry.ITEM, new Identifier(AdditionalFood.MOD_ID, "sweetberry_cookie"), SWEETBERRY_COOKIE);
        Registry.register(Registry.ITEM, new Identifier(AdditionalFood.MOD_ID, "glowberry_cookie"), GLOWBERRY_COOKIE);
        Registry.register(Registry.ITEM, new Identifier(AdditionalFood.MOD_ID, "vegetable_soup"), VEGETABLE_SOUP);
        Registry.register(Registry.ITEM, new Identifier(AdditionalFood.MOD_ID, "pumpkin_soup"), PUMPKIN_SOUP);
        Registry.register(Registry.ITEM, new Identifier(AdditionalFood.MOD_ID, "salmon_soup"), SALMON_SOUP);
        Registry.register(Registry.ITEM, new Identifier(AdditionalFood.MOD_ID, "porridge"), PORRIDGE);
        Registry.register(Registry.ITEM, new Identifier(AdditionalFood.MOD_ID, "apple_pie"), APPLE_PIE);
        Registry.register(Registry.ITEM, new Identifier(AdditionalFood.MOD_ID, "sweetberry_pie"), SWEETBERRY_PIE);
        Registry.register(Registry.ITEM, new Identifier(AdditionalFood.MOD_ID, "glowberry_pie"), GLOWBERRY_PIE);
        Registry.register(Registry.ITEM, new Identifier(AdditionalFood.MOD_ID, "cheese"), CHEESE);
        Registry.register(Registry.ITEM, new Identifier(AdditionalFood.MOD_ID, "smoked_beetroot"), SMOKED_BEETROOT);
        Registry.register(Registry.ITEM, new Identifier(AdditionalFood.MOD_ID, "smoked_carrot"), SMOKED_CARROT);
        Registry.register(Registry.ITEM, new Identifier(AdditionalFood.MOD_ID, "fried_egg"), FRIED_EGG);
        Registry.register(Registry.ITEM, new Identifier(AdditionalFood.MOD_ID, "pancakes"), PANCAKES);
        Registry.register(Registry.ITEM, new Identifier(AdditionalFood.MOD_ID, "chocolate_icecream"), CHOCOLATE_ICECREAM);
        Registry.register(Registry.ITEM, new Identifier(AdditionalFood.MOD_ID, "pumpkin_spice_latte"), PUMPKIN_SPICE_LATTE);
        Registry.register(Registry.ITEM, new Identifier(AdditionalFood.MOD_ID, "milkshake"), MILKSHAKE);
        Registry.register(Registry.ITEM, new Identifier(AdditionalFood.MOD_ID, "cheese_bread"), CHEESE_BREAD);
*/
        Registry.register(Registry.ITEM, new Identifier(AdditionalFood.MOD_ID, "carrot_cake"), CARROT_CAKE);

       // Registry.register(Registry.ITEM, new Identifier(AdditionalFood.MOD_ID, "custom_drink"), CUSTOM_DRINK);
    }
}
