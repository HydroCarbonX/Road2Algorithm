package org.hydrocarbonx.algorithm.basic.sort.impl;

import org.hydrocarbonx.algorithm.basic.sort.ISort;

import java.util.Objects;

/**
 * 插入排序。
 * <a href="https://zh.wikipedia.org/zh-cn/%E6%8F%92%E5%85%A5%E6%8E%92%E5%BA%8F">插入排序 wiki</a>
 *
 * @author HydroCarbon
 * @since 2022-05-29
 */
public class InsertionSort implements ISort {

    /**
     * 从第二个元素开始，向前搜索，将该元素插入到合适的位置。
     *
     * @param data 源数据
     * @param <T>  data 类型，必须实现 {@link Comparable}
     */
    @Override
    public <T extends Comparable<T>> void sort(T[] data) {
        // 边界值判断
        if (Objects.isNull(data) || data.length < 2) {
            return;
        }

        int length = data.length;

        // 从第二个元素开始迭代
        for (int i = 1; i < length; i++) {
            // 记录当前值
            T curValue = data[i];
            int j = i - 1;
            // 挪出来一个空位置，插入
            while ((j >= 0) && (data[j].compareTo(curValue) > 0)) {
                data[j + 1] = data[j];
                --j;
            }

            // 将当前值插入到合适的位置
            data[j + 1] = curValue;
        }
    }
}
