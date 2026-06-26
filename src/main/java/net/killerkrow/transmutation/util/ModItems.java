package net.killerkrow.transmutation.util;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.killerkrow.transmutation.Transmutation;
import net.killerkrow.transmutation.util.foods.EnchantedShimmeringApple;
import net.killerkrow.transmutation.util.foods.ShimmeringApple;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SHIMMERING_APPLE = registerItem("shimmering_apple",
            new ShimmeringApple(new FabricItemSettings().food(ModFoodComponents.SHIMMERING_APPLE)));
    public static final Item ENCHANTED_SHIMMERING_APPLE = registerItem("enchanted_shimmering_apple",
            new EnchantedShimmeringApple(new FabricItemSettings().food(ModFoodComponents.ENCHANTED_SHIMMERING_APPLE).maxCount(16)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Transmutation.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Transmutation.LOGGER.info("Registering Mod Items for " + Transmutation.MOD_ID);
    }
}
