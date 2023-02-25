package com.vukach.vuksmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ModCreativeModeTab {
    public static final CreativeModeTab VUKS_TAB = new CreativeModeTab("vukstab") {
        @Override
        public @NotNull ItemStack makeIcon() { return new ItemStack(ModItems.CREDIT_CARD.get()); }
    };
}
