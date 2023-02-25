package com.vukach.vuksmod.entity.client.armor;

import com.vukach.vuksmod.VukachMod;
import com.vukach.vuksmod.item.custom.PlasticArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PlasticArmorModel extends AnimatedGeoModel<PlasticArmorItem> {

    @Override
    public ResourceLocation getModelResource(PlasticArmorItem object) {
        return new ResourceLocation(VukachMod.MOD_ID, "geo/plastic_armor_v2.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PlasticArmorItem object) {
        return new ResourceLocation(VukachMod.MOD_ID, "textures/models/armor/plastic_armor_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PlasticArmorItem animatable) {
        return new ResourceLocation(VukachMod.MOD_ID, "animations/armor_animation.json");
    }
}