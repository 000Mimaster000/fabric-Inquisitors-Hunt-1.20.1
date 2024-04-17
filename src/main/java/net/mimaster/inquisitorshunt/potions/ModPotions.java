package net.mimaster.inquisitorshunt.potions;

import net.mimaster.inquisitorshunt.effects.ModStatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPotions {
    public static final Potion WITHER_POTION =
            Registry.register(Registries.POTION, new Identifier("inquisitorshunt", "wither_potion"),
                    new Potion(new StatusEffectInstance(StatusEffects.WITHER, 3600 , 0)));
    public static final Potion LONG_WITHER_POTION =
            Registry.register(Registries.POTION, new Identifier("inquisitorshunt", "long_wither_potion"),
                    new Potion(new StatusEffectInstance(StatusEffects.WITHER, 9600 , 0)));
    public static final Potion STRONG_WITHER_POTION =
            Registry.register(Registries.POTION, new Identifier("inquisitorshunt", "strong_wither_potion"),
                    new Potion(new StatusEffectInstance(StatusEffects.WITHER, 1800 , 1)));
    public static final Potion EXPERIENCE_POTION =
            Registry.register(Registries.POTION, new Identifier("inquisitorshunt", "experience_potion"),
                    new Potion(new StatusEffectInstance(ModStatusEffect.EXPERIENCE, 100 , 0)));

    public static void registerPotions(){

    }

    public static void registerPotionsRecipes(){
       BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, Items.WITHER_ROSE, ModPotions.WITHER_POTION);
       BrewingRecipeRegistry.registerPotionRecipe(ModPotions.WITHER_POTION, Items.REDSTONE, ModPotions.LONG_WITHER_POTION);
       BrewingRecipeRegistry.registerPotionRecipe(ModPotions.WITHER_POTION, Items.GLOWSTONE_DUST, ModPotions.STRONG_WITHER_POTION);
       BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, Items.EXPERIENCE_BOTTLE, ModPotions.EXPERIENCE_POTION);
    }
}
