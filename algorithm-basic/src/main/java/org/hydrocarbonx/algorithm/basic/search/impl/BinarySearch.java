package org.hydrocarbonx.algorithm.basic.search.impl;

import org.hydrocarbonx.algorithm.basic.search.ISearch;

import java.util.Objects;

/**
 * 二分查找。 <a
 * href="https://zh.wikipedia.org/zh-cn/%E4%BA%8C%E5%88%86%E6%90%9C%E5%B0%8B%E6%BC%94%E7%AE%97%E6%B3%95">二分查找
 * wiki</a>
 *
 * @author HydroCarbon
 * @since 2022-05-30
 */
public class BinarySearch implements ISearch {

  /**
   * 查找方法。 当 data 中存在多个值等于 key 的时候，无法保证找到的值是拿一个。
   *
   * @param data 源数据
   * @param key 要查找的值
   * @param <T> data 的类型，{@link Comparable} 的实现类
   * @return key 在 data 中的位置，从 0 开始
   */
  @Override
  public <T extends Comparable<T>> int search(T[] data, T key) {
    // 边界校验
    if (Objects.isNull(data)) {
      return -1;
    }

    // 检查是否是有序的
    if (!isSorted(data)) {
      // 无序的直接抛出异常
      throw new IllegalArgumentException("无法进行二分查找，请确保 data 参数是有序的！");
    }
    // 执行二分查找
    return binarySearch(data, key, data.length);
  }

  /**
   * 进行二分查找方法。
   *
   * @param data 源数据
   * @param key 目标值
   * @param endIndex 结束 index
   * @param <T> data 的类型，{@link Comparable} 的实现类
   * @return key 在 data 中的位置，从 0 开始
   */
  private <T extends Comparable<T>> int binarySearch(T[] data, T key, int endIndex) {
    int startIndex = 0;
    // 边界条件
    while (startIndex < endIndex) {
      // 这里使用 >>> 防止溢出
      int midIndex = (startIndex + endIndex) >>> 1;

      if (data[midIndex].compareTo(key) > 0) {
        // 在左侧
        endIndex = midIndex - 1;
      } else if (data[midIndex].compareTo(key) < 0) {
        // 在右侧
        startIndex = midIndex + 1;
      } else {
        // 匹配到了
        return midIndex;
      }
    }
    // 未匹配到
    return -1;
  }

  /**
   * 判断 data 是否是升序的。
   *
   * @param data 源数据
   * @param <T> data 的类型，{@link Comparable} 的实现类
   * @return data 是升序则返回 true，否则返回 false
   */
  private <T extends Comparable<T>> boolean isSorted(T[] data) {
    T last = data[0];

    for (T value : data) {
      if (last.compareTo(value) > 0) {
        return false;
      }
      last = value;
    }
    return true;
  }
}
