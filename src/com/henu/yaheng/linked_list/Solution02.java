package com.henu.yaheng.linked_list;
import com.henu.yaheng.linked_list.MyLinkedList.ListNode;

public class Solution02 {
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
        }
        return pre;
    }
}
