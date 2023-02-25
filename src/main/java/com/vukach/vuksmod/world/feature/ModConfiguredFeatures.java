package com.vukach.vuksmod.world.feature;

import com.vukach.vuksmod.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

import static com.vukach.vuksmod.VukachMod.MOD_ID;

public class ModConfiguredFeatures {

	public static final DeferredRegister<ConfiguredFeature<?, ?>> MOD_CONFIGURED_FEATURES =
			DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, MOD_ID);

    public static final RegistryObject<ConfiguredFeature<?,?>> TRASH_BAG = MOD_CONFIGURED_FEATURES.register("trash_bag",
			() -> new ConfiguredFeature<>(
					Feature.FLOWER, FeatureUtils.simpleRandomPatchConfiguration(		1,
							new RandomPatchConfiguration(5, 12, 0,
									PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
									new SimpleBlockConfiguration(
											BlockStateProvider.simple(ModBlocks.TRASH_BAG.get().defaultBlockState())))).feature())));

	public static final RegistryObject<ConfiguredFeature<?,?>> TRASH_BAG_SPAWN =
			MOD_CONFIGURED_FEATURES.register("trash_bag_spawn",() -> new ConfiguredFeature<>(Feature.RANDOM_SELECTOR,
							new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
									ModPlacedFeatures.TRASH_BAG_CHECKED.getHolder().get(), 0.25f)),
											ModPlacedFeatures.TRASH_BAG_CHECKED.getHolder().get())));



/* the following entries are only to compare and hope to understanding the Configured & Placed Features a bit better...
//	public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FLOWER_DEFAULT = FeatureUtils.register("flower_default",
//			Feature.FLOWER, grassPatch(
//					new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
//					.add(Blocks.POPPY.defaultBlockState(), 2)
//					.add(Blocks.DANDELION.defaultBlockState(), 1)), 64));
//
//	public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FLOWER_PLAIN = FeatureUtils.register("flower_plain",
//			Feature.FLOWER,
//			new RandomPatchConfiguration(64, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
//					new SimpleBlockConfiguration(new NoiseThresholdProvider(2345L,
//							new NormalNoise.NoiseParameters(0, 1.0D), 0.005F, -0.8F, 0.33333334F,
//							Blocks.DANDELION.defaultBlockState(), List.of(Blocks.ORANGE_TULIP.defaultBlockState(),
//									Blocks.RED_TULIP.defaultBlockState(), Blocks.PINK_TULIP.defaultBlockState(),
//									Blocks.WHITE_TULIP.defaultBlockState()), List.of(Blocks.POPPY.defaultBlockState(),
//									Blocks.AZURE_BLUET.defaultBlockState(), Blocks.OXEYE_DAISY.defaultBlockState(),
//									Blocks.CORNFLOWER.defaultBlockState()))))));

//	private static RandomPatchConfiguration grassPatch(BlockStateProvider blockStateProvider, int p_195204_) {
//		return FeatureUtils.simpleRandomPatchConfiguration(p_195204_,
//				PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(blockStateProvider)));
//	}
*/
	public static void register(IEventBus eventBus) { MOD_CONFIGURED_FEATURES.register(eventBus); }
}
