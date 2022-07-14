package org.hydrocarbonx.algorithm.leetcode.medium;

/**
 * <a
 * href="https://leetcode.cn/problems/koko-eating-bananas/">https://leetcode.cn/problems/koko-eating-bananas/</a>
 *
 * @author HydroCarbon
 * @since 2022-06-07
 */
@SuppressWarnings("java:S101")
public class _875KokoEatingBananas {

  public int minEatingSpeed(int[] piles, int h) {
    // 提示已有边界

    // 最小值是 1
    int min = 1;
    int max = piles[0];

    // 找到最大值
    for (int pile : piles) {
      max = Math.max(pile, max);
    }

    // 二分
    while (min < max) {
      // 取中间值
      int mid = (min + max) >>> 1;

      // 计算 k = mid 时所需要的时间
      int needH = 0;
      for (int pile : piles) {
        needH += pile / mid;
        if (pile % mid != 0) {
          ++needH;
        }
      }

      // mid 在右侧
      if (needH > h) {
        min = mid + 1;
      } else {
        // 在左侧
        max = mid;
      }
    }
    return min;
  }
}
