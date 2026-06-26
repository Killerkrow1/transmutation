package net.killerkrow.transmutation.util;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.killerkrow.transmutation.Transmutation;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup TRANSMUTATION_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Transmutation.MOD_ID, "shimmering_apple"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.transmutation"))
                    .icon(() -> new ItemStack(ModItems.SHIMMERING_APPLE)).entries((displayContext, entries) -> {

                        entries.add(ModFluids.TRANSMUTATION_WATER_BUCKET);
                        entries.add(ModItems.SHIMMERING_APPLE);
                        entries.add(ModItems.ENCHANTED_SHIMMERING_APPLE);


                    }).build());

    public static void registerItemGroups() {
        Transmutation.LOGGER.info("Registering Item Groups for " +Transmutation.MOD_ID);
    }
}
