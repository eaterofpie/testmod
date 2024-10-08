package net.andrew.testmod.init.worldgen.Biome;

import com.mojang.datafixers.util.Pair;
import net.andrew.testmod.TestMod;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class OverworldRegionInit extends Region {

    public OverworldRegionInit(Identifier name, int weight) {
        super(name, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube,
            RegistryKey<Biome>>> mapper) {
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> {
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, TestBiomesInit.CRYSTAL_BIOME);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.PLAINS, TestBiomesInit.ORC_PLAINS);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.JAGGED_PEAKS, TestBiomesInit.IORNDWARF_JAGGED);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.JAGGED_PEAKS, TestBiomesInit.BLACKROCK_JAGGED);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.JAGGED_PEAKS, TestBiomesInit.Gryphon_Mountains);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.PLAINS, TestBiomesInit.BREE_PLAINS);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, TestBiomesInit.DARKELF_FOREST);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, TestBiomesInit.TEROKKAR_FOREST);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, TestBiomesInit.TREE_FOLK);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, TestBiomesInit.DUSKWOOD);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.JUNGLE, TestBiomesInit.DUSTWALLOW);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, TestBiomesInit.TROLL_LAND);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, TestBiomesInit.TREE_ELF);






        });
    }

}
