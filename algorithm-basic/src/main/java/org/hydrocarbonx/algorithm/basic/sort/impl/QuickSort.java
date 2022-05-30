package org.hydrocarbonx.algorithm.basic.sort.impl;

import org.hydrocarbonx.algorithm.basic.sort.ISort;

/**
 * 快速排序。
 * <a href="https://zh.wikipedia.org/zh-cn/%E5%BF%AB%E9%80%9F%E6%8E%92%E5%BA%8F">快速排序 wiki</a>
 *
 * @author HydroCarbon
 * @since 2022-05-30
 */
public class QuickSort implements ISort {

    @Override
    public <T extends Comparable<T>> void sort(T[] data) {
        // 边界值校验
        if (Boolean.TRUE.equals(cannotSort(data))) {
            return;
        }
        // 进行快排，范围是 [0, length - 1]
        quickSort(data, 0, data.length - 1);
    }

    /**
     * 快速排序的方法。
     *
     * @param data       源数据
     * @param startIndex 起始 index
     * @param endIndex   结束 index
     * @param <T>        data 类型，必须实现 {@link Comparable}
     */
    private <T extends Comparable<T>> void quickSort(T[] data, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            // 找到 pivot 的 index
            int pivotIndex = partition(data, startIndex, endIndex);

            // 对两侧数据分别快排
            quickSort(data, startIndex, pivotIndex - 1);
            quickSort(data, pivotIndex + 1, endIndex);
        }
    }

    /**
     * 分片的方法，负责找到 pivot 的 index。
     *
     * @param data       源数据
     * @param startIndex 起始 index
     * @param endIndex   结束 index
     * @param <T>        data 类型，必须实现 {@link Comparable}
     * @return 基准值的索引
     */
    private <T extends Comparable<T>> int partition(T[] data, int startIndex, int endIndex) {
        T pivot = data[startIndex];

        while (startIndex < endIndex) {
            // 从 end 往前找到第一个比 pivot 小的元素
            while (startIndex < endIndex && data[endIndex].compareTo(pivot) > 0) {
                --endIndex;
            }
            data[startIndex] = data[endIndex];

            // 从 start 往后找到第一个比 pivot 大的元素
            while (startIndex < endIndex && data[startIndex].compareTo(pivot) < 0) {
                ++startIndex;
            }
            data[endIndex] = data[startIndex];
        }
        data[startIndex] = pivot;
        return startIndex;
    }
}
