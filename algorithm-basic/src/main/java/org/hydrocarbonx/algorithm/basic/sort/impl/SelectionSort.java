package org.hydrocarbonx.algorithm.basic.sort.impl;

import org.hydrocarbonx.algorithm.basic.sort.ISort;

/**
 * 选择排序。
 * <a href="https://zh.wikipedia.org/zh-cn/%E9%80%89%E6%8B%A9%E6%8E%92%E5%BA%8F">选择排序 wiki</a>
 *
 * @author HydroCarbon
 * @since 2022-05-29
 */
public class SelectionSort implements ISort {

    /**
     * 每轮选择一个数到正确位置。
     * 最多只需要交换 n 次。
     *
     * @param data 源数据
     * @param <T>  data 类型，必须实现 {@link Comparable}
     */
    @Override
    public <T extends Comparable<T>> void sort(T[] data) {
        // 边界判断
        if (Boolean.TRUE.equals(cannotSort(data))) {
            return;
        }

        int length = data.length;

        // 记录当前的最小值的 index
        int minIndex;
        for (int i = 0; i < length; i++) {
            // 置为当前轮次默认的
            minIndex = i;

            // 遍历看能不能找到更小的值，走到就替换 minIndex
            for (int j = i; j < length; j++) {
                if (data[minIndex].compareTo(data[j]) > 0) {
                    minIndex = j;
                }
            }

            // 如果 minIndex 变了说明存在更小的值
            // 进行交换
            if (minIndex != i) {
                swapValue(data, i, minIndex);
            }
        }
    }
}
