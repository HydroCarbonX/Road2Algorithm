package org.hydrocarbonx.algorithm.leetcode.medium;

import lombok.extern.slf4j.Slf4j;
import org.hydrocarbonx.algorithm.leetcode.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author HydroCarbon
 * @since 2022-06-22
 */
@Slf4j
@SuppressWarnings("all")
class _513FindBottomLeftTreeValueTest {

    @Test
    void findBottomLeftValue() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        int result = new _513FindBottomLeftTreeValue().findBottomLeftValue(root);
        Assertions.assertEquals(2, result);

        root.left.left = new TreeNode(4);

        result = new _513FindBottomLeftTreeValue().findBottomLeftValue(root);
        Assertions.assertEquals(4, result);

        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);

        result = new _513FindBottomLeftTreeValue().findBottomLeftValue(root);
        Assertions.assertEquals(7, result);
    }
}
