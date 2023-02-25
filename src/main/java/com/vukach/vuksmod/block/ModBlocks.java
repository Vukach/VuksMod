package com.vukach.vuksmod.block;

import com.vukach.vuksmod.VukachMod;
import com.vukach.vuksmod.block.custom.ModTrashBagBlock;
import com.vukach.vuksmod.item.ModCreativeModeTab;
import com.vukach.vuksmod.item.ModItems;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

import static com.vukach.vuksmod.VukachMod.MOD_ID;

public class ModBlocks {
    public static final DeferredRegister<Block> MOD_BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

    public static final RegistryObject<ModTrashBagBlock> TRASH_BAG = registerBlock("trash_bag",
            () -> new ModTrashBagBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion()), ModCreativeModeTab.VUKS_TAB);

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab, String tooltipKey) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)) {
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add((Component) new TranslatableContents(tooltipKey));
            }
        });
    }

	/** Registering Blocks without Tooltip */
    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = MOD_BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
		ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	/** Registering Blocks Tooltip */
	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab, String tooltipKey) {
		RegistryObject<T> toReturn = MOD_BLOCKS.register(name, block);
		registerBlockItem(name, toReturn, tab, tooltipKey);
		return toReturn;
	}

	private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab, String tooltipKey) {
		ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
				new Item.Properties().tab(tab)) {
			@Override
			public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltip, @NotNull TooltipFlag pFlag) {
				pTooltip.add(Component.translatable(tooltipKey));
			}
		});
	}

	/** Registering ModBlocks himself */
    public static void register(IEventBus eventBus) { MOD_BLOCKS.register(eventBus); }
}
