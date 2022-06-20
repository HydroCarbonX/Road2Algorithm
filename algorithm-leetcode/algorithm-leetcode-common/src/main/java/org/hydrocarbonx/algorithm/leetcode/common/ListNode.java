package org.hydrocarbonx.algorithm.leetcode.common;

/**
 * LeetCode 中使用到的单向链表结构。
 *
 * @author HydroCarbon
 * @since 2022-06-20
 */
@SuppressWarnings({"unused", "java:S1104"})
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
