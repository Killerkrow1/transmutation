package net.killerkrow.transmutation;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.killerkrow.transmutation.util.ModFluids;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class TransmutationClient  implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_TRANSMUTATION_WATER, ModFluids.FLOWING_TRANSMUTATION_WATER,
            new SimpleFluidRenderHandler(
                        new Identifier("transmutation:block/transmutation_fluid"),
                        new Identifier("transmutation:block/transmutation_fluid"),
                        0xA1B528FC
                                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
    ModFluids.STILL_TRANSMUTATION_WATER, ModFluids.FLOWING_TRANSMUTATION_WATER);
}
}
