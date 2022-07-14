package org.hydrocarbonx.algorithm.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * <a href="https://leetcode.cn/problems/unique-number-of-occurrences/">
 * https://leetcode.cn/problems/unique-number-of-occurrences/</a>
 *
 * @author HydroCarbon
 * @since 2022-07-14
 */
@SuppressWarnings("java:S101")
public class _1207UniqueNumberOfOccurrences {

  public boolean uniqueOccurrences(int[] arr) {
    Map<Integer, Integer> map = new HashMap<>();
    // 使用 getOrDefault() 将 arr 的每一项添加到 Map 中
    for (int i : arr) {
      map.put(i, map.getOrDefault(i, 1) + 1);
    }
    // 使用 set 根据 map 的 values 判断是否存在重复项
    return map.size() == new HashSet<>(map.values()).size();
  }
}
