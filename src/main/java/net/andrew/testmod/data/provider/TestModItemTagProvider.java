package net.andrew.testmod.data.provider;


import net.andrew.testmod.init.BlockInit;
import net.andrew.testmod.list.TagList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;


import java.util.Calendar;
import java.util.concurrent.CompletableFuture;

public class TestModItemTagProvider extends FabricTagProvider<Item> {
    public TestModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(BlockInit.MITHRIL_LEAVES.asItem());
        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(BlockInit.SILVER_LEAVES.asItem());
        getOrCreateTagBuilder(TagList.Items.MITHRIL_LOGS)
                .add(BlockInit.MITHRIL_LOG.asItem());
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .addTag(TagList.Items.MITHRIL_LOGS);
        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(BlockInit.IRONWOOD_LEAVES.asItem());
        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(BlockInit.EVIL_LEAVES.asItem());






    }
}
