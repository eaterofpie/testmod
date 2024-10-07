package net.andrew.testmod;


import net.andrew.testmod.data.generator.TestModWorldGenerator;
import net.andrew.testmod.data.provider.TestModBlockLootTableProvider;
import net.andrew.testmod.data.provider.TestModBlockTagProvider;
import net.andrew.testmod.data.provider.TestModEnglishLanguageProvider;
import net.andrew.testmod.data.provider.TestModModModelProvider;
import net.andrew.testmod.init.worldgen.Biome.BiomesInit;
import net.andrew.testmod.init.worldgen.ConfiguredFeatureInit;
import net.andrew.testmod.init.worldgen.PlacedFeatureInit;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class TestModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(TestModEnglishLanguageProvider::new);
		pack.addProvider(TestModBlockLootTableProvider::new);
		pack.addProvider(TestModModModelProvider::new);
		pack.addProvider(TestModBlockTagProvider::new);
		pack.addProvider(TestModWorldGenerator::new);
	}

		@Override
		public void buildRegistry(RegistryBuilder registryBuilder) {
			registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ConfiguredFeatureInit::bootstrap);
			registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, PlacedFeatureInit::bootstrap);
			registryBuilder.addRegistry(RegistryKeys.BIOME, BiomesInit::boostrap);
		}
	}
