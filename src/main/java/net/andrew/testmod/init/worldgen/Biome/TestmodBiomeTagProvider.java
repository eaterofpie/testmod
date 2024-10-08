package net.andrew.testmod.init.worldgen.Biome;

import net.andrew.testmod.TestMod;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;

import java.util.concurrent.CompletableFuture;

public  class TestmodBiomeTagProvider extends FabricTagProvider<Biome> {
    /**
     * Constructs a new {@link FabricTagProvider} with the default computed path.
     *
     * <p>Common implementations of this class are provided.
     *
     * @param output           the {@link FabricDataOutput} instance
     * @param registryKey
     * @param registriesFuture the backing registry for the tag type
     */
    public TestmodBiomeTagProvider(FabricDataOutput output, RegistryKey<? extends Registry<Biome>> registryKey, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registryKey, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "biome_tag_test")))
                .add(TestBiomesInit.ORC_PLAINS)
                .add(TestBiomesInit.CRYSTALELF_BIOME)
                .add(TestBiomesInit.CRYSTAL_BIOME)
                .add(TestBiomesInit.HOBBIT_BIOME)
                .add(TestBiomesInit.BREE_PLAINS)
                .add(TestBiomesInit.DARKELF_FOREST)
                .add(TestBiomesInit.GOLDELF_PLAINS)
                .add(TestBiomesInit.IORNDWARF_JAGGED)
                .add(TestBiomesInit.SILVERELF_FOREST)
                .add(TestBiomesInit.SUNELF_FOREST)
                .add(TestBiomesInit.ANGBAND_MIDLANDS)
                .add(TestBiomesInit.MORIA_BARRRENS)
                .add(TestBiomesInit.EIGHTPEAKS_MIDLANDS)
                .add(TestBiomesInit.ANGMAR_FOREST)
                .add(TestBiomesInit.TEROKKAR_FOREST)
                .add(TestBiomesInit.MORDOR_HIGHLANDS);
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, Identifier.of(TestMod.MOD_ID, "tag_selector_test")))
                .add(BiomeKeys.BEACH)
                .add(BiomeKeys.DESERT)
                .add(BiomeKeys.SAVANNA)
                .add(TestBiomesInit.CRYSTAL_BIOME)
                .add(TestBiomesInit.CRYSTALELF_BIOME)
                .add(TestBiomesInit.LOWLANDS_BIOME)
                .add(TestBiomesInit.HOBBIT_BIOME)
                .add(TestBiomesInit.EIGHTPEAKS_MIDLANDS)
                .add(TestBiomesInit.MORIA_BARRRENS)
                .add(TestBiomesInit.SUNELF_FOREST)
                .add(TestBiomesInit.SILVERELF_FOREST)
                .add(TestBiomesInit.ANGBAND_MIDLANDS)
                .add(TestBiomesInit.MORDOR_HIGHLANDS)
                .add(TestBiomesInit.IORNDWARF_JAGGED)
                .add(TestBiomesInit.ZANGARMARSH)
                .add(TestBiomesInit.BLACKROCK_JAGGED)
                .add(TestBiomesInit.GOLDELF_PLAINS)
                .add(TestBiomesInit.DARKELF_FOREST)
                .add(TestBiomesInit.ANGMAR_FOREST)
                .add(TestBiomesInit.TEROKKAR_FOREST)
                .add(TestBiomesInit.DROW_DEEP)
                .add(TestBiomesInit.DEEP_WASTES)
                .add(TestBiomesInit.TREE_FOLK)
                .add(TestBiomesInit.DEAD_LAND)
                .add(TestBiomesInit.DRAGON_MOUNTAINS)
                .add(TestBiomesInit.DUN_MOROGH)
                .add(TestBiomesInit.HIGHMOUNTAINS)
                .add(TestBiomesInit.DUSKWOOD)
                .add(TestBiomesInit.BLADES_EDGE_MOUNTAINS)
                .add(TestBiomesInit.FELWOOD)
                .add(TestBiomesInit.GODLEN_KINGDOM)
                .add(TestBiomesInit.WESTERN_PLAGUELANDS)
                .add(TestBiomesInit.EASTERN_PLAGUELANDS)
                .add(TestBiomesInit.CRYSTALSONG_FOREST)
                .add(TestBiomesInit.SHING_PLAINS)
                .add(TestBiomesInit.ROTHE_VALLEY)
                .add(TestBiomesInit.ANGBAND_FOREST)
                .add(TestBiomesInit.ANGBAND_PITS)
                .add(TestBiomesInit.DEAD_BIOME)
                .add(TestBiomesInit.DEAD_KINGDOM)
                .add(TestBiomesInit.DEAD_PITS)
                .add(BiomeKeys.FOREST)
                .add(BiomeKeys.PLAINS)
                .add(BiomeKeys.BADLANDS);

    }
    public static void load() {

    }

}


