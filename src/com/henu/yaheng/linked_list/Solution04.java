package com.henu.yaheng.linked_list;

import com.henu.yaheng.linked_list.MyLinkedList.ListNode;
public class Solution04 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode preHead = new ListNode(0,head);
        ListNode fast = preHead;
        ListNode slow = preHead;
        for (int i = 0; i < n+1; i++) {
            fast = fast.next;
        }
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return preHead.next;
    }
}
