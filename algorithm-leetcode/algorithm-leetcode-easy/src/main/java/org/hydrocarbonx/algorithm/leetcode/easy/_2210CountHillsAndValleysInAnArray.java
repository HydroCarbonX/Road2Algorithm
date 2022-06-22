package org.hydrocarbonx.algorithm.leetcode.easy;

/**
 * <a href="https://leetcode.cn/problems/count-hills-and-valleys-in-an-array/">https://leetcode.cn/problems/count-hills-and-valleys-in-an-array/</a>
 *
 * @author HydroCarbon
 * @since 2022-06-22
 */
@SuppressWarnings("java:S101")
public class _2210CountHillsAndValleysInAnArray {

    /**
     * 计算数组中的峰谷数。
     * <p>
     * 使用一个 flag 来判断当前是上升还是下降的，据此来判断是否存在峰谷。
     * 并针对峰谷进行计数。
     *
     * @param nums 目标数组
     * @return nums 中的峰谷数
     */
    public int countHillValley(int[] nums) {
        // flag 是 1 表示上升，是 -1 表示下降
        byte flag = 0;
        int result = 0;

        // 迭代数组判断 flag 的变化，根据变化来判断峰和谷
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                if (flag == -1) {
                    ++result;
                }
                flag = 1;
            }
            if (nums[i] < nums[i - 1]) {
                if (flag == 1) {
                    ++result;
                }
                flag = -1;
            }
        }
        return result;
    }
}
