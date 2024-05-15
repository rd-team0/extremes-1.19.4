package net.rdteam.extremes.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rdteam.extremes.Extremes;
import net.rdteam.extremes.effect.custom.ExpStatusEffect;

public class ModStatusEffects {
    public static final StatusEffect EXP = new ExpStatusEffect();
    public static final StatusEffect EXP_STATUS_EFFECT =  Registry.register(Registries.STATUS_EFFECT, new Identifier(Extremes.MOD_ID, "exp_status_effect"), EXP);

}
