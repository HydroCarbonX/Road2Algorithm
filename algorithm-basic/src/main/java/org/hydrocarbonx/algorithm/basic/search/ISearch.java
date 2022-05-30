package org.hydrocarbonx.algorithm.basic.search;

/**
 * 查找算法的通用接口。
 *
 * @author HydroCarbon
 * @since 2022-05-30
 */
public interface ISearch {

    /**
     * 搜索 key 在 data 中的位置。
     *
     * @param data 源数据
     * @param key  要查找的值
     * @param <T>  data 的类型，{@link Comparable} 的实现类
     * @return key 在 data 中出现的位置，不存在则返回 -1
     */
    <T extends Comparable<T>> int search(T[] data, T key);
}
