package com.lumagrade.additionalfood;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AdditionalFood implements ModInitializer {
    public static final String MOD_ID = "additionalfood";

    public static final TagKey<Item> TEA_HERBS = TagKey.of(Registry.ITEM_KEY, new Identifier(MOD_ID, "tea_herbs"));

    @Override
    public void onInitialize() {
        //new Blocks();
        new Items();
        Blocks.registerBlocks();
        BlockItems.registerBlockItems();
    }
}