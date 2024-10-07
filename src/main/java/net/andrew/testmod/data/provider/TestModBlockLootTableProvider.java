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
        addDrop(BlockInit.DEEPSLATE_MITHRIL_ORE);

    }
}

