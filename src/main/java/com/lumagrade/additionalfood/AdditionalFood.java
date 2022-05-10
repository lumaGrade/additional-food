package com.lumagrade.additionalfood;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class AdditionalFood implements ModInitializer {
    public static final String MOD_ID = "additionalfood";
    public static final Tag<Item> TEA_HERBS = TagRegistry.item(new Identifier(MOD_ID, "tea_herbs"));

    @Override
    public void onInitialize() {
        //new Blocks();
        new Items();
        Blocks.registerBlocks();
        BlockItems.registerBlockItems();
    }
}