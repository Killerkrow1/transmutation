package net.killerkrow.transmutation.util;

import net.killerkrow.transmutation.Transmutation;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModStatusEffects {
    public static final StatusEffect SHIMMERING = new ShimmeringEffect();

    public static void initialize() {
        Registry.register(Registries.STATUS_EFFECT, new Identifier(Transmutation.MOD_ID, "shimmering"), SHIMMERING);

        Transmutation.LOGGER.info("Registering Effects For " + Transmutation.MOD_ID);
    }

}