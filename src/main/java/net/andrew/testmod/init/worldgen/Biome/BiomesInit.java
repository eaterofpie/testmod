package net.andrew.testmod.init.worldgen.Biome;

import net.andrew.testmod.TestMod;
import net.andrew.testmod.sound.SoundsInit;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.sound.MusicType;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

public class BiomesInit {
public static final RegistryKey<Biome> CRYSTAL_BIOME = RegistryKey.of(RegistryKeys.BIOME,
        Identifier.of(TestMod.MOD_ID, "crystal_biome"));
    public static final RegistryKey<Biome> ORC_FOREST = RegistryKey.of(RegistryKeys.BIOME,
            Identifier.of(TestMod.MOD_ID, "orc_forest"));





public static void boostrap(Registerable<Biome> context) {
    context.register(CRYSTAL_BIOME, crystal_biome(context));
    context.register(ORC_FOREST, orc_forest (context));


}

    public static void globalOverworldGeneration(GenerationSettings.LookupBackedBuilder builder) {
    DefaultBiomeFeatures.addLandCarvers(builder);
    DefaultBiomeFeatures.addAmethystGeodes(builder);
    DefaultBiomeFeatures.addDungeons(builder);
    DefaultBiomeFeatures.addMineables(builder);
    DefaultBiomeFeatures.addSprings(builder);
    DefaultBiomeFeatures.addFrozenTopLayer(builder);

}


public static Biome crystal_biome(Registerable<Biome> context) {
    SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
    spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.WOLF, 5, 4, 4));

    DefaultBiomeFeatures.addFarmAnimals(spawnBuilder);
    DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);

    GenerationSettings.LookupBackedBuilder biomeBuilder =
            new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                    context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

    globalOverworldGeneration(biomeBuilder);
    DefaultBiomeFeatures.addMossyRocks(biomeBuilder);
    DefaultBiomeFeatures.addDefaultOres(biomeBuilder);
    DefaultBiomeFeatures.addExtraGoldOre(biomeBuilder);


    return new Biome.Builder()
            .precipitation(true)
            .downfall(0.4f)
            .temperature(0.7f)
            .generationSettings(biomeBuilder.build())
            .spawnSettings(spawnBuilder.build())
            .effects((new BiomeEffects.Builder())
                    .waterColor(0xe82e3b)
                    .waterFogColor(0xbf1b26)
                    .skyColor(0x30c918)
                    .grassColor(0x7f03fc)
                    .foliageColor(0xd203fc)
                    .fogColor(0x22a1e6)
                    .moodSound(BiomeMoodSound.CAVE)
                    .music(MusicType.createIngameMusic(RegistryEntry.of(SoundsInit.BAR_BRAWL))).build())
            .build();
}
    public static Biome orc_forest(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.WOLF, 5, 4, 4));

        DefaultBiomeFeatures.addFarmAnimals(spawnBuilder);
        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        DefaultBiomeFeatures.addMossyRocks(biomeBuilder);
        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);
        DefaultBiomeFeatures.addExtraGoldOre(biomeBuilder);


        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.4f)
                .temperature(0.7f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(0xe82e3b)
                        .waterFogColor(0xbf1b26)
                        .skyColor(0x30c918)
                        .grassColor(0x7f03fc)
                        .foliageColor(0xd203fc)
                        .fogColor(0x22a1e6)
                        .moodSound(BiomeMoodSound.CAVE)
                        .music(MusicType.createIngameMusic(RegistryEntry.of(SoundsInit.BAR_BRAWL))).build())
                .build();
    }
    public static void load() {

    }

}

