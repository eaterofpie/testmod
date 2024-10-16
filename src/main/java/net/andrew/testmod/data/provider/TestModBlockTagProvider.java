package net.andrew.testmod.data.provider;

import net.andrew.testmod.init.BlockInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class TestModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public TestModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(BlockInit.ANGBAND_ORE)
                .add(BlockInit.ANGBAND_STONE)
                .add(BlockInit.ANGBND_COBBLE)
                .add(BlockInit.ELF_STONE)
                .add(BlockInit.HOBBIT_ORE)
                .add(BlockInit.DROW_STONE)
                .add(BlockInit.DROW_COBBLE)
                .add(BlockInit.DROW_BRICK)
                .add(BlockInit.ORC_STONE)
                .add(BlockInit.ORC_COBBLE)
                .add(BlockInit.ORC_BRICK)
                .add(BlockInit.SKAVEN_STONE)
                .add(BlockInit.SKAVEN_COBBLE)
                .add(BlockInit.SKAVEN_BRICK)
                .add(BlockInit.MITHRIL_ORE)
                .add(BlockInit.MITHRIL_COBBLE)
                .add(BlockInit.MITHRIL_STONE)
                .add(BlockInit.MITHRIL_BRICK)
                .add(BlockInit.MORDOR_ORE)
                .add(BlockInit.MORDOR_COBBLE)
                .add(BlockInit.DWARF_STONE)
                .add(BlockInit.DWARF_BRICK)
                .add(BlockInit.DROW_COBBLE)
                .add(BlockInit.DWARFIRON_STONE)
                .add(BlockInit.MITHRIL_LOG)
                .add(BlockInit.MITHRIL_LEAVES)
                .add(BlockInit.SILVER_LOG)
                .add(BlockInit.SILVER_LEAVES)
                .add(BlockInit.IRONWOOD_LOG)
                .add(BlockInit.IRONWOOD_LEAVES)
                .add(BlockInit.DEEPSLATE_MITHRIL_ORE)
                .add(BlockInit.DWARFRUBY_COBBLE)
                .add(BlockInit.DWARFRUBY_STONE)
                .add(BlockInit.DWARFRUBY_ORE)
                .add(BlockInit.DWARFSILVER_ORE)
                .add(BlockInit.MORDOR_STONE);

        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(BlockInit.MITHRIL_SAPLING)
                .add(BlockInit.IRONWOOD_SAPLING)
                .add(BlockInit.SILVER_SAPLING);
        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(BlockInit.SILVER_LEAVES)
                .add(BlockInit.IRONWOOD_LEAVES)
                .add(BlockInit.EVIL_LEAVES)
                .add(BlockInit.MITHRIL_LEAVES);
        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(BlockInit.SILVER_LOG)
                .add(BlockInit.IRONWOOD_LOG)
                .add(BlockInit.EVILWOOD_LOG)
                .add(BlockInit.SUNELF_LOG)
                .add(BlockInit.MITHRIL_LOG);
        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(BlockInit.SKAVEN_PLANKS);










    }
}
