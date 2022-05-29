package org.hydrocarbonx.algorithm.basic.sort;

import lombok.extern.slf4j.Slf4j;
import org.hydrocarbonx.algorithm.basic.sort.impl.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * {@link BubbleSort} 的测试类
 *
 * @author HydroCarbon
 * @since 2022-05-29
 */
@Slf4j
class BubbleSortTest {

    /**
     * 针对 {@link BubbleSort#sort(Comparable[])} 进行的测试。
     */
    @Test
    void bubbleSort() {
        Integer[] integerArray = new Integer[]{3, 2, 1, 55, 43, 56, 32, 6, 543, 23, 7};
        ISort iSort = new BubbleSort();
        iSort.sort(integerArray);

        log.info("Sorted integer array is: {}", Arrays.toString(integerArray));

        Assertions.assertArrayEquals(new Integer[]{1, 2, 3, 6, 7, 23, 32, 43, 55, 56, 543}, integerArray);
    }
}
