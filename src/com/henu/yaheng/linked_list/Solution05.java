package com.henu.yaheng.linked_list;
import com.henu.yaheng.linked_list.MyLinkedList.ListNode;

public class Solution05 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != curB){
            curA = curA == null?headB:curA.next;
            curB = curB == null?headA:curB.next;
        }
        return curA;

        /*ListNode curA = headA;
        ListNode curB = headB;
        int lenA = 0;
        int lenB = 0;
        //求A链表长度
        while (curA != null){
            curA = curA.next;
            lenA++;
        }
        //求B链表长度
        while (curB != null){
            curB = curB.next;
            lenB++;
        }
        if (lenA < lenB){
            int temp = lenA;
            lenA = lenB;
            lenB = temp;

            ListNode node = headA;
            headA = headB;
            headB = node;
        }
        curA = headA;
        curB = headB;
        //让A向后移动差值位
        for (int i = 0; i < lenA - lenB; i++) {
            curA = curA.next;
        }
        while (curA != null){
            if (curA == curB){
                return curA;
            }
            curA = curA.next;
            curB = curB.next;
        }
        return null;
*/
    }
}
