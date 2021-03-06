/*
 * Copyright (c) 2017, GoMint, BlackyPaw and geNAZt
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */
package io.gomint.server.inventory.item;

import io.gomint.event.player.PlayerConsumeItemEvent;
import io.gomint.math.Vector;
import io.gomint.server.entity.EntityPlayer;
import io.gomint.server.inventory.item.category.ItemConsumable;
import io.gomint.world.block.Block;
import io.gomint.world.block.data.Facing;

/**
 * @author geNAZt
 * @version 1.0
 */
public abstract class ItemFood extends ItemStack implements io.gomint.inventory.item.ItemFood, ItemConsumable {

    @Override
    public boolean interact(EntityPlayer entity, Facing face, Vector clickPosition, Block clickedBlock) {
        // TODO: Check fo planting

        if (entity.isHungry() && clickedBlock == null) {
            if (entity.getActionStart() > -1) {
                // Call event
                PlayerConsumeItemEvent consumeItemEvent = new PlayerConsumeItemEvent(entity, this);
                entity.getWorld().getServer().getPluginManager().callEvent(consumeItemEvent);

                if (consumeItemEvent.isCancelled()) {
                    return false;
                }

                // Consume
                this.onConsume(entity);
                entity.resetActionStart();
            } else {
                entity.setUsingItem(true);
            }
        }

        return super.interact(entity, face, clickPosition, clickedBlock);
    }

    @Override
    public void onConsume(EntityPlayer player) {
        if (player.isHungry()) {
            player.addHunger(getHunger());

            float saturation = Math.min(player.getSaturation() + (getHunger() * getSaturation() * 2.0f), player.getHunger());
            player.setSaturation(saturation);

            // Default manipulation
            this.afterPlacement();
        }
    }

}
