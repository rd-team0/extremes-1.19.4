package net.rdteam.extremes;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.rdteam.extremes.block.ModBlocks;
import net.rdteam.extremes.item.ModItems;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ExtremesDataGenerator implements DataGeneratorEntrypoint {

	private static class ModTagGenerator extends FabricTagProvider.ItemTagProvider {
		public ModTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
			super(output, completableFuture);
		}

		private static final TagKey<Item> HAVE_CHEESE = TagKey.of(RegistryKeys.ITEM, new Identifier("extremes:have_cheese"));

		@Override
		protected void configure(RegistryWrapper.WrapperLookup arg) {
			getOrCreateTagBuilder(HAVE_CHEESE)
					.add(ModItems.DORITOS);
		}
	}

	private static class ModRecipeGenerator extends FabricRecipeProvider {
		public ModRecipeGenerator(FabricDataOutput generator) {
			super(generator);
		}

		@Override
		public void generate(Consumer<RecipeJsonProvider> exporter) {

		}
	}

	private static class ModBlockLootTablesGenerator extends FabricBlockLootTableProvider {

		protected ModBlockLootTablesGenerator(FabricDataOutput dataOutput) {
			super(dataOutput);
		}

		@Override
		public void generate() {
			addDrop(Extremes.MOD_ID, drops(ModBlocks.ARCANE_TILE));
		}

		private void addDrop(String modId, LootTable.Builder drops) {
		}
	}


    @Override
	public void onInitializeDataGenerator(FabricDataGenerator generator) {
		FabricDataGenerator.Pack pack = generator.createPack();
		pack.addProvider(ModTagGenerator::new);
		pack.addProvider(ModRecipeGenerator::new);
		pack.addProvider(ModBlockLootTablesGenerator::new);
	}

}
