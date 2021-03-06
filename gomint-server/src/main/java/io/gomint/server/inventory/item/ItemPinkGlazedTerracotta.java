package io.gomint.server.inventory.item;

import io.gomint.inventory.item.ItemType;

import io.gomint.server.registry.RegisterInfo;
import io.gomint.taglib.NBTTagCompound;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo(sId = "minecraft:pink_glazed_terracotta", id = 226)
public class ItemPinkGlazedTerracotta extends ItemStack implements io.gomint.inventory.item.ItemPinkGlazedTerracotta {

    @Override
    public ItemType getItemType() {
        return ItemType.PINK_GLAZED_TERRACOTTA;
    }

}
