package com.vukach.vuksmod.world.feature;

import com.vukach.vuksmod.VukachMod;
import com.vukach.vuksmod.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, VukachMod.MOD_ID);

    public static final RegistryObject<PlacedFeature> TRASH_BAG_PLACED = PLACED_FEATURES.register("trash_bag_placed",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>)
                    ModConfiguredFeatures.TRASH_BAG, List.of(RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));


    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}