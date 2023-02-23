package com.vukach.vuksmod.item;

import com.vukach.vuksmod.VukachMod;
import com.vukach.vuksmod.item.custom.CreditCard;
import com.vukach.vuksmod.item.custom.PlasticArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VukachMod.MOD_ID);

    public static final RegistryObject<Item> CREDIT_CARD = ITEMS.register("creditcard",
            () -> new CreditCard(new Item.Properties().tab(ModCreativeModeTab.VUKS_TAB)));
    public static final RegistryObject<Item> PLASTIC_SHARD = ITEMS.register("plastic_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VUKS_TAB)));

    public static final RegistryObject<SwordItem> PLASTIC_BATTEN = ITEMS.register("plastic_batten",
            () -> new SwordItem(Tiers.DIAMOND, 5, 5f, new Item.Properties().tab(ModCreativeModeTab.VUKS_TAB)));

    public static final RegistryObject<SwordItem> PLASTIC_BATTEN_METAL = ITEMS.register("plastic_batten_metal_upgrade",
            () -> new SwordItem(Tiers.DIAMOND, 7, 2f, new Item.Properties().tab(ModCreativeModeTab.VUKS_TAB)));

    public static final RegistryObject<SwordItem> PLASTIC_BATTEN_BLADE = ITEMS.register("plastic_batten_blade_upgrade",
            () -> new SwordItem(Tiers.DIAMOND, 10, 0f, new Item.Properties().tab(ModCreativeModeTab.VUKS_TAB)));

    public static final RegistryObject<PlasticArmorItem> PLASTIC_HELMET = ITEMS.register("plastic_helmet",
            () -> new PlasticArmorItem(ModArmorMaterials.Plastic, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.VUKS_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}