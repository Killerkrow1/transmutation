package net.killerkrow.transmutation.mixin;

import net.killerkrow.transmutation.util.ModItems;
import net.killerkrow.transmutation.util.ModSounds;
import net.killerkrow.transmutation.util.ModTags;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtil;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

//Jarvis, initiate Terraria Shimmer Sequence
@Mixin(ItemEntity.class)
public abstract class ItemEntityInLiquidMixin {
    @Shadow
    public abstract ItemStack getStack();
    @Shadow public abstract void setStack(ItemStack stack);

    @Inject(method = "tick", at = @At("HEAD"))
    private void onTick(CallbackInfo ci) {
        ItemEntity itemEntity = (ItemEntity) (Object) this;

        if (itemEntity.getWorld().isClient()) {
            return;
        }

        // ARE YOU IN THE RIGHT THING?
        if (itemEntity.isSubmergedIn(ModTags.Fluid.TRANSMUTATION_FLUID)) {
            ItemStack stack = getStack();
            ItemStack resultStack = getTransmutation(stack);

            if (resultStack != null) {
                // Actually does the shimmer transmutation
                setStack(resultStack);

                // Global Sound
                BlockPos pos = itemEntity.getBlockPos();
                itemEntity.getWorld().playSound(
                        null,
                        pos,
                        ModSounds.TRANSMUTATION,
                        SoundCategory.PLAYERS,
                        1.0f,
                        1.0f
                );
            }
        }
    }

    private ItemStack getTransmutation(ItemStack input) {
        // Transmutation Tables
        if (input.isOf(Items.GOLDEN_APPLE)) {
            return new ItemStack(ModItems.SHIMMERING_APPLE, input.getCount());
        } else if (input.isOf(Items.ENCHANTED_GOLDEN_APPLE)) {
            return new ItemStack(ModItems.ENCHANTED_SHIMMERING_APPLE, input.getCount());
        } else if (input.isOf(Items.RAW_COPPER)) {
            return new ItemStack(Items.COPPER_INGOT, input.getCount());
        } else if (input.isOf(Items.RAW_GOLD)) {
            return new ItemStack(Items.GOLD_INGOT, input.getCount());
        } else if (input.isOf(Items.RAW_IRON)) {
            return new ItemStack(Items.IRON_INGOT, input.getCount());
        } else if (input.isOf(Items.AMETHYST_BLOCK)) {
            return new ItemStack(Blocks.BUDDING_AMETHYST, input.getCount());
        } else if (input.isOf(Items.NETHER_STAR)) {
            return new ItemStack(Blocks.BEACON, input.getCount());
        } else if (input.isOf(Items.GHAST_TEAR)) {
            return new ItemStack(Items.END_CRYSTAL, input.getCount());
        } else if (input.isOf(Items.BOW)) {
            ItemStack enchantedBow = new ItemStack(Items.BOW, input.getCount());
            enchantedBow.addEnchantment(Enchantments.MENDING, 1);
            enchantedBow.addEnchantment(Enchantments.UNBREAKING, 3);
            enchantedBow.addEnchantment(Enchantments.POWER, 5);
            enchantedBow.addEnchantment(Enchantments.INFINITY, 1);
            enchantedBow.addEnchantment(Enchantments.PUNCH, 2);
            enchantedBow.addEnchantment(Enchantments.FLAME, 1);
            return enchantedBow;
        } else if (input.isOf(Items.NETHERITE_SWORD)) {
            ItemStack enchantedSword = new ItemStack(Items.NETHERITE_SWORD, input.getCount());
            enchantedSword.addEnchantment(Enchantments.MENDING, 1);
            enchantedSword.addEnchantment(Enchantments.UNBREAKING, 3);
            enchantedSword.addEnchantment(Enchantments.SHARPNESS, 5);
            enchantedSword.addEnchantment(Enchantments.FIRE_ASPECT, 2);
            enchantedSword.addEnchantment(Enchantments.LOOTING, 3);
            enchantedSword.addEnchantment(Enchantments.SWEEPING, 3);
            return enchantedSword;
        } else if (input.isOf(Items.GLASS_BOTTLE)) {
            return new ItemStack(Items.EXPERIENCE_BOTTLE, input.getCount());
        } else if (input.isOf(Items.POTION)) {
            ItemStack potionStack = new ItemStack(Items.POTION, input.getCount());
            PotionUtil.setCustomPotionEffects(potionStack, List.of(
                    new StatusEffectInstance(StatusEffects.STRENGTH, 2400, 0),
                    new StatusEffectInstance(StatusEffects.SPEED, 2400, 0),
                    new StatusEffectInstance(StatusEffects.REGENERATION, 2400, 0),
            ));

            return potionStack;
        }
        // If you no throw correct item, you will get NOTHING BROKE BOY
        return null;
    }
}