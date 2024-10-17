package net.andrew.testmod.data.provider;

import net.andrew.testmod.init.BlockInit;
import net.andrew.testmod.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.family.BlockFamily;

public class TestModModModelProvider extends FabricModelProvider {
    public TestModModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.MITHRIL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.HOBBIT_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.MITHRIL_COBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.MITHRIL_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.MITHRIL_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.ANGBAND_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.ANGBND_COBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.ANGBAND_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.DROW_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.DROW_COBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.DROW_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.ORC_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.ORC_COBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.ORC_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.SKAVEN_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.SKAVEN_COBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.SKAVEN_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.DWARF_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.DWARF_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.DWARF_COBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.DWARFIRON_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.MORDOR_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.MORDOR_COBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.MORDOR_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.DEEPSLATE_MITHRIL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.ELF_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.DWARFRUBY_COBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.DWARFRUBY_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.DWARFRUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.DWARFSILVER_ORE);


        blockStateModelGenerator.registerLog(BlockInit.MITHRIL_LOG)
                .log(BlockInit.MITHRIL_LOG);
        blockStateModelGenerator.registerLog(BlockInit.SILVER_LOG)
                .log(BlockInit.SILVER_LOG);
        blockStateModelGenerator.registerLog(BlockInit.IRONWOOD_LOG)
                .log(BlockInit.IRONWOOD_LOG);
        blockStateModelGenerator.registerLog(BlockInit.SUNELF_LOG)
                .log(BlockInit.SUNELF_LOG);
        blockStateModelGenerator.registerLog(BlockInit.EVILWOOD_LOG)
                .log(BlockInit.EVILWOOD_LOG);
        blockStateModelGenerator.registerLog(BlockInit.DARKELF_LOG)
                .log(BlockInit.DARKELF_LOG);



        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.MITHRIL_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.IRONWOOD_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.SILVER_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.EVIL_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.SUNELF_LEAVES);
        blockStateModelGenerator.registerTintableCross(BlockInit.MITHRIL_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(BlockInit.SILVER_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(BlockInit.IRONWOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(BlockInit.EVIL_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(BlockInit.SUNELF_SAPLING,BlockStateModelGenerator.TintType.NOT_TINTED);

        var fantasy = new BlockFamily.Builder(BlockInit.SKAVEN_PLANKS)
                .unlockCriterionName("has_planks")
                .build();
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ItemInit.MITHRIL_ITEM, Models.GENERATED);
        itemModelGenerator.register(ItemInit.DWARFIRON_ITEM,Models.GENERATED);
        itemModelGenerator.register(ItemInit.DWARFRUDY_ITEM,Models.GENERATED);
    }
}
