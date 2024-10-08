package net.andrew.testmod.init.worldgen.Biome;

import net.andrew.testmod.TestMod;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.carver.ConfiguredCarver;
import net.minecraft.world.gen.feature.*;


public class TestBiomesInit {
    public static final RegistryKey<Biome> HOBBIT_BIOME = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "hobbit_biome"));
    public static final RegistryKey<Biome> CRYSTAL_BIOME = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "crystal_biome"));
    public static final RegistryKey<Biome> CRYSTALELF_BIOME = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "crystalelf_biome"));
    public static final RegistryKey<Biome> LOWLANDS_BIOME = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "lowlands_biome"));
    public static final RegistryKey<Biome> DARKELF_FOREST = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "darkelf_forest"));
    public static final RegistryKey<Biome> SUNELF_FOREST = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "sunelf_forest"));
    public static final RegistryKey<Biome> SILVERELF_FOREST = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "silverelf_forest"));
    public static final RegistryKey<Biome> BREE_PLAINS = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "bree_plains"));
    public static final RegistryKey<Biome> GOLDELF_PLAINS = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "goldelf_plains"));
    public static final RegistryKey<Biome> ORC_PLAINS = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "orc_plains"));
    public static final RegistryKey<Biome> MORDOR_HIGHLANDS = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "mordor_highlands"));
    public static final RegistryKey<Biome>  ANGBAND_MIDLANDS= RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "angband_midlands"));
    public static final RegistryKey<Biome> ANGBAND_PITS = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "angband_pits"));
    public static final RegistryKey<Biome> ANGBAND_FOREST = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "angband_forest"));
    public static final RegistryKey<Biome> DARKLANDS = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "darklands"));
    public static final RegistryKey<Biome>  EIGHTPEAKS_MIDLANDS= RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "eightpeaks_midlands"));
    public static final RegistryKey<Biome> MORIA_BARRRENS = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "moria_barrens"));
    public static final RegistryKey<Biome> IORNDWARF_JAGGED =RegistryKey.of(RegistryKeys.BIOME,Identifier.of(TestMod.MOD_ID,"irondwarf_jagged"));
    public static final RegistryKey<Biome> ANGMAR_FOREST =RegistryKey.of(RegistryKeys.BIOME,Identifier.of(TestMod.MOD_ID, "angmar_forest"));
    public static final RegistryKey<Biome> HOWLING_FJORD =RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "holwing_frord"));
    public static final RegistryKey<Biome> ZANGARMARSH = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "zangarmarsh"));
    public static final RegistryKey<Biome>TEROKKAR_FOREST= RegistryKey.of(RegistryKeys.BIOME,Identifier.of(TestMod.MOD_ID,"terokkar_forest"));
    public static final RegistryKey<Biome> BLACKROCK_JAGGED= RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID,"blackrock_jagged"));
    public static final RegistryKey<Biome> BLOODSTONE_LANDS= RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID,"bloodstone_lands"));
    public static final RegistryKey<Biome> BARROWLANDS= RegistryKey.of(RegistryKeys.BIOME,Identifier.of(TestMod.MOD_ID, "barrowlands"));
    public static final RegistryKey<Biome> DROW_DEEP = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID,"drow_deep"));
    public static final RegistryKey<Biome> DEEP_WASTES = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID,"deep_wastes"));
    public static final RegistryKey<Biome> TREE_FOLK = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID,"tree_folk"));
    public static final RegistryKey<Biome> GODLEN_KINGDOM = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID,"godelm_kingdom"));
    public static final RegistryKey<Biome> TROLL_LAND = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID,"troll_lands"));
    public static final RegistryKey<Biome> DEAD_LAND = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "dead_land"));
    public static final RegistryKey<Biome> DEAD_BIOME = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "dead_biome"));
    public static final RegistryKey<Biome> DEAD_KINGDOM = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "dead_kingdom"));
    public static final RegistryKey<Biome> DRAGON_MOUNTAINS = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "dragon_mountains"));
    public static final RegistryKey<Biome> DUN_MOROGH = RegistryKey.of(RegistryKeys.BIOME,Identifier.of(TestMod.MOD_ID,"dun_morogh"));
    public static final RegistryKey<Biome> TREE_ELF = RegistryKey.of(RegistryKeys.BIOME,Identifier.of(TestMod.MOD_ID,"tree_elf"));
    public  static final RegistryKey<Biome> DUSKWOOD = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "duskwood"));
    public static final RegistryKey<Biome> HIGHMOUNTAINS = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "highmountains"));
    public static final RegistryKey<Biome> DUSTWALLOW = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "dustwallow"));
    public static final RegistryKey<Biome> BLADES_EDGE_MOUNTAINS = RegistryKey.of(RegistryKeys.BIOME,Identifier.of(TestMod.MOD_ID,"blades_edge_mountains"));
    public static final RegistryKey<Biome> FELWOOD = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID,"felwood"));
    public static final RegistryKey<Biome> WESTERN_PLAGUELANDS= RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID,"westren_plaguenlands"));
    public static final RegistryKey<Biome> EASTERN_PLAGUELANDS = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID,"easter_plaguenlands"));
    public static final RegistryKey<Biome> CRYSTALSONG_FOREST = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "crystal_forest"));
    public static final RegistryKey<Biome> SHING_PLAINS = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "shing_plains"));
    public static final RegistryKey<Biome> ROTHE_VALLEY = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "rothe_valley"));
    public static final RegistryKey<Biome> OWLHOLD = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID,"owlhold"));
    public static final RegistryKey<Biome> CURNA_MOUNTAINS = RegistryKey.of(RegistryKeys.BIOME,Identifier.of(TestMod.MOD_ID, "curna_mountains"));
    public static final RegistryKey<Biome> FOREST_GUNDAR = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "forest_gundar"));
    public static final RegistryKey<Biome> Gryphon_Mountains = RegistryKey.of(RegistryKeys.BIOME,Identifier.of(TestMod.MOD_ID, "gryphon_mountains"));
    public static final RegistryKey<Biome> DUSTWALL= RegistryKey.of(RegistryKeys.BIOME,Identifier.of(TestMod.MOD_ID, "dustwall"));
    public static final RegistryKey<Biome> UNDERLAND = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "underland"));
    public static final RegistryKey<Biome> DEAD_PITS= RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "dead_pits"));
    public static final RegistryKey<Biome> EVIL_WOODS= RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "evil_woods"));
    public static final RegistryKey<Biome> SUNFOREST= RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID,"sunforest"));




    private TestBiomesInit() {
    }


    public static void bootstrap(Registerable<Biome> biomeRegisterable) {
        RegistryEntryLookup<PlacedFeature> placedFeatures = biomeRegisterable.getRegistryLookup(RegistryKeys.PLACED_FEATURE);
        RegistryEntryLookup<ConfiguredCarver<?>> configuredCarvers = biomeRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER);



        biomeRegisterable.register(HOBBIT_BIOME, OverworldBiomeCreator.createPlains(placedFeatures, configuredCarvers, false, false, false));
        biomeRegisterable.register(CRYSTAL_BIOME, OverworldBiomeCreator.createPlains(placedFeatures, configuredCarvers, false, false, false));
        biomeRegisterable.register(TREE_ELF, OverworldBiomeCreator.createNormalForest(placedFeatures, configuredCarvers, true, true, true));
        biomeRegisterable.register(SUNELF_FOREST, OverworldBiomeCreator.createPlains(placedFeatures, configuredCarvers, false, false, false));
        biomeRegisterable.register(SILVERELF_FOREST,OverworldBiomeCreator.createNormalForest(placedFeatures,configuredCarvers,true, true, true));
        biomeRegisterable.register(LOWLANDS_BIOME,createExample());
        biomeRegisterable.register(IORNDWARF_JAGGED,OverworldBiomeCreator.createJaggedPeaks(placedFeatures, configuredCarvers));
        biomeRegisterable.register(DARKELF_FOREST, TheNetherBiomeCreator.createCrimsonForest(placedFeatures, configuredCarvers));
        biomeRegisterable.register(BREE_PLAINS, OverworldBiomeCreator.createPlains(placedFeatures, configuredCarvers, false, false, false));
        biomeRegisterable.register(GOLDELF_PLAINS, OverworldBiomeCreator.createPlains(placedFeatures, configuredCarvers, false, false, false));
        biomeRegisterable.register(ORC_PLAINS, OverworldBiomeCreator.createPlains(placedFeatures, configuredCarvers, false, false, false));
        biomeRegisterable.register(MORDOR_HIGHLANDS, createEndHighlands(placedFeatures));
        biomeRegisterable.register(ANGBAND_MIDLANDS, createEndMidlands());
        biomeRegisterable.register(ANGBAND_PITS, OverworldBiomeCreator.createPlains(placedFeatures, configuredCarvers, false, false, false));
        biomeRegisterable.register(ANGBAND_FOREST, OverworldBiomeCreator.createDarkForest(placedFeatures, configuredCarvers));
        biomeRegisterable.register(DARKLANDS, OverworldBiomeCreator.createDarkForest(placedFeatures, configuredCarvers));
        biomeRegisterable.register(EIGHTPEAKS_MIDLANDS, createEndMidlands());
        biomeRegisterable.register(MORIA_BARRRENS, createEndBarrens());
        biomeRegisterable.register(ANGMAR_FOREST, OverworldBiomeCreator.createPlains(placedFeatures, configuredCarvers, false, false, false));
        biomeRegisterable.register(CRYSTALELF_BIOME, OverworldBiomeCreator.createNormalForest(placedFeatures, configuredCarvers, true, true, true));
        biomeRegisterable.register(HOWLING_FJORD, OverworldBiomeCreator.createNormalForest(placedFeatures, configuredCarvers, true, true, true));
        biomeRegisterable.register(ZANGARMARSH, OverworldBiomeCreator.createJaggedPeaks(placedFeatures, configuredCarvers));
        biomeRegisterable.register(BLACKROCK_JAGGED, OverworldBiomeCreator.createJaggedPeaks(placedFeatures, configuredCarvers));
        biomeRegisterable.register(TEROKKAR_FOREST, OverworldBiomeCreator.createDarkForest(placedFeatures, configuredCarvers));
        biomeRegisterable.register(BLOODSTONE_LANDS, createEndMidlands());
        biomeRegisterable.register(BARROWLANDS, createEndMidlands());
        biomeRegisterable.register(DROW_DEEP, OverworldBiomeCreator.createDeepDark(placedFeatures, configuredCarvers));
        biomeRegisterable.register(DEEP_WASTES, OverworldBiomeCreator.createLushCaves(placedFeatures, configuredCarvers));
        biomeRegisterable.register(TREE_FOLK, OverworldBiomeCreator.createNormalForest(placedFeatures, configuredCarvers, true, true, true));
        biomeRegisterable.register(GODLEN_KINGDOM, OverworldBiomeCreator.createDripstoneCaves(placedFeatures, configuredCarvers));
        biomeRegisterable.register(DEAD_LAND, OverworldBiomeCreator.createDesert(placedFeatures, configuredCarvers));
        biomeRegisterable.register(DEAD_BIOME, OverworldBiomeCreator.createDesert(placedFeatures, configuredCarvers));
        biomeRegisterable.register(DEAD_KINGDOM,OverworldBiomeCreator.createDesert(placedFeatures, configuredCarvers));
        biomeRegisterable.register(TROLL_LAND, OverworldBiomeCreator.createDarkForest(placedFeatures, configuredCarvers));
        biomeRegisterable.register(DRAGON_MOUNTAINS, OverworldBiomeCreator.createJaggedPeaks(placedFeatures, configuredCarvers));
        biomeRegisterable.register(DUN_MOROGH, OverworldBiomeCreator.createJaggedPeaks(placedFeatures, configuredCarvers));
        biomeRegisterable.register(DUSKWOOD, OverworldBiomeCreator.createNormalForest(placedFeatures,configuredCarvers, true, true, true));
        biomeRegisterable.register(HIGHMOUNTAINS, OverworldBiomeCreator.createJaggedPeaks(placedFeatures, configuredCarvers));
        biomeRegisterable.register(DUSTWALLOW, OverworldBiomeCreator.createJungle(placedFeatures, configuredCarvers));
        biomeRegisterable.register(BLADES_EDGE_MOUNTAINS, OverworldBiomeCreator.createJaggedPeaks(placedFeatures, configuredCarvers));
        biomeRegisterable.register(FELWOOD, OverworldBiomeCreator.createSparseJungle(placedFeatures, configuredCarvers));
        biomeRegisterable.register(WESTERN_PLAGUELANDS, OverworldBiomeCreator.createNormalForest(placedFeatures, configuredCarvers, true, true,true));
        biomeRegisterable.register(EASTERN_PLAGUELANDS, OverworldBiomeCreator.createNormalForest(placedFeatures, configuredCarvers, true, true, true));
        biomeRegisterable.register(CRYSTALSONG_FOREST, OverworldBiomeCreator.createNormalForest(placedFeatures, configuredCarvers, true, true, true));
        biomeRegisterable.register(SHING_PLAINS, OverworldBiomeCreator.createPlains(placedFeatures, configuredCarvers, false, false, false));
        biomeRegisterable.register(ROTHE_VALLEY,OverworldBiomeCreator.createPlains(placedFeatures, configuredCarvers, false, false, false));
        biomeRegisterable.register(OWLHOLD, OverworldBiomeCreator.createPlains(placedFeatures, configuredCarvers, false, false, false));
        biomeRegisterable.register(CURNA_MOUNTAINS, OverworldBiomeCreator.createJaggedPeaks(placedFeatures, configuredCarvers));
        biomeRegisterable.register(FOREST_GUNDAR, OverworldBiomeCreator.createNormalForest(placedFeatures, configuredCarvers, true,true, true));
        biomeRegisterable.register(Gryphon_Mountains, OverworldBiomeCreator.createJaggedPeaks(placedFeatures, configuredCarvers));
        biomeRegisterable.register(DUSTWALL, OverworldBiomeCreator.createJaggedPeaks(placedFeatures, configuredCarvers));
        biomeRegisterable.register(UNDERLAND, OverworldBiomeCreator.createJaggedPeaks(placedFeatures, configuredCarvers));
        biomeRegisterable.register(DEAD_PITS, OverworldBiomeCreator.createDesert(placedFeatures, configuredCarvers));
        biomeRegisterable.register(SUNFOREST, OverworldBiomeCreator.createNormalForest(placedFeatures,configuredCarvers,true, true, true));
        biomeRegisterable.register(EVIL_WOODS, OverworldBiomeCreator.createDarkForest(placedFeatures, configuredCarvers));



    }


    private static Biome createExample() {
        return new Biome.Builder()
                .temperature(0.8f)
                .downfall(0.4f)
                .precipitation(false)
                .effects(


                        new BiomeEffects.Builder()
                                .skyColor(7907327)
                                .fogColor(12638463)
                                .waterColor(4159204)
                                .waterFogColor(329011)

                                .build()

 )
                .spawnSettings(
                new SpawnSettings.Builder().build()

                )
                .generationSettings(
                        new GenerationSettings.Builder().build()
                )
                .build();
    }

    private static Biome createEndHighlands(RegistryEntryLookup<PlacedFeature> placedFeatures) {
        GenerationSettings.Builder builder = new GenerationSettings.Builder()
                .feature(GenerationStep.Feature.SURFACE_STRUCTURES, placedFeatures.getOrThrow(EndPlacedFeatures.END_GATEWAY_RETURN));
        return composeEndSpawnSettings(builder);
    }

    private static Biome createEndMidlands() {
        GenerationSettings.Builder builder = (new GenerationSettings.Builder());
        return composeEndSpawnSettings(builder);
    }

    private static Biome createEndBarrens() {
        GenerationSettings.Builder builder = (new GenerationSettings.Builder());
        return composeEndSpawnSettings(builder);
    }

    private static Biome composeEndSpawnSettings(GenerationSettings.Builder builder) {
        SpawnSettings.Builder builder2 = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addPlainsMobs(builder2);
        return (new Biome.Builder()).precipitation(false).temperature(0.5F).downfall(0.5F).effects((new BiomeEffects.Builder()).waterColor(4159204).waterFogColor(329011).fogColor(10518688).skyColor(0).moodSound(
                BiomeMoodSound.CAVE).build()).spawnSettings(builder2.build()).generationSettings(builder.build()).build();

    }

    public static void load() {

    }
}
