package com.jojoskeleton.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class JojoSkeleton extends Monster {
    public static AttributeSupplier attributes = Mob.createMobAttributes()
            .add(Attributes.JUMP_STRENGTH,10)
            .add(Attributes.FOLLOW_RANGE,10)
            .add(Attributes.KNOCKBACK_RESISTANCE,200)
            .add(Attributes.MAX_HEALTH,100)
            .add(Attributes.MOVEMENT_SPEED,10)
            .build();

    protected JojoSkeleton(EntityType<? extends Monster> p_33002_, Level p_33003_) {
        super(p_33002_, p_33003_);
    }
}
