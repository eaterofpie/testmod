package net.andrew.testmod.init.worldgen.Biome;

import net.andrew.testmod.init.worldgen.PlacedFeatureInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.block.Blocks;
import net.minecraft.registry.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

public class DataGeneratorEntrypoint implements net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint {
    public static final RegistryKey<ConfiguredFeature<?, ?>> COMMON_DESERT_WELL = RegistryKey.of(
            RegistryKeys.CONFIGURED_FEATURE,
            Identifier.of(String.valueOf(TestBiomesInit.ANGBAND_FOREST), "fab_desert_well")
    );
    public static final RegistryKey<PlacedFeature> PLACED_COMMON_DESERT_WELL = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE,
            Identifier.of(String.valueOf(TestBiomesInit.ANGBAND_MIDLANDS), "fab_desert_well")
    );
    public static final RegistryKey<ConfiguredFeature<?, ?>> COMMON_ORE = RegistryKey.of(
            RegistryKeys.CONFIGURED_FEATURE,
            Identifier.of(String.valueOf(TestBiomesInit.ANGBAND_PITS), "common_ore")
    );
    public static final RegistryKey<PlacedFeature> PLACED_COMMON_ORE = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE,
            Identifier.of(String.valueOf(PlacedFeatureInit.EVIL_TREE_KEY)));





    private void bootstrapConfiguredFeatures(Registerable<ConfiguredFeature<?, ?>> registerable) {
        ConfiguredFeatures.register(registerable, COMMON_DESERT_WELL, Feature.DESERT_WELL);

        OreFeatureConfig featureConfig = new OreFeatureConfig(new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES), Blocks.ACACIA_SAPLING.getDefaultState(), 5);
        ConfiguredFeatures.register(registerable, COMMON_ORE, Feature.ORE, featureConfig);
    }


    private void bootstrapPlacedFeatures(Registerable<PlacedFeature> registerable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> configuredFeatures = registerable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        RegistryEntry<ConfiguredFeature<?, ?>> commonDesertWell = configuredFeatures.getOrThrow(COMMON_DESERT_WELL);

        // The placement config is taken from the vanilla desert well, but no randomness
        PlacedFeatures.register(registerable, PLACED_COMMON_DESERT_WELL, commonDesertWell,
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()
        );

        PlacedFeatures.register(registerable, PLACED_COMMON_ORE, configuredFeatures.getOrThrow(COMMON_ORE),
                CountPlacementModifier.of(25),
                HeightRangePlacementModifier.uniform(
                        YOffset.BOTTOM,
                        YOffset.TOP
                )
        );
    }

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

    }
}



