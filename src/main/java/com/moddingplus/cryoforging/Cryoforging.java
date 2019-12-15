package com.moddingplus.cryoforging;

import com.moddingplus.cryoforging.item.IceCrownItem;
import com.moddingplus.cryoforging.registry.RegistryHandler;
import com.moddingplus.cryoforging.registry.RegistryUtils;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(Cryoforging.MOD_ID)
public class Cryoforging {

    public static final String MOD_ID = "cryoforging";

    public Cryoforging() {
        registerHandlers();
        register();
    }

    private void registerHandlers() {
        MinecraftForge.EVENT_BUS.register(RegistryHandler.class);
        MinecraftForge.EVENT_BUS.register(IceCrownItem.class);
    }

    /**
     * Where we register all our items, blocks, etc. using RegistryUtils
     */
    private void register() {
        RegistryUtils.createItem("winter_steel");
        RegistryUtils.createBlock("winter_steel_block", Block.Properties.from(Blocks.IRON_BLOCK));

        RegistryUtils.createItem("frost_gold");
        RegistryUtils.createBlock("frost_gold_block", Block.Properties.from(Blocks.GOLD_BLOCK));

        RegistryUtils.createItem("ice_crown", new IceCrownItem());

        RegistryUtils.createBlock("artic_stone", Block.Properties.from(Blocks.STONE));
    }
}
