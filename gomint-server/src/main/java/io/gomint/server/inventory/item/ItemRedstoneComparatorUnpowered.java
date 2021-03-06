package io.gomint.server.inventory.item;
import io.gomint.inventory.item.ItemType;
import io.gomint.server.registry.RegisterInfo;
import io.gomint.taglib.NBTTagCompound;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( sId = "minecraft:unpowered_comparator", id = 149 )
public class ItemRedstoneComparatorUnpowered extends ItemStack {

    @Override
    public ItemType getItemType() {
        return ItemType.REDSTONE_COMPARATOR_UNPOWERED;
    }

}
