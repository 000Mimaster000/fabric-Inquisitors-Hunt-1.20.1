package net.mimaster.inquisitorshunt.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent BEER = new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).snack().alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 15*20, 0), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 15*20, 1), 0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 4*20, 0), 0.25f).build();
}
