package net.rdteam.extremes.potion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rdteam.extremes.Extremes;
import net.rdteam.extremes.effect.ModStatusEffects;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

public class ModPotions extends Potion  {
    @Mixin(BrewingRecipeRegistry.class)
    public interface BrewingRecipeRegistryMixin {

        @Invoker("registerPotionRecipe")
        static void invokeRegisterPotionRecipe(Potion input, Item item, Potion output){
        }

    }

    public static final Potion DIANA_COKE = Registry.register(Registries.POTION, new Identifier(Extremes.MOD_ID, "diana_coke")
            , new Potion(new StatusEffectInstance(StatusEffects.HASTE, 3600, 1)
                    , new StatusEffectInstance(StatusEffects.SPEED, 3600,1)
                    , new StatusEffectInstance(StatusEffects.NAUSEA, 200,2)
                    , new StatusEffectInstance(StatusEffects.STRENGTH, 1200,0)
                    ,new StatusEffectInstance(ModStatusEffects.EXP, 400, 1,true,false, false)
            )

    );

    public static void registerPotions() {
    }

    public static void registerModPotionsRecipes() {
        Extremes.LOGGER.debug("Registering potions " + Extremes.MOD_ID);  
            BrewingRecipeRegistry.registerPotionRecipe(Potions.HEALING, Items.COCOA_BEANS, ModPotions.DIANA_COKE);

    }
}
