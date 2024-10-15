package net.andrew.testmod.data.provider;

import net.andrew.testmod.init.BlockInit;
import net.andrew.testmod.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class TestModRecipeProvider extends FabricRecipeProvider {
    public TestModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInit.MITHRIL_COBBLE)
                .input('E', ItemInit.MITHRIL_ITEM)
                .pattern("EE")
                .pattern("EE")

                .criterion(hasItem(ItemInit.MITHRIL_ITEM), conditionsFromItem(ItemInit.MITHRIL_ITEM))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInit.MITHRIL_STONE)
                .input('E', BlockInit.MITHRIL_COBBLE)
                .pattern("EE")
                .pattern("EE")

                .criterion(hasItem(BlockInit.MITHRIL_COBBLE), conditionsFromItem(BlockInit.MITHRIL_COBBLE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInit.MITHRIL_BRICK)
                .input('E', BlockInit.MITHRIL_STONE)
                .pattern("EE")
                .pattern("EE")

                .criterion(hasItem(BlockInit.MITHRIL_STONE), conditionsFromItem(BlockInit.MITHRIL_STONE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInit.DWARF_COBBLE)
                .input('D', ItemInit.DWARFIRON_ITEM)
                .pattern("DD")
                .pattern("DD")

                .criterion(hasItem(ItemInit.DWARFIRON_ITEM), conditionsFromItem(ItemInit.MITHRIL_ITEM))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInit.DWARF_STONE)
                .input('D', BlockInit.DWARF_COBBLE)
                .pattern("DD")
                .pattern("DD")
                .criterion(hasItem(BlockInit.DWARF_COBBLE), conditionsFromItem(BlockInit.DWARF_COBBLE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInit.DWARF_BRICK)
                .input('D', BlockInit.DWARF_STONE)
                .pattern("DD")
                .pattern("DD")
                .criterion(hasItem(BlockInit.DWARF_STONE), conditionsFromItem(BlockInit.DWARF_STONE))
                .offerTo(exporter);
    }
    private static @NotNull String hasTag(@NotNull TagKey<Item> tag) {
        return "has_" + tag.id().toString();
    }
}
