package net.andrew.testmod.init.worldgen;

import net.andrew.testmod.TestMod;
import net.andrew.testmod.init.BlockInit;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class PlacedFeatureInit {
    public static final RegistryKey<PlacedFeature> OVERWORLD_MITHRIL_ORE_KEY = registerKey("overworld_mithril_ore");
    public static final RegistryKey<PlacedFeature> DWARF_STONE_KEY = registerKey("dwarf_stone");
    public static final RegistryKey<PlacedFeature> NETHER_ANGBAND_ORE_KEY = registerKey("nether_angband_ore");
    public static final RegistryKey<PlacedFeature> END_MORDOR_ORE_KEY = registerKey("end_mordor_ore");

    public static final RegistryKey<PlacedFeature> MITHRIL_TREE_KEY = registerKey("mithril_tree");
    public static final RegistryKey<PlacedFeature> SILVER_TREE_KEY = registerKey("silver_tree");
    public static final RegistryKey<PlacedFeature> IRONWOOD_TREE_KEY = registerKey("ironwood_tree");
    public static final RegistryKey<PlacedFeature> EVIL_TREE_KEY = registerKey("evil_tree");
    public static final RegistryKey<PlacedFeature> SUNELF_TREE_KEY = registerKey("sunelf_tree");


    public static void bootstrap(Registerable<PlacedFeature> context) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, OVERWORLD_MITHRIL_ORE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.OVERWORLD_MITHRIL_ORE_KEY),
                Modifiers.modifiersCount(9,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-24), YOffset.fixed(64))));

        register(context, DWARF_STONE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.DWARF_STONE_KEY),
               Modifiers.modifiersCount(7,
                       HeightRangePlacementModifier.uniform(YOffset.fixed(-13), YOffset.fixed(12))));

        register(context, NETHER_ANGBAND_ORE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.NETHER_ANGBAND_ORE_KEY),
                Modifiers.modifiersCount(9,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));

        register(context, END_MORDOR_ORE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.END_MORDOR_ORE_KEY),
                Modifiers.modifiersCount(9,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));


        register(context, MITHRIL_TREE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.MITHRIL_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.2f, 3),
                        BlockInit.MITHRIL_SAPLING));


        register(context, SILVER_TREE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.SILVER_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.2f, 3),
                        BlockInit.SILVER_SAPLING));

        register(context, IRONWOOD_TREE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.IRONWOOD_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.2f, 3),
                        BlockInit.IRONWOOD_SAPLING));

        register(context, EVIL_TREE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.EVIL_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.2f, 3),
                        BlockInit.EVIL_SAPLING));

        register(context, SUNELF_TREE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.SUNELF_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.2f, 3),
                        BlockInit.SUNELF_SAPLING));
    }

    private static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, TestMod.id(name));
    }

    private static void register(Registerable<PlacedFeature> context,
                                 RegistryKey<PlacedFeature> key,
                                 RegistryEntry<ConfiguredFeature<?, ?>> config,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(config, List.copyOf(modifiers)));
    }

    public static class Modifiers {
        public static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
            return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
        }

        public static List<PlacementModifier> modifiersCount(int count, PlacementModifier heightModifier) {
            return modifiers(CountPlacementModifier.of(count), heightModifier);
        }

        public static List<PlacementModifier> modifiersRarity(int chance, PlacementModifier heightModifier) {
            return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
        }
    }
}

