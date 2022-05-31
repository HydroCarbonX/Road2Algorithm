package org.hydrocarbonx.algorithm.basic.search.impl;

import org.hydrocarbonx.algorithm.basic.search.ISearch;

import java.util.Objects;

/**
 * 顺序查找。
 *
 * @author HydroCarbon
 * @since 2022-05-31
 */
public class SequentialSearch implements ISearch {

    /**
     * 在 data 中顺序查找 key。
     * 如果 data 中 key 出现多次，返回的是第一次出现的位置。
     *
     * @param data 源数据
     * @param key  要查找的值
     * @param <T>  data 的类型，{@link Comparable} 的实现
     * @return key 在 data 中首次出现的位置，未出现返回 -1
     */
    @Override
    public <T extends Comparable<T>> int search(T[] data, T key) {
        // 边界判断
        if (Objects.isNull(data) || data.length == 0) {
            return -1;
        }

        int length = data.length;

        // 直接迭代整个 data 来查找
        for (int i = 0; i < length; i++) {
            // 匹配到直接 return
            if (data[i].compareTo(key) == 0) {
                return i;
            }
        }
        // 未匹配到
        return -1;
    }
}
