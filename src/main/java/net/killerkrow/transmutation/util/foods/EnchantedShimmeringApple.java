package net.killerkrow.transmutation.util.foods;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class EnchantedShimmeringApple extends Item {
    public EnchantedShimmeringApple(Settings settings) {
        super(settings);
    }


    @Override
    public boolean hasGlint(ItemStack stack) {
        return true; // Enables the enchanted shimmer
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient() && user instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) user;

            ItemStack rewardItem = new ItemStack(Items.GOLDEN_APPLE);

            if (!player.getInventory().insertStack(rewardItem)) {
                player.dropItem(rewardItem, false);
            }
        }

        return super.finishUsing(stack, world, user);
    }
}