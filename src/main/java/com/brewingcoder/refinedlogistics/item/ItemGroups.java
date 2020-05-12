package com.brewingcoder.refinedlogistics.item;

import com.brewingcoder.refinedlogistics.RefinedLogistics;
import com.brewingcoder.refinedlogistics.blocks.RLBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemGroups {
    public static final ItemGroup MAIN = new ItemGroup(RefinedLogistics.MODID) {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(RLBlocks.STICKY_ORE);
        }
    };
}
