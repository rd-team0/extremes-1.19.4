package net.rdteam.extremes;

import net.fabricmc.api.ModInitializer;

import net.rdteam.extremes.item.ModItemGroups;
import net.rdteam.extremes.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Extremes implements ModInitializer {
	public static final String MOD_ID = "extremes";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroup();
		ModItems.registerModItems();
	}
}