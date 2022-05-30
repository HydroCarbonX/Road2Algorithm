package org.hydrocarbonx.algorithm.basic.sort;

import java.util.Objects;

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

    /**
     * 判断是否需要排序。
     *
     * @param data 源数据
     * @param <T>  data 的类型，必须实现 {@link Comparable}
     * @return data 不为 null 并且长度要大于 1 返回 true，否则返回 false
     */
    default <T extends Comparable<T>> boolean canSort(T[] data) {
        return Objects.nonNull(data) && data.length > 1;
    }

    /**
     * 判断是否需要排序。
     * 与 {@link #canSort(Comparable[])} 行为相反。
     *
     * @param data 源数据
     * @param <T>  data 的类型，必须实现 {@link Comparable}
     * @return 与 {@link #canSort(Comparable[])} 相反
     */
    default <T extends Comparable<T>> boolean cannotSort(T[] data) {
        return !canSort(data);
    }
}
