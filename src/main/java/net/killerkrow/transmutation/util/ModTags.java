package net.killerkrow.transmutation.util;

import net.killerkrow.transmutation.Transmutation;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> TRANSMUTATION_INPUT_BLOCK =
                createTag("transmutation_input");
        public static final TagKey<Block> TRANSMUTATION_RESULT_BLOCK =
                createTag("transmutation_result_block");

        public static final TagKey<Block> BLOCK_INPUT_ONE =
                createTag("block_input_one");
        public static final TagKey<Block> BLOCK_INPUT_TWO =
                createTag("block_input_two");
        public static final TagKey<Block> BLOCK_INPUT_THREE =
                createTag("block_input_three");
        public static final TagKey<Block> BLOCK_INPUT_FOUR =
                createTag("block_input_four");
        public static final TagKey<Block> BLOCK_INPUT_FIVE =
                createTag("block_input_five");
        public static final TagKey<Block> BLOCK_INPUT_SIX =
                createTag("block_input_six");
        public static final TagKey<Block> BLOCK_INPUT_SEVEN =
                createTag("block_input_seven");
        public static final TagKey<Block> BLOCK_INPUT_EIGHT =
                createTag("block_input_eight");
        public static final TagKey<Block> BLOCK_INPUT_NINE =
                createTag("block_input_nine");
        public static final TagKey<Block> BLOCK_INPUT_TEN =
                createTag("block_input_ten");

        public static final TagKey<Block> BLOCK_RESULT_ONE =
                createTag("block_result_one");
        public static final TagKey<Block> BLOCK_RESULT_TWO =
                createTag("block_result_two");
        public static final TagKey<Block> BLOCK_RESULT_THREE =
                createTag("block_result_three");
        public static final TagKey<Block> BLOCK_RESULT_FOUR =
                createTag("block_result_four");
        public static final TagKey<Block> BLOCK_RESULT_FIVE =
                createTag("block_result_five");
        public static final TagKey<Block> BLOCK_RESULT_SIX =
                createTag("block_result_six");
        public static final TagKey<Block> BLOCK_RESULT_SEVEN =
                createTag("block_result_seven");
        public static final TagKey<Block> BLOCK_RESULT_EIGHT =
                createTag("block_result_eight");
        public static final TagKey<Block> BLOCK_RESULT_NINE =
                createTag("block_result_nine");
        public static final TagKey<Block> BLOCK_RESULT_TEN =
                createTag("block_result_ten");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Transmutation.MOD_ID, name));
        }
    }

    public static class Fluid {
        public static final TagKey<net.minecraft.fluid.Fluid> TRANSMUTATION_FLUID =
                createTag("transmutation_fluid");

        private static TagKey<net.minecraft.fluid.Fluid> createTag(String name) {
            return TagKey.of(RegistryKeys.FLUID, new Identifier(Transmutation.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TRANSMUTATION_INPUT_ITEM =
                createTag("transmutation_input_item");
        public static final TagKey<Item> TRANSMUTATION_RESULT_ITEM =
                createTag("transmutation_result_item");

        public static final TagKey<Item> ITEM_INPUT_ONE =
                createTag("item_input_one");
        public static final TagKey<Item> ITEM_INPUT_TWO =
                createTag("item_input_two");
        public static final TagKey<Item> ITEM_INPUT_THREE =
                createTag("item_input_three");
        public static final TagKey<Item> ITEM_INPUT_FOUR =
                createTag("item_input_four");
        public static final TagKey<Item> ITEM_INPUT_FIVE =
                createTag("item_input_five");
        public static final TagKey<Item> ITEM_INPUT_SIX =
                createTag("item_input_six");
        public static final TagKey<Item> ITEM_INPUT_SEVEN =
                createTag("item_input_seven");
        public static final TagKey<Item> ITEM_INPUT_EIGHT =
                createTag("item_input_eight");
        public static final TagKey<Item> ITEM_INPUT_NINE =
                createTag("item_input_nine");
        public static final TagKey<Item> ITEM_INPUT_TEN =
                createTag("item_input_ten");
        
        public static final TagKey<Item> ITEM_RESULT_ONE =
                createTag("item_result_one");
        public static final TagKey<Item> ITEM_RESULT_TWO =
                createTag("item_result_two");
        public static final TagKey<Item> ITEM_RESULT_THREE =
                createTag("item_result_three");
        public static final TagKey<Item> ITEM_RESULT_FOUR =
                createTag("item_result_four");
        public static final TagKey<Item> ITEM_RESULT_FIVE =
                createTag("item_result_five");
        public static final TagKey<Item> ITEM_RESULT_SIX =
                createTag("item_result_six");
        public static final TagKey<Item> ITEM_RESULT_SEVEN =
                createTag("item_result_seven");
        public static final TagKey<Item> ITEM_RESULT_EIGHT =
                createTag("item_result_eight");
        public static final TagKey<Item> ITEM_RESULT_NINE =
                createTag("item_result_nine");
        public static final TagKey<Item> ITEM_RESULT_TEN =
                createTag("item_result_ten");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Transmutation.MOD_ID, name));
        }
    }
}