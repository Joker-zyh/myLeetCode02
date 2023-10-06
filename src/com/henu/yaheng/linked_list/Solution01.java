package com.henu.yaheng.linked_list;

public class Solution01 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null){
            return head;
        }
        ListNode preHead = new ListNode(0,head);
        ListNode cur = preHead;

        while (cur.next != null){
            if (cur.next.val == val){
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }

        }
        return preHead.next;
    }
}
