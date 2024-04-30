package net.rdteam.extremes.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rdteam.extremes.Extremes;

import static net.rdteam.extremes.item.ModItems.DORITOS;

public class ModItemGroups {
    public static final ItemGroup EXTREMES = FabricItemGroup.builder(new Identifier("extremes", "extremes_itemgroup"))
            .icon(() -> new ItemStack(DORITOS))
            .displayName(Text.translatable("itemgroup.extremes"))
            .build();

    public static void registerItemGroup() {
        Extremes.LOGGER.info("registering Item group" + Extremes.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(EXTREMES).register(content -> {
            content.add(DORITOS);
        });
    }
}
