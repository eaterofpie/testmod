package net.andrew.testmod.init.worldgen.Biome;

import net.andrew.testmod.TestMod;
import net.andrew.testmod.init.worldgen.Biome.suface.MaterialRulesInit;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class TerrablenderAPIInit implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new OverworldRegionInit(Identifier.of(TestMod.MOD_ID, "overworld"), 4));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, TestMod.MOD_ID, MaterialRulesInit.makeRules());
    }
}

