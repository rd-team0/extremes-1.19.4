package net.rdteam.extremes.entity.custom;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.rdteam.extremes.Extremes;

public class MobCubeEntity extends PathAwareEntity {

    protected MobCubeEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    public static final EntityType<MobCubeEntity> CUBE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier("cube_entity", "cube"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, MobCubeEntity::new).dimensions(EntityDimensions.fixed(1,1)).build()
    );
    public static void registerCubeEntity(){
        Extremes.LOGGER.info("registering cube entity " + Extremes.MOD_ID);
        FabricDefaultAttributeRegistry.register(CUBE, MobCubeEntity.createMobAttributes());
    }
}
