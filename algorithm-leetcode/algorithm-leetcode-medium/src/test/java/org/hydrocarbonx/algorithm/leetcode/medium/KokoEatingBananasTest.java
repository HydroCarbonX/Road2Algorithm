package org.hydrocarbonx.algorithm.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author HydroCarbon
 * @since 2022-06-08
 */
class KokoEatingBananasTest {

    @Test
    void minEatingSpeed() {
        _875KokoEatingBananas solution = new _875KokoEatingBananas();

        int[] piles = new int[]{3, 6, 7, 11};
        int h = 8;

        int result = solution.minEatingSpeed(piles, h);

        Assertions.assertEquals(4, result);
    }
}
