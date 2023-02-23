package com.vukach.vuksmod.entity.client.armor;

import com.vukach.vuksmod.item.custom.PlasticArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class PlasticArmorRenderer extends GeoArmorRenderer<PlasticArmorItem>
{
    public PlasticArmorRenderer() {
        super(new PlasticArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";
    }
}
