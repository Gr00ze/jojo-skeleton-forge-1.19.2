package com.jojoskeleton.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.level.Level;

public class JojoSkeleton extends Skeleton {
    public static final AttributeSupplier attributes = Mob.createMobAttributes()
            .add(Attributes.MAX_HEALTH,100)
            .build();
    private int lastTickcount = 0;

    public JojoSkeleton(EntityType<? extends Skeleton> p_33002_, Level p_33003_) {
        super(p_33002_, p_33003_);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0,new FirstGoal(this));
    }

    private class FirstGoal extends Goal {
        JojoSkeleton js;
        SoundEvent jojo_attack = new SoundEvent(new ResourceLocation("jk:jojo_attack"));
        public FirstGoal(JojoSkeleton jojoSkeleton) {
            js = jojoSkeleton;
        }

        @Override
        public void tick() {
            super.tick();
            js.playSound(jojo_attack);
        }

        @Override
        public boolean canUse() {
                boolean playernear = js.level.getNearestPlayer(js,10)!=null;
                if (lastTickcount + 400 < tickCount){
                    lastTickcount = tickCount;
                    return playernear;
                }
            return  false;
        }

        @Override
        public boolean canContinueToUse() {
            return js.level.getNearestPlayer(js,10)!=null;
        }
    }
}
