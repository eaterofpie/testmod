package net.andrew.testmod.init;

import net.andrew.testmod.TestMod;
import net.andrew.testmod.init.worldgen.ConfiguredFeatureInit;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;

import java.util.Optional;

public class BlockInit {
    public static final Block DWARF_BRICK = registerWithItem("dwarf_brick", new Block(AbstractBlock.Settings.create().strength(9F)));
    public static final Block MITHRIL_BRICK = registerWithItem("mithril_brick", new Block(AbstractBlock.Settings.create().strength(1.6F)));
    public static final Block MITHRIL_COBBLE =registerWithItem("mithril_cobble", new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block MITHRIL_ORE =registerWithItem("mithril_ore", new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block MITHRIL_STONE =registerWithItem("mithril_stone", new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 4)));
    public static final Block ANGBAND_ORE =registerWithItem("angband_ore", new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block ANGBND_COBBLE =registerWithItem("angband_cobble", new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 9)));
    public static final Block ANGBAND_STONE =registerWithItem("angband_stone", new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block MORDOR_ORE =registerWithItem("mordor_ore", new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block MORDOR_COBBLE =registerWithItem("mordor_cobble", new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block MORDOR_STONE =registerWithItem("mordor_stone", new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block DEEPSLATE_MITHRIL_ORE =registerWithItem("deepslate_mithril_ore", new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block DWARF_STONE =registerWithItem("dwarf_stone", new Block(AbstractBlock.Settings.create().strength(1.4F).requiresTool()));
    public static final Block MITHRIL_LOG = registerWithItem("mithril_log",new PillarBlock(AbstractBlock.Settings.create().requiresTool().strength(1.5F)));
    public static final Block SILVER_LOG = registerWithItem("silver_log", new PillarBlock(AbstractBlock.Settings.create().strength(1.5F).requiresTool()));
    public static final Block IRONWOOD_LOG = registerWithItem("ironwood_log", new PillarBlock (AbstractBlock.Settings.create().strength(1.5F).requiresTool()));
    public static final Block EVILWOOD_LOG = registerWithItem("evilwood_log", new PillarBlock(AbstractBlock.Settings.create().strength(5F).requiresTool()));
    public static final Block SUNELF_LOG = registerWithItem("sunelf_log", new PillarBlock(AbstractBlock.Settings.create().requiresTool().strength(1.5F)));
     public static final LeavesBlock MITHRIL_LEAVES = registerWithItem("mithril_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PINK)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static final LeavesBlock SILVER_LEAVES = registerWithItem("silver_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PINK)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static final LeavesBlock IRONWOOD_LEAVES = registerWithItem("irnwood_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PINK)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static final LeavesBlock EVIL_LEAVES = registerWithItem("evil_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PINK)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static final LeavesBlock SUNELF_LEAVES = registerWithItem("sunelf_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PINK)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static final SaplingBlock MITHRIL_SAPLING = registerWithItem("mithril_sapling",
            new SaplingBlock(
                    new SaplingGenerator(
                            TestMod.id("mithril_sapling").toString(),
                            2.1F,
                            Optional.empty(),
                            Optional.empty(),
                            Optional.of(ConfiguredFeatureInit.MITHRIL_TREE_KEY),
                            Optional.empty(),
                            Optional.empty(),
                            Optional.empty()
                    ),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .ticksRandomly()
                            .strength(0.0F)
                            .sounds(BlockSoundGroup.GRASS)
                            .nonOpaque()
                            .allowsSpawning(Blocks::canSpawnOnLeaves)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .solidBlock(Blocks::never)
                            .noCollision()));

    public static final SaplingBlock SILVER_SAPLING = registerWithItem("silver_sapling",
            new SaplingBlock(
                    new SaplingGenerator(
                            TestMod.id("silver_sapling").toString(),
                            2.6F,
                            Optional.empty(),
                            Optional.empty(),
                            Optional.of(ConfiguredFeatureInit.SILVER_TREE_KEY),
                            Optional.empty(),
                            Optional.empty(),
                            Optional.empty()
                    ),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .ticksRandomly()
                            .strength(0.0F)
                            .sounds(BlockSoundGroup.GRASS)
                            .nonOpaque()
                            .allowsSpawning(Blocks::canSpawnOnLeaves)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .solidBlock(Blocks::never)
                            .noCollision()));

    public static final SaplingBlock IRONWOOD_SAPLING = registerWithItem("ironwood_sapling",
            new SaplingBlock(
                    new SaplingGenerator(
                            TestMod.id("ironwood_sapling").toString(),
                            2.2F,
                            Optional.empty(),
                            Optional.empty(),
                            Optional.of(ConfiguredFeatureInit.IRONWOOD_TREE_KEY),
                            Optional.empty(),
                            Optional.empty(),
                            Optional.empty()
                    ),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .ticksRandomly()
                            .strength(0.0F)
                            .sounds(BlockSoundGroup.GRASS)
                            .nonOpaque()
                            .allowsSpawning(Blocks::canSpawnOnLeaves)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .solidBlock(Blocks::never)
                            .noCollision()));

    public static final SaplingBlock EVIL_SAPLING = registerWithItem("evil_sapling",
            new SaplingBlock(
                    new SaplingGenerator(
                            TestMod.id("evil_sapling").toString(),
                            2.1F,
                            Optional.empty(),
                            Optional.empty(),
                            Optional.of(ConfiguredFeatureInit.EVIL_TREE_KEY),
                            Optional.empty(),
                            Optional.empty(),
                            Optional.empty()
                    ),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .ticksRandomly()
                            .strength(0.0F)
                            .sounds(BlockSoundGroup.GRASS)
                            .nonOpaque()
                            .allowsSpawning(Blocks::canSpawnOnLeaves)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .solidBlock(Blocks::never)
                            .noCollision()));
    public static final SaplingBlock SUNELF_SAPLING = registerWithItem("sunelf_sapling",
            new SaplingBlock(
                    new SaplingGenerator(
                            TestMod.id("sunelf_sapling").toString(),
                            2.1F,
                            Optional.empty(),
                            Optional.empty(),
                            Optional.of(ConfiguredFeatureInit.SUNELF_TREE_KEY),
                            Optional.empty(),
                            Optional.empty(),
                            Optional.empty()
                    ),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .ticksRandomly()
                            .strength(0.0F)
                            .sounds(BlockSoundGroup.GRASS)
                            .nonOpaque()
                            .allowsSpawning(Blocks::canSpawnOnLeaves)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .solidBlock(Blocks::never)
                            .noCollision()));

    public static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, TestMod.id(name), block);
    }

    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        T registered = register(name, block);
        ItemInit.register(name, new BlockItem(registered, settings));
        return registered;
    }

    public static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Settings());
    }
    public static void load() {
    }
}



