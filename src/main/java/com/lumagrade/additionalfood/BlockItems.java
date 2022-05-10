package com.lumagrade.additionalfood;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class BlockItems {

    public static final BlockItem CARROT_CAKE = new BlockItem(Blocks.CARROT_CAKE, new Item.Settings().group(ItemGroup.FOOD));

    public static void registerBlockItems(){
        Registry.register(Registry.ITEM, new Identifier(AdditionalFood.MOD_ID, "carrot_cake"), CARROT_CAKE);
    }

}
