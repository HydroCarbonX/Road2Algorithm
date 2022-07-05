package org.hydrocarbonx.algorithm.leetcode.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author HydroCarbon
 * @since 2022-06-22
 */
@Slf4j
@SuppressWarnings("all")
class _2210CountHillsAndValleysInAnArrayTest {

    @Test
    void countHillValley() {
        int[] nums = new int[]{2, 4, 1, 1, 6, 5};
        int result = new _2210CountHillsAndValleysInAnArray().countHillValley(nums);
        Assertions.assertEquals(3, result);

        nums = new int[]{6, 6, 5, 5, 4, 1};
        result = new _2210CountHillsAndValleysInAnArray().countHillValley(nums);
        Assertions.assertEquals(0, result);
    }
}
