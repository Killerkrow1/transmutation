package net.killerkrow.transmutation.util.foods;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class ShimmeringApple extends Item {
    public ShimmeringApple(Item.Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient() && user instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) user;
            ItemStack remainingFood = new ItemStack(Items.APPLE);
            if (!player.getInventory().insertStack(remainingFood)) {
                player.dropItem(remainingFood, false);
            }
        }

        return super.finishUsing(stack, world, user);
    }
}