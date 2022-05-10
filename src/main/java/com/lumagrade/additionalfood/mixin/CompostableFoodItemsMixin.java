package com.lumagrade.additionalfood.mixin;

import com.lumagrade.additionalfood.BlockItems;
import com.lumagrade.additionalfood.Items;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.ItemConvertible;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ComposterBlock.class)
public class CompostableFoodItemsMixin {
    @Inject(at = @At("TAIL"), method = "Lnet/minecraft/block/ComposterBlock;registerDefaultCompostableItems()V")
    private static void registerCompostableFoods(CallbackInfo info) {
        registerCompostableItem(1.0F, Items.APPLE_PIE);
        registerCompostableItem(1.0F, Items.SWEETBERRY_PIE);
        registerCompostableItem(1.0F, Items.GLOWBERRY_PIE);
        registerCompostableItem(0.85F, Items.SWEETBERRY_COOKIE);
        registerCompostableItem(0.85F, Items.GLOWBERRY_COOKIE);
        registerCompostableItem(0.85F, Items.CHEESE);
        registerCompostableItem(1.0F, Items.PANCAKES);
        registerCompostableItem(0.85F, Items.CHEESE_BREAD);
        registerCompostableItem(1.0F, BlockItems.CARROT_CAKE);
    }
    @Shadow
    private static void registerCompostableItem(float levelIncreaseChance, ItemConvertible item){}

}

