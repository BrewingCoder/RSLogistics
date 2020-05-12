package com.brewingcoder.refinedlogistics.world;

import com.brewingcoder.refinedlogistics.blocks.RLBlocks;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RLOreGen {
    public static final List<Feature<?>> FEATURES = new ArrayList<>();

    public static void register() {
        ForgeRegistries.BIOMES.forEach( biome -> {
            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    Feature.ORE.withConfiguration(
                            new OreFeatureConfig(
                                    OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                    RLBlocks.STICKY_ORE.getDefaultState(),5))
                            .withPlacement(
                                    Placement.COUNT_RANGE.configure(new CountRangeConfig(10,0,0,69))
                            ));
        });
    }
}
