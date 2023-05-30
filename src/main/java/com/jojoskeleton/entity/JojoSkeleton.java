package com.jojoskeleton.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class JojoSkeleton extends Monster {
    public static final AttributeSupplier attributes = Mob.createMobAttributes()
            .add(Attributes.MAX_HEALTH,100)
            .add(Attributes.ARMOR,100)
            .add(Attributes.ARMOR_TOUGHNESS,100)
            .add(Attributes.JUMP_STRENGTH,10)
            .add(Attributes.KNOCKBACK_RESISTANCE,100)
            .add(Attributes.MOVEMENT_SPEED,2)
            .build();
    public int lastTickcount = 0;
    SoundEvent jojo_attack = new SoundEvent(new ResourceLocation("jk:jojo_attack"));
    public boolean soundon = false;

    public JojoSkeleton(EntityType<? extends JojoSkeleton> p_33002_, Level p_33003_) {
        super(p_33002_, p_33003_);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        //this.goalSelector.addGoal(0,new FirstGoal(this));
    }

    @Override
    public void tick() {
        super.tick();
        Player near = level.getNearestPlayer(this,10);
        boolean isplayernear = near!=null;
        //vengono riprodotti 2 volte ma sembra 1 ""\_ 0 u 0 _/"" probabilmente client & server

        if ((!soundon || lastTickcount + 4000 < tickCount) && isplayernear){
            soundon = true;
            lastTickcount = tickCount;
            float volume = 1,pitch = 0.5F;
            //playSound(jojo_attack);
            //level.playSound(near,this,jojo_attack, SoundSource.NEUTRAL,volume,pitch);
            level.playLocalSound(this.getX(),this.getY(),this.getZ(),jojo_attack,SoundSource.HOSTILE,volume,pitch,true);
            System.out.println("Entity jk: "+this+" play sound ");
        }
        if(isDeadOrDying()){
            this.soundon=false;
        }




    }

    private class FirstGoal extends Goal {
        JojoSkeleton js;

        public FirstGoal(JojoSkeleton jojoSkeleton) {
            js = jojoSkeleton;
        }

        @Override
        public void tick() {
            super.tick();
            


        }

        @Override
        public boolean canUse() {
                return  false;
        }

        @Override
        public boolean canContinueToUse() {
            return js.level.getNearestPlayer(js,10)!=null;
        }
    }
}
