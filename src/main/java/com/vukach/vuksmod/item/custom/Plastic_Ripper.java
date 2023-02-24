package com.vukach.vuksmod.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.DamageEnchantment;
import net.minecraft.world.level.Level;

public class Plastic_Ripper extends SwordItem
{
    public Plastic_Ripper(Properties properties) {
        super(Tiers.IRON, 5, 0, properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND)
        {
            player.getCooldowns().addCooldown(this, 20);
        }

        return super.use(level, player, hand);
    }
}
