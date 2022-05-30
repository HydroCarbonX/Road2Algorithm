package org.hydrocarbonx.algorithm.basic.search.impl;

import lombok.extern.slf4j.Slf4j;
import org.hydrocarbonx.algorithm.basic.search.ISearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author HydroCarbon
 * @since 2022-05-30
 */
@Slf4j
class BinarySearchTest {

    @Test
    void search() {
        Integer[] integerArray = new Integer[]{1, 2, 3, 4, 23, 34, 65, 765, 876};
        int key = 23;

        ISearch search = new BinarySearch();

        int result = search.search(integerArray, key);

        Assertions.assertEquals(4, result);

        key = 999;
        result = search.search(integerArray, key);
        Assertions.assertEquals(-1, result);

        key = 876;
        result = search.search(integerArray, key);
        Assertions.assertEquals(8, result);

        integerArray = new Integer[]{1, 2, 2, 3, 3, 3, 3, 3};
        key = 3;
        result = search.search(integerArray, key);
        Assertions.assertEquals(4, result);

        Integer[] finalIntegerArray = new Integer[]{1, 2, 34, 2, 3, 4, 23, 2};
        int finalKey = 2;
        Assertions.assertThrows(IllegalArgumentException.class, () -> search.search(finalIntegerArray, finalKey));
    }
}
