package org.hydrocarbonx.algorithm.leetcode.medium;

import lombok.extern.slf4j.Slf4j;
import org.hydrocarbonx.algorithm.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * @author HydroCarbon
 * @since 2022-06-20
 */
@Slf4j
@SuppressWarnings("all")
class _143ReorderListTest {

  @Test
  void reorderList() {
    ListNode node = new ListNode();
    ListNode head = node;

    for (int i = 0; i < 10; i++) {
      node.val = i;
      node.next = new ListNode();
      node = node.next;
    }

    log.info("当前 ListNode 为 {}", head);

    new _143ReorderList().reorderList(head);

    log.info("现在 ListNode 为 {}", head);
  }
}
