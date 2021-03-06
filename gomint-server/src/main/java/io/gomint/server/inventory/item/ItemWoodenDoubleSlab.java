package io.gomint.server.inventory.item;

import io.gomint.inventory.item.ItemType;
import io.gomint.server.registry.RegisterInfo;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo(sId = "minecraft:double_wooden_slab", id = 157)
public class ItemWoodenDoubleSlab extends ItemStack implements io.gomint.inventory.item.ItemWoodenDoubleSlab {

    @Override
    public long getBurnTime() {
        return 15000;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.WOODEN_DOUBLE_SLAB;
    }

}
