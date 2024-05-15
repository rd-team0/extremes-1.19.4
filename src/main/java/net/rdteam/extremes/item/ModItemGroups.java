package net.rdteam.extremes.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rdteam.extremes.Extremes;

import static net.rdteam.extremes.block.ModBlocks.*;
import static net.rdteam.extremes.item.ModItems.DORITOS;

public class ModItemGroups {
    public static final ItemGroup EXTREMES_FOOD = FabricItemGroup.builder(new Identifier(Extremes.MOD_ID, "extremes_food_itemgroup"))
            .icon(() -> new ItemStack(DORITOS))
            .displayName(Text.translatable("itemgroup.extremes_food"))
            .build();

    public static final ItemGroup EXTREMES_BLOCKS = FabricItemGroup.builder(new Identifier(Extremes.MOD_ID, "extremes_block_itemgroup"))
            .icon(() -> new ItemStack(ARCANE_TILE))
            .displayName(Text.translatable("itemgroup.extremes_block"))
            .build();

    public static void registerItemGroup() {
        Extremes.LOGGER.info("registering Item group " + Extremes.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(EXTREMES_FOOD).register(content -> {
            content.add(DORITOS);
        });

        ItemGroupEvents.modifyEntriesEvent(EXTREMES_BLOCKS).register(content -> {
            content.add(ARCANE_TILE);
            content.add(ARCANE_BORDER);
            content.add(BORDER_BRAIN);
            content.add(DEMIURG_SANDBRICKS);
            content.add(DEMIURG_SAND);
            content.add(DEMIURG_STONE);
        });

    }
}
