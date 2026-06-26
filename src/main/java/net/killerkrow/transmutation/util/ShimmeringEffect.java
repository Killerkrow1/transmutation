package net.killerkrow.transmutation.util;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.LivingEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.World;

public class ShimmeringEffect extends StatusEffect {
    public ShimmeringEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0xFF00FF);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        World world = entity.getWorld();

        if (world.isClient) {
            double x = entity.getX();
            double y = entity.getY() + entity.getHeight() / 2.0; // entitiys center
            double z = entity.getZ();

            for(int i = 0; i < 2; i++) {
                world.addParticle(
                        ParticleTypes.TOTEM_OF_UNDYING,
                        x + (world.random.nextDouble() - 0.5) * 7.0,
                        y + (world.random.nextDouble() - 0.5) * 7.0,
                        z + (world.random.nextDouble() - 0.5) * 7.0,
                        0.0, // x velocity
                        0.0, // y velocity
                        0.0  // z velocity
                );
            }
        }
    }
}