package org.hydrocarbonx.algorithm.basic.sort.impl;

import org.hydrocarbonx.algorithm.basic.sort.ISort;

/**
 * 冒泡排序。 <a href="https://zh.wikipedia.org/zh-cn/%E5%86%92%E6%B3%A1%E6%8E%92%E5%BA%8F">冒泡排序 wiki</a>
 *
 * @author HydroCarbon
 * @since 2022-05-29
 */
public class BubbleSort implements ISort {

  /**
   * 每轮能将一个值冒泡到正确的位置。
   *
   * @param data 源数据
   * @param <T> data 的类型，实现 {@link Comparable}
   */
  @Override
  public <T extends Comparable<T>> void sort(T[] data) {
    // 长度小于 2 直接返回，不需要排序
    if (Boolean.TRUE.equals(cannotSort(data))) {
      return;
    }

    int length = data.length;

    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length - i - 1; j++) {
        if (data[j].compareTo(data[j + 1]) > 0) {
          // 交换数据
          swapValue(data, j, j + 1);
        }
      }
    }
  }
}
