/*
 * Copyright (c) 2018 Gomint team
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.world.block;

import io.gomint.math.Vector;

/**
 * @author geNAZt
 * @version 1.0
 * @stability 3
 */
public interface BlockLiquid extends Block {

    /**
     * Get the percentage of how high the fluid has been in this block
     *
     * @return a value between 0 and 1 where 1 is the whole block full of the given liquid
     */
    float getFillHeight();

    /**
     * Set the fill height of the fluid inside this block
     *
     * @param height of the fluid
     */
    void setFillHeight(float height);

    /**
     * Vector which shows in which direction the liquid is flowing
     *
     * @return vector of flowing direction
     */
    Vector getFlowVector();

}
