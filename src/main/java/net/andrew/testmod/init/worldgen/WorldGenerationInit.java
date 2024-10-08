package net.andrew.testmod.init.worldgen;

public class WorldGenerationInit {
    public static void generateModWorldGen() {
        OreGenerationInit.generateOres();

        TreeGenerationInit.generateTrees();
    }
}
