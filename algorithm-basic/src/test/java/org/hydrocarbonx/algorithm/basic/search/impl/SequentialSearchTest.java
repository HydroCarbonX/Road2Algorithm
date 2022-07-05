package org.hydrocarbonx.algorithm.basic.search.impl;

import org.hydrocarbonx.algorithm.basic.search.ISearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author HydroCarbon
 * @since 2022-05-31
 */
class SequentialSearchTest {

    @Test
    void search() {
        Integer[] integerArray = new Integer[]{1, 2, 3, 4, 23, 34, 65, 765, 876};
        int key = 23;

        ISearch search = new SequentialSearch();

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
        Assertions.assertEquals(3, result);

        integerArray = new Integer[]{1, 2, 34, 2, 3, 4, 23, 2};
        key = 2;
        Assertions.assertEquals(1, search.search(integerArray, key));
    }
}
