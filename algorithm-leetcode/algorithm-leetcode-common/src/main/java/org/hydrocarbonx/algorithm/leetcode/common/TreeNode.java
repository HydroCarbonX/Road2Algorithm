package org.hydrocarbonx.algorithm.leetcode.common;

/**
 * LeetCode 中的二叉树结构
 *
 * @author HydroCarbon
 * @since 2022-06-22
 */
@SuppressWarnings({"java:S1104", "unused"})
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
