package org.hydrocarbonx.algorithm.leetcode.medium;

import org.hydrocarbonx.algorithm.leetcode.common.TreeNode;

import java.util.Objects;

/**
 * <a
 * href="https://leetcode.cn/problems/find-bottom-left-tree-value/">https://leetcode.cn/problems/find-bottom-left-tree-value/</a>
 *
 * @author HydroCarbon
 * @since 2022-06-22
 */
@SuppressWarnings("java:S101")
public class _513FindBottomLeftTreeValue {

  // 当前最底层左节点值
  int curValue = 0;
  // 当前深度
  int curHeight = 0;

  /**
   * 返回树上最底层最左边节点的值。
   *
   * <p>如果 root 是 null，会返回 0。
   *
   * @param root 树的根节点
   * @return 以 root 为根节点的树上最底层左边节点的值
   */
  public int findBottomLeftValue(TreeNode root) {
    // 边界值校验
    if (Objects.isNull(root)) {
      return curValue;
    }

    // 从第一层开始执行深度优先搜索
    dfs(root, 0);
    return curValue;
  }

  /**
   * 深度优先搜索的算法。
   *
   * @param root 搜索开始的节点
   * @param height 深度
   */
  private void dfs(TreeNode root, int height) {
    // 终止条件
    if (Objects.isNull(root)) {
      return;
    }

    // 增加深度
    ++height;
    // 递归左右子树
    dfs(root.left, height);
    dfs(root.right, height);

    // 更新数值
    if (height > curHeight) {
      curHeight = height;
      curValue = root.val;
    }
  }
}
