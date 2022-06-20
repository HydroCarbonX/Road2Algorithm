package org.hydrocarbonx.algorithm.leetcode.common;

/**
 * LeetCode 中使用到的单向链表结构。
 *
 * @author HydroCarbon
 * @since 2022-06-20
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
