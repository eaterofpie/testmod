package net.andrew.testmod;


import net.andrew.testmod.init.BlockInit;
import net.andrew.testmod.init.ItemGroupInit;
import net.andrew.testmod.init.ItemInit;
import net.andrew.testmod.init.worldgen.Biome.TestBiomesInit;
import net.andrew.testmod.init.worldgen.Biome.TestmodBiomeTagProvider;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("TestMod");
	public static final String MOD_ID = "testmod";

	@Override
	public void onInitialize() {
		ItemInit.load();
		BlockInit.load();
		ItemGroupInit.load();
		TestBiomesInit.load();
		TestmodBiomeTagProvider.load();


		LOGGER.info("Loading...");



	}





	public static Identifier id (String path) {
		return Identifier.of(MOD_ID, path);
	}

}