package io.gomint.server.inventory.item;
import io.gomint.inventory.item.ItemType;

import io.gomint.server.registry.RegisterInfo;
import io.gomint.taglib.NBTTagCompound;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( sId = "minecraft:salmon", id = 460 )
 public class ItemRawSalmon extends ItemStack implements io.gomint.inventory.item.ItemRawSalmon {



    @Override
    public ItemType getItemType() {
        return ItemType.RAW_SALMON;
    }

}