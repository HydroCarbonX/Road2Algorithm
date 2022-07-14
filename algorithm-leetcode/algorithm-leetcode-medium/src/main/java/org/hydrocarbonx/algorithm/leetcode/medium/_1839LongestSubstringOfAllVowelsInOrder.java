package org.hydrocarbonx.algorithm.leetcode.medium;

/**
 * <a
 * href="https://leetcode.cn/problems/longest-substring-of-all-vowels-in-order/">https://leetcode.cn/problems/longest-substring-of-all-vowels-in-order/</a>
 *
 * @author HydroCarbon
 * @since 2022-06-24
 */
@SuppressWarnings("java:S101")
public class _1839LongestSubstringOfAllVowelsInOrder {

  /**
   * 获取字符串中的最长美丽子字符串的长度。
   *
   * @param word 目标字符串
   * @return word 中最长美丽子字符串的长度
   */
  public int longestBeautifulSubstring(String word) {
    // 结果
    int result = 0;
    // 当前的字符类型
    byte type = 0;
    // 长度
    int length = 1;

    // 迭代，从 1 开始，因为要比较前一个
    for (int i = 1; i < word.length(); ++i) {
      // 如果是美丽的，长度增加
      if (word.charAt(i) >= word.charAt(i - 1)) {
        ++length;
      }
      // 更新了字符，type 增加
      if (word.charAt(i) > word.charAt(i - 1)) {
        ++type;
      }
      // 不漂亮了，重置
      if (word.charAt(i) < word.charAt(i - 1)) {
        type = 0;
        length = 1;
      }
      // 必须要包含五个种类
      if (type == 4) {
        // 更新结果
        result = Math.max(result, length);
      }
    }
    return result;
  }
}
