/*
 * Copyright (c) 2018 Gomint team
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.entity.animal;

import io.gomint.GoMint;
import io.gomint.entity.EntityLiving;

/**
 * @author geNAZt
 * @version 1.0
 * @stability 3
 */
public interface EntitySquid extends EntityLiving {

    /**
     * Create a new entity squid with no config
     *
     * @return empty, fresh squid
     */
    static EntitySquid create() {
        return GoMint.instance().createEntity( EntitySquid.class );
    }

}
