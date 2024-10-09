package net.andrew.testmod.init.worldgen;

import net.andrew.testmod.TestMod;
import net.andrew.testmod.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.registry.*;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.DarkOakTrunkPlacer;


import java.util.List;

public class ConfiguredFeatureInit {

    public static final RegistryKey<ConfiguredFeature<?, ?>> OVERWORLD_MITHRIL_ORE_KEY = registerKey("overworld_mithril_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DWARF_STONE_KEY = registerKey("dwarf_stone_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_ANGBAND_ORE_KEY = registerKey("nether_angband_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_MORDOR_ORE_KEY = registerKey("end_mordor_ore");



    public static final RegistryKey<ConfiguredFeature<?, ?>> MITHRIL_TREE_KEY = registerKey("mithril_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SILVER_TREE_KEY = registerKey("silver_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> IRONWOOD_TREE_KEY = registerKey("ironwood_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EVIL_TREE_KEY = registerKey("evil_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SUNELF_TREE_KEY = registerKey("sunelf_tree");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneOreReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateOreReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherOreReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endOreReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldMithrilTargets = List.of(
                OreFeatureConfig.createTarget(stoneOreReplaceables, BlockInit.MITHRIL_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(stoneOreReplaceables, BlockInit.DWARF_STONE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateOreReplaceables, BlockInit.DEEPSLATE_MITHRIL_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherAngbandTargets = List.of(
                OreFeatureConfig.createTarget(netherOreReplaceables, BlockInit.ANGBAND_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> endExampleTargets = List.of(
                OreFeatureConfig.createTarget(endOreReplaceables, BlockInit.MORDOR_ORE.getDefaultState()));

        register(context, OVERWORLD_MITHRIL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMithrilTargets, 9));
        register(context, DWARF_STONE_KEY, Feature.ORE, new OreFeatureConfig(overworldMithrilTargets,8));
        register(context, NETHER_ANGBAND_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherAngbandTargets, 9));
        register(context, END_MORDOR_ORE_KEY, Feature.ORE, new OreFeatureConfig(endExampleTargets, 9));

        RegistryEntryLookup<PlacedFeature> registryLookup = context.getRegistryLookup(RegistryKeys.PLACED_FEATURE);


        register(context, MITHRIL_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                SimpleBlockStateProvider.of(BlockInit.MITHRIL_LOG), // log
                new DarkOakTrunkPlacer(4, 4, 6), // baseHeight, firstRandomHeight, secondRandomHeight

                SimpleBlockStateProvider.of(BlockInit.MITHRIL_LEAVES), // leaves
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2), // radius, offset, height

                new TwoLayersFeatureSize(3, 0, 3) // limit, lowerSize, upperSize
        ).build());

        register(context, SILVER_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                SimpleBlockStateProvider.of(BlockInit.SILVER_LOG), // log
                new DarkOakTrunkPlacer(4, 4, 6), // baseHeight, firstRandomHeight, secondRandomHeight

                SimpleBlockStateProvider.of(BlockInit.SILVER_LEAVES), // leaves
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2), // radius, offset, height

                new TwoLayersFeatureSize(3, 0, 3) // limit, lowerSize, upperSize
        ).build());

        register(context, IRONWOOD_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                SimpleBlockStateProvider.of(BlockInit.IRONWOOD_LOG), // log
                new DarkOakTrunkPlacer(4, 4, 6), // baseHeight, firstRandomHeight, secondRandomHeight

                SimpleBlockStateProvider.of(BlockInit.IRONWOOD_LEAVES), // leaves
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2), // radius, offset, height

                new TwoLayersFeatureSize(3, 0, 3) // limit, lowerSize, upperSize
        ).build());


        register(context, EVIL_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                SimpleBlockStateProvider.of(BlockInit.EVILWOOD_LOG), // log
                new DarkOakTrunkPlacer(4, 4, 6), // baseHeight, firstRandomHeight, secondRandomHeight

                SimpleBlockStateProvider.of(BlockInit.EVIL_LEAVES), // leaves
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2), // radius, offset, height

                new TwoLayersFeatureSize(3, 0, 3) // limit, lowerSize, upperSize


        ).build());
        register(context, SUNELF_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                SimpleBlockStateProvider.of(BlockInit.SUNELF_LOG), // log
                new DarkOakTrunkPlacer(4, 4, 6), // baseHeight, firstRandomHeight, secondRandomHeight

                SimpleBlockStateProvider.of(BlockInit.SUNELF_LEAVES), // leaves
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2), // radius, offset, height

                new TwoLayersFeatureSize(3, 0, 3) // limit, lowerSize, upperSize


        ).build());


    }



    private static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, TestMod.id(name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key,
                                                                                   F feature,
                                                                                   FC featureConfig) {
        context.register(key, new ConfiguredFeature<>(feature, featureConfig));
    }
}

