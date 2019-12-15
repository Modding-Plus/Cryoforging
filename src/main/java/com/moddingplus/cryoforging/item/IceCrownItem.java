package com.moddingplus.cryoforging.item;

import com.moddingplus.cryoforging.registry.ModArmorMaterial;
import com.moddingplus.cryoforging.registry.Registries;
import com.moddingplus.cryoforging.registry.RegistryUtils;
import net.minecraft.block.Blocks;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class IceCrownItem extends ArmorItem {

    public IceCrownItem() {
        super(ModArmorMaterial.ICE_CROWN, EquipmentSlotType.HEAD, RegistryUtils.DEFAULT_PROPS);
    }

    @SubscribeEvent
    public static void onBlockRightClicked(PlayerInteractEvent.RightClickBlock event) {
        // If player isn't wearing the ice crown -> return
        if (event.getPlayer().inventory.armorInventory.get(3).getItem() == Registries.getItem("ice_crown")) return;

        World world = event.getWorld();
        BlockPos pos = event.getPos();

        if (world.getBlockState(pos).getBlock() == Blocks.STONE) {
            world.setBlockState(pos, Registries.getBlock("artic_stone").getDefaultState());
        }
    }
}
