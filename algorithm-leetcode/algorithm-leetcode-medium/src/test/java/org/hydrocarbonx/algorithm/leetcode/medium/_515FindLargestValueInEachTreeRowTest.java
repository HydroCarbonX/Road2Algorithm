package org.hydrocarbonx.algorithm.leetcode.medium;

import lombok.extern.slf4j.Slf4j;
import org.hydrocarbonx.algorithm.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author HydroCarbon
 * @since 2022-06-24
 */
@Slf4j
@SuppressWarnings("all")
class _515FindLargestValueInEachTreeRowTest {

  @Test
  void largestValues() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(3);
    root.right = new TreeNode(2);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(3);
    root.right.right = new TreeNode(9);

    List<Integer> result = new _515FindLargestValueInEachTreeRow().largestValues(root);

    log.info("{}", result);
  }
}
