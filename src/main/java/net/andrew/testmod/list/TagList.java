package net.andrew.testmod.list;


import net.andrew.testmod.TestMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class TagList {
    public static class Blocks {
        public static final TagKey<Block> TEST_TAG = TagKey.of(RegistryKeys.BLOCK, TestMod.id("FANTASY"));

        public static final TagKey<Block> INCORRECT_FOR_EXAMPLE_TOOL =
                TagKey.of(RegistryKeys.BLOCK, TestMod.id("incorrect_for_example_tool"));

        public static final TagKey<Block> SILVER_LOGS = TagKey.of(RegistryKeys.BLOCK, TestMod.id("silver_logs"));
    }

    public static class Items {
        public static final TagKey<Item> MITHRIL_LOGS = TagKey.of(RegistryKeys.ITEM, TestMod.id("mithril_logs"));
    }
}
