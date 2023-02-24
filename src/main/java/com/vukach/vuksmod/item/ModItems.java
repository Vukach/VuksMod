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

    public static final RegistryObject<Item> PLASTIC_PLATE = ITEMS.register("plastic_plate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VUKS_TAB)));

    public static final RegistryObject<Item> PLASTIC_PLATE_STACK = ITEMS.register("plastic_plate_stack",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VUKS_TAB)));

    public static final RegistryObject<Item> METAL_PLATE = ITEMS.register("metal_plate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VUKS_TAB)));

    public static final RegistryObject<Item> METAL_STICK = ITEMS.register("metal_stick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VUKS_TAB)));

    public static final RegistryObject<Item> METAL_BLADE = ITEMS.register("metal_blade",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VUKS_TAB)));

    public static final RegistryObject<Item> METAL_KNIFE = ITEMS.register("metal_knife",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VUKS_TAB)));

    public static final RegistryObject<Item> METAL_ARROW = ITEMS.register("metal_arrow",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VUKS_TAB)));

    public static final RegistryObject<Item> RESOURCE_HAMMER = ITEMS.register("resource_hammer",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VUKS_TAB)));

    public static final RegistryObject<Item> OIL_BUCKET = ITEMS.register("oil_bucket",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VUKS_TAB)));

    public static final RegistryObject<SwordItem> PLASTIC_BATTEN = ITEMS.register("plastic_batten",
            () -> new SwordItem(Tiers.DIAMOND, 5, 5f, new Item.Properties().tab(ModCreativeModeTab.VUKS_TAB)));

    public static final RegistryObject<SwordItem> PLASTIC_BATTEN_METAL = ITEMS.register("plastic_batten_metal_upgrade",
            () -> new SwordItem(Tiers.DIAMOND, 7, 2f, new Item.Properties().tab(ModCreativeModeTab.VUKS_TAB)));

    public static final RegistryObject<SwordItem> PLASTIC_BATTEN_PICKAXE = ITEMS.register("plastic_batten_pickaxe_upgrade",
            () -> new SwordItem(Tiers.DIAMOND, 10, 0f, new Item.Properties().tab(ModCreativeModeTab.VUKS_TAB)));

    public static final RegistryObject<SwordItem> PLASTIC_BATTEN_SWORD = ITEMS.register("plastic_batten_sword_upgrade",
            () -> new SwordItem(Tiers.DIAMOND, 10, 0f, new Item.Properties().tab(ModCreativeModeTab.VUKS_TAB)));

    public static final RegistryObject<PlasticArmorItem> PLASTIC_HELMET = ITEMS.register("plastic_helmet",
            () -> new PlasticArmorItem(ModArmorMaterials.Plastic, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.VUKS_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}