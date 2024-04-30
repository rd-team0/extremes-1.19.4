package net.rdteam.extremes.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.rdteam.extremes.Extremes;

public class ModItems {

    public static final Item DORITOS = registerItem("doritos", new Item(new FabricItemSettings()));

    public static void addItemsToFoodItemGroup(FabricItemGroupEntries entries) {
        entries.add(DORITOS);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Extremes.MOD_ID, name), item);
    }


    public static void registerModItems() {
        Extremes.LOGGER.debug("Registering items" + Extremes.MOD_ID);

    }

}
