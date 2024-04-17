package net.mimaster.inquisitorshunt.effects;

import net.mimaster.inquisitorshunt.InquisitorsHunt;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModStatusEffect extends StatusEffect {
    public static final StatusEffect EXPERIENCE = new ModStatusEffect();
    public ModStatusEffect(){
        super(
                StatusEffectCategory.BENEFICIAL,
                0x4AFF3D);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier){
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity,int amplifier){
        if(entity instanceof PlayerEntity){
            ((PlayerEntity) entity).addExperience(1<<amplifier);
        }
    }
    public static void registerEffects(){
        InquisitorsHunt.LOGGER.info("Registering effects to " + InquisitorsHunt.MOD_ID);
        Registry.register(Registries.STATUS_EFFECT, new Identifier("inquisitorshunt", "experience"), EXPERIENCE);
    }
}
