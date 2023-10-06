package com.henu.yaheng.linked_list;
import com.henu.yaheng.linked_list.MyLinkedList.ListNode;
public class Solution03 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        //定义指针
        ListNode preHead = new ListNode(0,head);
        ListNode pre = preHead;
        ListNode cur = head;
        ListNode next;

        while (cur != null && cur.next != null){
            //定义变量保存地址
            next = cur.next;
            ListNode temp = next.next;
            //交换
            pre.next = next;
            next.next = cur;
            cur.next = temp;
            //移动
            pre = cur;
            cur = temp;
        }
        return preHead.next;
    }
}
