package net.andrew.testmod.sound;

import net.andrew.testmod.TestMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class SoundsInit {


    public static final SoundEvent BAR_BRAWL = registerSoundEvent("bar_brawl");





    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(TestMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        TestMod.LOGGER.info("Registering Sounds for " + TestMod.MOD_ID);
    }
    public static void load() {

    }
}

