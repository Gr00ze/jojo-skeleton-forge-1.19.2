package com.jojoskeleton.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.level.Level;

public class JojoSkeleton extends Skeleton {
    public static final AttributeSupplier attributes = Mob.createMobAttributes()
            .add(Attributes.MAX_HEALTH,100)
            .build();

    public JojoSkeleton(EntityType<? extends Skeleton> p_33002_, Level p_33003_) {
        super(p_33002_, p_33003_);
    }
}
