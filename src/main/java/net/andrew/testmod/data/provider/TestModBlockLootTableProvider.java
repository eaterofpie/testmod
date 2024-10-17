package net.andrew.testmod.data.provider;


import net.andrew.testmod.init.BlockInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class TestModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public TestModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(BlockInit.ANGBAND_ORE);
        addDrop(BlockInit.ANGBAND_STONE);
        addDrop(BlockInit.DWARF_STONE);
        addDrop(BlockInit.ANGBND_COBBLE);
        addDrop(BlockInit.MITHRIL_COBBLE);
        addDrop(BlockInit.MITHRIL_ORE);
        addDrop(BlockInit.MITHRIL_STONE);
        addDrop(BlockInit.MORDOR_ORE);
        addDrop(BlockInit.MORDOR_COBBLE);
        addDrop(BlockInit.MORDOR_STONE);
        addDrop(BlockInit.MITHRIL_LOG);
        addDrop(BlockInit.SILVER_LEAVES);
        addDrop(BlockInit.SILVER_LOG);
        addDrop(BlockInit.IRONWOOD_LOG);
        addDrop(BlockInit.EVILWOOD_LOG);
        addDrop(BlockInit.SUNELF_LOG);
        addDrop(BlockInit.DWARF_BRICK);
        addDrop(BlockInit.DWARF_COBBLE);
        addDrop(BlockInit.DWARFIRON_STONE);
        addDrop(BlockInit.MITHRIL_BRICK);
        addDrop(BlockInit.DEEPSLATE_MITHRIL_ORE);
        addDrop(BlockInit.DROW_COBBLE);
        addDrop(BlockInit.DROW_STONE);
        addDrop(BlockInit.DROW_BRICK);
        addDrop(BlockInit.ORC_STONE);
        addDrop(BlockInit.ORC_COBBLE);
        addDrop(BlockInit.ORC_BRICK);
        addDrop(BlockInit.SKAVEN_STONE);
        addDrop(BlockInit.SKAVEN_COBBLE);
        addDrop(BlockInit.SKAVEN_BRICK);
        addDrop(BlockInit.SKAVEN_PLANKS);
        addDrop(BlockInit.ELF_STONE);
        addDrop(BlockInit.HOBBIT_ORE);
        addDrop(BlockInit.DWARFRUBY_COBBLE);
        addDrop(BlockInit.DWARFRUBY_STONE);
        addDrop(BlockInit.DWARFRUBY_ORE);
        addDrop(BlockInit.DWARFSILVER_ORE);
        addDrop(BlockInit.DARKELF_LOG);

    }
}

