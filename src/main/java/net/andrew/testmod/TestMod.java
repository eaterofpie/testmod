package net.andrew.testmod;


import net.andrew.testmod.init.BlockInit;
import net.andrew.testmod.init.ItemGroupInit;
import net.andrew.testmod.init.ItemInit;
import net.andrew.testmod.init.worldgen.BiomeModificationInit;
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
		BiomeModificationInit.load();
		LOGGER.info("Loading...");



	}


	public static Identifier id (String path) {
		return Identifier.of(MOD_ID, path);
	}

}