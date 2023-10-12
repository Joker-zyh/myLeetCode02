package com.henu.yaheng.linked_list;
import com.henu.yaheng.linked_list.MyLinkedList.ListNode;

public class Solution06 {
    public ListNode detectCycle(ListNode head) {
        //先出发两个指针，快指针一次走两步，慢指针一次走一步，他们相遇时一定是在环内相遇
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            //快慢指针相遇，从出发点和相遇点各自再出发两个指针，他们相遇的节点即为入口节点。
            if (fast == slow){
                ListNode index1 = head;
                ListNode index2 = fast;
                while (index1 != index2){
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index1; // 节点入口
            }
        }
        return null;
    }
}
