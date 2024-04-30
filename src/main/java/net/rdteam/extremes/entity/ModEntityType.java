package net.rdteam.extremes.entity;

import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.rdteam.extremes.Extremes;

public class ModEntityType extends EntityType{


    public ModEntityType(EntityFactory factory, SpawnGroup spawnGroup, boolean saveable, boolean summonable, boolean fireImmune, boolean spawnableFarFromPlayer, ImmutableSet canSpawnInside, EntityDimensions dimensions, int maxTrackDistance, int trackTickInterval, FeatureSet requiredFeatures) {
        super(factory, spawnGroup, saveable, summonable, fireImmune, spawnableFarFromPlayer, canSpawnInside, dimensions, maxTrackDistance, trackTickInterval, requiredFeatures);
    }


    public static void registerEntityType() {
        Extremes.LOGGER.info("registering entity types" + Extremes.MOD_ID);
    }
}
