package org.hydrocarbonx.algorithm.basic.sort.impl;

import lombok.extern.slf4j.Slf4j;
import org.hydrocarbonx.algorithm.basic.sort.ISort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * {@link SelectionSort} 的测试类。
 *
 * @author HydroCarbon
 * @since 2022-05-29
 */
@Slf4j
class SelectionSortTest {

    /**
     * 测试 {@link SelectionSort#sort(Comparable[])}
     */
    @Test
    void sort() {
        Integer[] integerArray = new Integer[]{3, 2, 1, 55, 43, 56, 32, 6, 543, 23, 7};
        ISort iSort = new SelectionSort();
        iSort.sort(integerArray);

        log.info("Sorted integer array is: {}", Arrays.toString(integerArray));
    }
}
