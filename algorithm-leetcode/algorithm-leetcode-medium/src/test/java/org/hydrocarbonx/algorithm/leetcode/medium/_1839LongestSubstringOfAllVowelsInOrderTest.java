package org.hydrocarbonx.algorithm.leetcode.medium;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author HydroCarbon
 * @since 2022-06-24
 */
@Slf4j
@SuppressWarnings("all")
class _1839LongestSubstringOfAllVowelsInOrderTest {

  @Test
  void longestBeautifulSubstring() {
    String testStr = "aeiaaioaaaaeiiiiouuuooaauuaeiu";
    int result = new _1839LongestSubstringOfAllVowelsInOrder().longestBeautifulSubstring(testStr);
    Assertions.assertEquals(13, result);

    testStr = "aeeeiiiioooauuuaeiou";
    result = new _1839LongestSubstringOfAllVowelsInOrder().longestBeautifulSubstring(testStr);
    Assertions.assertEquals(5, result);

    testStr = "a";
    result = new _1839LongestSubstringOfAllVowelsInOrder().longestBeautifulSubstring(testStr);
    Assertions.assertEquals(0, result);
  }
}
