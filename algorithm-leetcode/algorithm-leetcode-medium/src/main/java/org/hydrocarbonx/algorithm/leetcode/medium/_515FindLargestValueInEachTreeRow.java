package org.hydrocarbonx.algorithm.leetcode.medium;

import org.hydrocarbonx.algorithm.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <a
 * href="https://leetcode.cn/problems/find-largest-value-in-each-tree-row/">https://leetcode.cn/problems/find-largest-value-in-each-tree-row/</a>
 *
 * @author HydroCarbon
 * @since 2022-06-24
 */
@SuppressWarnings("java:S101")
public class _515FindLargestValueInEachTreeRow {
  final List<Integer> result = new ArrayList<>();

  /**
   * 获取 root 树的每一层最大的接节点值。
   *
   * @param root 树的根节点
   * @return root 中每一层的最大值列表
   */
  public List<Integer> largestValues(TreeNode root) {
    // 从 0 层开始深度搜索
    dfs(root, 0);
    return result;
  }

  /**
   * 深度优先搜索每一层的最大节点。
   *
   * @param root 根节点
   * @param height 当前的深度
   */
  private void dfs(TreeNode root, int height) {
    // 跳出条件
    if (root == null) {
      return;
    }

    // 如果是当前层的第一个节点，就加入到列表中
    if (height == result.size()) {
      result.add(root.val);
    } else {
      // 将节点置为更大的
      result.set(height, Math.max(result.get(height), root.val));
    }

    // 迭代左右子树的结点
    dfs(root.left, height + 1);
    dfs(root.right, height + 1);
  }
}
