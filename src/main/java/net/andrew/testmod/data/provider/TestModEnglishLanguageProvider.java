package net.andrew.testmod.data.provider;

import net.andrew.testmod.TestMod;
import net.andrew.testmod.init.BlockInit;
import net.andrew.testmod.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class TestModEnglishLanguageProvider extends FabricLanguageProvider {


    public TestModEnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }
    private static void addText(@NotNull TranslationBuilder builder, @NotNull Text text, @NotNull String value) {
        if (text.getContent() instanceof TranslatableTextContent translatableTextContent) {
            builder.add(translatableTextContent.getKey(), value);
        } else {
            TestMod.LOGGER.warn("Failed to add translation for text: {}", text.getString());
        }
    }


    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ItemInit.MITHRIL_ITEM, "mithril_item");
        translationBuilder.add(BlockInit.ANGBAND_ORE, "angband_ore");
        translationBuilder.add(BlockInit.ANGBND_COBBLE, "angband_cobble");
        translationBuilder.add(BlockInit.ANGBAND_STONE,"angband_stone");
        translationBuilder.add(BlockInit.DROW_STONE,"drow_stone");
        translationBuilder.add(BlockInit.DROW_COBBLE, "drow_cobble");
        translationBuilder.add(BlockInit.DROW_BRICK, "drow_brick");
        translationBuilder.add(BlockInit.ORC_STONE, "orc_stone");
        translationBuilder.add(BlockInit.ORC_COBBLE,"orc_cobble");
        translationBuilder.add(BlockInit.ORC_BRICK, "orc_brick");
        translationBuilder.add(BlockInit.SKAVEN_STONE, "skaven_stone");
        translationBuilder.add(BlockInit.SKAVEN_COBBLE, "skaven_cobble");
        translationBuilder.add(BlockInit.SKAVEN_BRICK, "skaven_brick");
        translationBuilder.add(BlockInit.MITHRIL_ORE, "mithril_ore");
        translationBuilder.add(BlockInit.MITHRIL_COBBLE, "mithril_cobble");
        translationBuilder.add(BlockInit.MITHRIL_STONE,"mithril_stone");
        translationBuilder.add(BlockInit.MITHRIL_BRICK,"mithirl_brick");
        translationBuilder.add(BlockInit.DWARF_STONE,"dwarf_stone");
        translationBuilder.add(BlockInit.DWARFIRON_STONE, "dwarfiron_stone");
        translationBuilder.add(BlockInit.DWARF_COBBLE, "dwarf_cobble");
        translationBuilder.add(BlockInit.DWARF_BRICK, "dwarf_brick");
        translationBuilder.add(BlockInit.MORDOR_ORE,"mordor_ore");
        translationBuilder.add(BlockInit.MORDOR_COBBLE,"mordor_cobble");
        translationBuilder.add(BlockInit.MORDOR_STONE, "mordor_stone");
        translationBuilder.add(BlockInit.MITHRIL_LOG,"mithril_log");
        translationBuilder.add(BlockInit.MITHRIL_LEAVES,"mithril_leaves");
        translationBuilder.add(BlockInit.SILVER_LOG,"silver_log");
        translationBuilder.add(BlockInit.SILVER_LEAVES,"silver_leaves");
        translationBuilder.add(BlockInit.IRONWOOD_LOG,"ironwood_log");
        translationBuilder.add(BlockInit.EVILWOOD_LOG,"evilwood_log");
        translationBuilder.add(BlockInit.EVIL_LEAVES, "evil_leaves");
        translationBuilder.add(BlockInit.DEEPSLATE_MITHRIL_ORE, "deep_mithril_ore");
        translationBuilder.add(BlockInit.SKAVEN_PLANKS, "skaven_planks");
        translationBuilder.add(BlockInit.ELF_STONE, "elf_stone");
        translationBuilder.add(BlockInit.HOBBIT_ORE,"hobbit_ore");

    }
}
