/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0, bit = 0, sumBit = 0;
        ListNode pointer, sumL = new ListNode(0);
        pointer = sumL;
        while (l1 != null || l2 != null || carry != 0) {
            sumBit = (l1==null?0:l1.val)+(l2==null?0:l2.val)+carry;
            carry = sumBit/10;
            bit = sumBit%10;
            pointer.next = new ListNode(bit);
            pointer = pointer.next;
            l1 = l1!=null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        return sumL.next;
    }
}

