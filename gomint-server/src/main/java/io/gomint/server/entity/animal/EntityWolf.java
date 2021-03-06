/*
 * Copyright (c) 2018 Gomint team
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.server.entity.animal;

import io.gomint.server.entity.Attribute;
import io.gomint.server.entity.EntityType;
import io.gomint.server.registry.RegisterInfo;
import io.gomint.server.world.WorldAdapter;

@RegisterInfo(sId = "minecraft:wolf")
public class EntityWolf extends EntityAgeableAnimal implements io.gomint.entity.animal.EntityWolf {

    /**
     * Constructs a new EntityLiving
     *
     * @param world The world in which this entity is in
     */
    public EntityWolf(WorldAdapter world) {
        super(EntityType.WOLF, world);
        this.initEntity();
    }

    /**
     * Create new entity wolf for API
     */
    public EntityWolf() {
        super(EntityType.WOLF, null);
        this.initEntity();
    }

    private void initEntity() {
        this.addAttribute(Attribute.HEALTH);
        this.setMaxHealth(16);
        this.setHealth(16);
        if (this.isBaby()) {
            this.setSize(0.3f, 0.425f);
        } else {
            this.setSize(0.6f, 0.85f);
        }
    }

    @Override
    public void update(long currentTimeMS, float dT) {
        super.update(currentTimeMS, dT);
    }
}
