package com.vukach.vuksmod.world.feature;

import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

import static com.vukach.vuksmod.VukachMod.MOD_ID;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> MOD_PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, MOD_ID);

	public static final RegistryObject<PlacedFeature> TRASH_BAG_CHECKED = MOD_PLACED_FEATURES.register("trash_bag_checked",
			() -> new PlacedFeature(ModConfiguredFeatures.TRASH_BAG.getHolder().get(),
					List.of(PlacementUtils.countExtra(2,0.25f, 1))));

    public static final RegistryObject<PlacedFeature> TRASH_BAG_PLACED = MOD_PLACED_FEATURES.register("trash_bag_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.TRASH_BAG_SPAWN.getHolder().get(),
					List.of(RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));


    public static void register(IEventBus eventBus) { MOD_PLACED_FEATURES.register(eventBus); }
}
