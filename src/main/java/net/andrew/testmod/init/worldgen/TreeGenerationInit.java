package net.andrew.testmod.init.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class TreeGenerationInit {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS, BiomeKeys.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, PlacedFeatureInit.IRONWOOD_TREE_KEY);
     BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS, BiomeKeys.JAGGED_PEAKS),
             GenerationStep.Feature.VEGETAL_DECORATION, PlacedFeatureInit.END_MORDOR_ORE_KEY);
     BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST, BiomeKeys.DARK_FOREST),
             GenerationStep.Feature.VEGETAL_DECORATION, PlacedFeatureInit.MITHRIL_TREE_KEY );
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST, BiomeKeys.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, PlacedFeatureInit.SUNELF_TREE_KEY );








    }
}
