package net.killerkrow.transmutation;

import net.fabricmc.api.ModInitializer;

import net.killerkrow.transmutation.util.*;
import net.minecraft.util.Identifier;

import net.minecraft.util.ModStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Transmutation implements ModInitializer {
	public static final String MOD_ID = "transmutation";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModSounds.registerSounds();
		ModFluids.register();
		ModStatusEffects.initialize();
		ModLootTableModifiers.modifyLootTables();
	}

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}
