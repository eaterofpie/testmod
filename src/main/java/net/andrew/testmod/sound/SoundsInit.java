package net.andrew.testmod.sound;

import net.andrew.testmod.TestMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class SoundsInit {
    public static final SoundEvent SOUND_BLOCK_BREAK = registerSoundEvent("sound_block_break");
    public static final SoundEvent SOUND_BLOCK_STEP = registerSoundEvent("sound_block_step");
    public static final SoundEvent SOUND_BLOCK_PLACE = registerSoundEvent("sound_block_place");
    public static final SoundEvent SOUND_BLOCK_HIT = registerSoundEvent("sound_block_hit");
    public static final SoundEvent SOUND_BLOCK_FALL = registerSoundEvent("sound_block_fall");

    public static final SoundEvent BAR_BRAWL = registerSoundEvent("bar_brawl");

    public static final BlockSoundGroup SOUND_BLOCK_SOUNDS = new BlockSoundGroup(1f, 1f,
            SoundsInit.SOUND_BLOCK_BREAK, SoundsInit.SOUND_BLOCK_STEP, SoundsInit.SOUND_BLOCK_PLACE,
    SoundsInit.SOUND_BLOCK_HIT, SoundsInit.SOUND_BLOCK_FALL);



    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(TestMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        TestMod.LOGGER.info("Registering Sounds for " + TestMod.MOD_ID);
    }
}

