package org.hydrocarbonx.algorithm.leetcode.medium;

import org.hydrocarbonx.algorithm.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <a
 * href="https://leetcode.cn/problems/reorder-list/">https://leetcode.cn/problems/reorder-list/</a>
 *
 * @author HydroCarbon
 * @since 2022-06-20
 */
@SuppressWarnings("java:S101")
public class _143ReorderList {

  /**
   * 主要是要理清楚，start 和 end 改变的条件。
   *
   * @param head 链表头
   */
  public void reorderList(ListNode head) {
    // 边界校验
    if (head == null || head.next == null) {
      return;
    }

    // 将链表存到一个 list 中，根据索引进行访问
    List<ListNode> nodeList = new ArrayList<>();
    ListNode node = head;

    while (node != null) {
      nodeList.add(node);
      node = node.next;
    }

    int start = 0;
    int end = nodeList.size() - 1;

    while (start < end) {
      nodeList.get(start).next = nodeList.get(end);
      ++start;

      if (start == end) {
        break;
      }

      nodeList.get(end).next = nodeList.get(start);
      --end;
    }
    nodeList.get(start).next = null;
  }
}
