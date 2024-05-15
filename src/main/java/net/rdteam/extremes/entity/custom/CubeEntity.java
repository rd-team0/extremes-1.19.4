package net.rdteam.extremes.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.Angerable;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public class CubeEntity extends PathAwareEntity implements Angerable {


    public CubeEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createCubeAttributes(){
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 6)
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 30)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.4f)
                .add(EntityAttributes.GENERIC_ARMOR, 5.5f)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 7d);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0,new SwimGoal(this));
        this.goalSelector.add(4,new WanderAroundFarGoal(this, 1d));
        this.goalSelector.add(5,new LookAtEntityGoal(this,PlayerEntity.class, 4f));
        this.goalSelector.add(2,new LookAroundGoal(this));
        this.targetSelector.add(6,new RevengeGoal(this, new Class[0]).setGroupRevenge(new Class[0]));
    }

    @Override
    public int getAngerTime() {
        return 0;
    }

    @Override
    public void setAngerTime(int angerTime) {
    }

    @Nullable
    @Override
    public UUID getAngryAt() {
        return this.attackingPlayer.getUuid();
    }

    @Override
    public void setAngryAt(@Nullable UUID angryAt) {

    }

    @Override
    public void chooseRandomAngerTime() {

    }
}
