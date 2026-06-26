package net.killerkrow.transmutation.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.killerkrow.transmutation.util.ModFluids;
import net.killerkrow.transmutation.util.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModFluids.TRANSMUTATION_WATER_BUCKET, Models.GENERATED);

        itemModelGenerator.register(ModItems.SHIMMERING_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENCHANTED_SHIMMERING_APPLE, Models.GENERATED);

    }
}
