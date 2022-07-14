package org.hydrocarbonx.algorithm.basic.sort.impl;

import lombok.extern.slf4j.Slf4j;
import org.hydrocarbonx.algorithm.basic.sort.ISort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author HydroCarbon
 * @since 2022-05-29
 */
@Slf4j
class InsertionSortTest {

  @Test
  void sort() {
    Integer[] integerArray = new Integer[] {3, 2, 1, 55, 43, 56, 32, 6, 543, 23, 7};
    ISort iSort = new InsertionSort();
    iSort.sort(integerArray);

    log.info("Sorted integer array is: {}", Arrays.toString(integerArray));
  }
}
