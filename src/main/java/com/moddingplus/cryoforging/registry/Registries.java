package com.moddingplus.cryoforging.registry;

import com.moddingplus.cryoforging.Cryoforging;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.Collection;
import java.util.HashMap;

public class Registries {

    public static final ItemGroup ITEM_GROUP = new ItemGroup(Cryoforging.MOD_ID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(getItem("ice_crown"));
        }
    };

    /**
     * Blocks
     */
    private static final HashMap<String, Block> BLOCKS = new HashMap<>();

    public static Collection<Block> getBlocks() {
        return BLOCKS.values();
    }

    public static Block getBlock(String path) {
        return BLOCKS.get(path);
    }

    public static void addBlock(String path, Block block) {
        BLOCKS.put(path, block);
    }

    /**
     * Items
     */
    private static final HashMap<String, Item> ITEMS = new HashMap<>();

    public static Collection<Item> getItems() {
        return ITEMS.values();
    }

    public static Item getItem(String path) {
        return ITEMS.get(path);
    }

    public static void addItem(String path, Item item) {
        ITEMS.put(path, item);
    }
}
