package com.moddingplus.cryoforging.registry;

import com.moddingplus.cryoforging.Cryoforging;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import javax.annotation.Nullable;

public class RegistryUtils {

    // Default item properties using our creative tab
    public static final Item.Properties DEFAULT_PROPS = new Item.Properties().group(Registries.ITEM_GROUP);

    public static void createBlock(String path, Block block, @Nullable Item item) {
        Registries.addBlock(path, block.setRegistryName(Cryoforging.MOD_ID, path));
        if (item != null)
            createItem(path, item);
    }

    public static void createBlock(String path, Block block, Item.Properties itemProps) {
        createBlock(path, block, new BlockItem(block, itemProps));
    }

    public static void createBlock(String path, Block.Properties blockProps, Item.Properties itemProps) {
        createBlock(path, new Block(blockProps), itemProps);
    }

    public static void createBlock(String path, Block.Properties blockProps) {
        createBlock(path, blockProps, DEFAULT_PROPS);
    }

    public static void createItem(String path, Item item) {
        Registries.addItem(path, item.setRegistryName(Cryoforging.MOD_ID, path));
    }

    public static void createItem(String path, Item.Properties itemProps) {
        createItem(path, new Item(itemProps));
    }

    public static void createItem(String path) {
        createItem(path, DEFAULT_PROPS);
    }
}