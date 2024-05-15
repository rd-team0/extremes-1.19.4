package net.rdteam.extremes.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.rdteam.extremes.Extremes;

public class ModBlocks {

    public static final Block ARCANE_TILE = registerBlock("arcane_tile", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool()));
    public static final Block ARCANE_BORDER = registerBlock("arcane_border", new Block(FabricBlockSettings.copyOf(Blocks.BARRIER).strength(4.0f,10.0f)));
    public static final Block BORDER_BRAIN = registerBlock("border_brain", new Block(FabricBlockSettings.copyOf(Blocks.BARRIER).strength(4.0f,10.0f)));
    public static final Block DEMIURG_SAND = registerBlock("demiurg_sand", new Block(FabricBlockSettings.copyOf(Blocks.SAND).requiresTool().sounds(BlockSoundGroup.GRAVEL)));
    public static final Block DEMIURG_SANDBRICKS = registerBlock("demiurg_sandbricks", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).requiresTool().sounds(BlockSoundGroup.SCULK_SENSOR)));
    public static final Block DEMIURG_SANDSTONE = registerBlock("demiurg_sandstone", new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).requiresTool().sounds(BlockSoundGroup.SCULK_SENSOR)));
    public static final Block DEMIURG_STONE = registerBlock("demiurg_stone", new Block(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool().sounds(BlockSoundGroup.SCULK_SENSOR)));


    private static Block registerBlock(String name, Block block){
      registerBlockItem(name, block);
      return Registry.register(Registries.BLOCK, new Identifier(Extremes.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Extremes.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Extremes.LOGGER.debug("Registering blocks" + Extremes.MOD_ID);

    }
}
