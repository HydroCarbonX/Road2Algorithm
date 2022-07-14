package org.hydrocarbonx.algorithm.basic.sort.impl;

import org.hydrocarbonx.algorithm.basic.sort.ISort;

/**
 * 希尔排序。 <a href="https://zh.wikipedia.org/zh-cn/%E5%B8%8C%E5%B0%94%E6%8E%92%E5%BA%8F">希尔排序 wiki</a>
 *
 * @author HydroCarbon
 * @since 2022-05-30
 */
public class ShellSort implements ISort {

  /**
   * 将原始数据按 step 阶进行插入排序，最终只要 step 为 1 就可以保证数据是整体有序的。
   *
   * @param data 源数据
   * @param <T> data 的类型，必须实现 {@link Comparable}
   */
  @Override
  public <T extends Comparable<T>> void sort(T[] data) {
    // 检查
    if (Boolean.TRUE.equals(cannotSort(data))) {
      return;
    }

    int length = data.length;

    T tempValue;
    // 步长默认是长度的一半，每次将步长缩小一倍。知道最后变成 1
    for (int step = length / 2; step >= 1; step /= 2) {
      for (int i = step; i < length; ++i) {
        // 这个值必须要缓存起来，不让可能会被 data[j + step] 盖掉
        tempValue = data[i];

        int j = i - step;
        while (j >= 0 && data[j].compareTo(tempValue) > 0) {
          data[j + step] = data[j];
          j -= step;
        }
        data[j + step] = tempValue;
      }
    }
  }
}
