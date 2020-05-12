package com.brewingcoder.refinedlogistics.blocks;

import com.brewingcoder.refinedlogistics.item.ItemGroups;
import com.brewingcoder.refinedlogistics.lib.BlockProperties;
import com.brewingcoder.refinedlogistics.lib.IBlock;
import com.brewingcoder.refinedlogistics.lib.OreBlockBase;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

public class Blocks {
    public static final List<BlockItem> BLOCK_ITEMS  = new ArrayList<>();
    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block STICKY_ORE = register("sticky_ore", new OreBlockBase(BlockProperties.metal(2.0f,20.0f)));
    public static final Block STICKY_ORE_INFESTED_ONE = register("sticky_ore_infested_one", new OreBlockBase(BlockProperties.metal(2.0f,20.0f)));
    public static final Block STICKY_ORE_INFESTED_TWO = register("sticky_ore_infested_two", new OreBlockBase(BlockProperties.metal(2.0f,20.0f)));

    static <T extends net.minecraft.block.Block> T register(final String name, final T block) {
        final BlockItem itemBlock = ((IBlock) block).getBlockItem(new Item.Properties(), ItemGroups.MAIN);
        itemBlock.setRegistryName(name);
        block.setRegistryName(name);
        Blocks.BLOCK_ITEMS.add(itemBlock);
        Blocks.BLOCKS.add(block);
        return block;
    }

    @SubscribeEvent
    public static void onRegistry(final RegistryEvent.Register<Block> event) {
        Blocks.BLOCKS.forEach(block -> event.getRegistry().register(block));
    }

}
