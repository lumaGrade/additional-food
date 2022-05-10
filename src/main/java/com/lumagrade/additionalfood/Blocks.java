package com.lumagrade.additionalfood;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Blocks {

    // public static final CarrotCakeBlock CARROT_CAKE;
    public static final CarrotCakeBlock CARROT_CAKE = new CarrotCakeBlock(FabricBlockSettings.of(Material.CAKE).strength(0.5f, 0.75f));


    //static {
    //    CARROT_CAKE = register("carrot_cake", new CarrotCakeBlock(FabricBlockSettings.of(Material.CAKE).strength(0.5f, 0.75f)));
    //}

    //private static CarrotCakeBlock register(String id, CarrotCakeBlock block) {
    //    return Registry.register(Registry.BLOCK, new Identifier(AdditionalFood.MOD_ID, id), block);
    //}
    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(AdditionalFood.MOD_ID, "carrot_cake"), CARROT_CAKE);
    }
}
