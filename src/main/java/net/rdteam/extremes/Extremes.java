package net.rdteam.extremes;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.rdteam.extremes.block.ModBlocks;
import net.rdteam.extremes.entity.ModEntity;
import net.rdteam.extremes.entity.custom.CubeEntity;
import net.rdteam.extremes.item.ModItemGroups;
import net.rdteam.extremes.item.ModItems;
import net.rdteam.extremes.potion.ModPotions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Extremes implements ModInitializer {
	public static final String MOD_ID = "extremes";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroup();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModEntity.registerModEntity();
		ModPotions.registerModPotionsRecipes();
		ModPotions.registerPotions();
		FabricDefaultAttributeRegistry.register(ModEntity.MOSS_GOLEM, CubeEntity.createCubeAttributes());
	}
}