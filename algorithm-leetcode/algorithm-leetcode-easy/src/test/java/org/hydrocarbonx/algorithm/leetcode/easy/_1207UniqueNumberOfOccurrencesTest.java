package org.hydrocarbonx.algorithm.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author HydroCarbon
 * @since 2022-07-14
 */
@SuppressWarnings("all")
class _1207UniqueNumberOfOccurrencesTest {

  @Test
  void uniqueOccurrences() {
    _1207UniqueNumberOfOccurrences solution = new _1207UniqueNumberOfOccurrences();
    int[] arr = new int[] {1, 2, 2, 1, 1, 3};
    boolean result = solution.uniqueOccurrences(arr);
    Assertions.assertTrue(result);
  }
}
