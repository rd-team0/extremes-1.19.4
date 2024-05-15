package net.rdteam.extremes.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rdteam.extremes.Extremes;
import net.rdteam.extremes.entity.custom.CubeEntity;

public class ModEntity {

    public static final EntityType<CubeEntity> MOSS_GOLEM = Registry.register(Registries.ENTITY_TYPE, new Identifier(Extremes.MOD_ID, "moss_golem"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CubeEntity::new).dimensions(EntityDimensions.fixed(1f,1f)).build()
            );

    public static void registerModEntity() {
        Extremes.LOGGER.info("registering entity " + Extremes.MOD_ID);
    }
}
