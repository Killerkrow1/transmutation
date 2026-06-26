package net.killerkrow.transmutation.util;

import net.killerkrow.transmutation.Transmutation;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent TRANSMUTATION = registerSoundEvent("transmutation");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Transmutation.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        Transmutation.LOGGER.info("Registering Sounds for " + Transmutation.MOD_ID);
    }
}
