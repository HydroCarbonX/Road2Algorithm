package org.hydrocarbonx.algorithm.basic.sort;

/**
 * 排序的接口，抽离出公共的方法声明。
 *
 * @author HydroCarbon
 * @since 2022-05-29
 */
public interface ISort {

    /**
     * 排序方法，方法会将 data 进行排序（自然序）
     *
     * @param data 源数据
     * @param <T>  data 类型，必须实现 {@link Comparable}
     */
    <T extends Comparable<T>> void sort(T[] data);

    /**
     * 交换 data 中指定位置的两个值。
     *
     * @param data   源数据
     * @param index1 第一个值的 index
     * @param index2 第二个值的 index
     * @param <T>    data 的类型，必须实现 {@link Comparable}
     */
    default <T extends Comparable<T>> void swapValue(T[] data, int index1, int index2) {
        T tempValue = data[index1];
        data[index1] = data[index2];
        data[index2] = tempValue;
    }
}
