package net.killerkrow.transmutation.util;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent SHIMMERING_APPLE = new FoodComponent.Builder().alwaysEdible().hunger(8).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(
                    StatusEffects.SATURATION, 600), 1)
            .statusEffect(new StatusEffectInstance(
                    StatusEffects.ABSORPTION, 3000,2),  1)
            .statusEffect(new StatusEffectInstance(
                    StatusEffects.REGENERATION, 400, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(
                    ModStatusEffects.SHIMMERING, 6000, 1), 1.0F)
            .build();

    public static final FoodComponent ENCHANTED_SHIMMERING_APPLE = new FoodComponent.Builder().alwaysEdible().hunger(8).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(
                    StatusEffects.SATURATION, 600), 1)
            .statusEffect(new StatusEffectInstance(
                    StatusEffects.ABSORPTION, 3000,2),  1)
            .statusEffect(new StatusEffectInstance(
                    StatusEffects.REGENERATION, 400, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(
                    StatusEffects.RESISTANCE, 400, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(
                    StatusEffects.FIRE_RESISTANCE, 400, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(
                    ModStatusEffects.SHIMMERING, 6000, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1), 1.0F)
            .build();

}
