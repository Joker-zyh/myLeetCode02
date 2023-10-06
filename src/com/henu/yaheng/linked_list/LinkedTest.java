package com.henu.yaheng.linked_list;

import java.util.LinkedList;

public class LinkedTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtTail(1);
        myLinkedList.addAtTail(2);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtTail(4);
        Solution03 solution03 = new Solution03();
        solution03.swapPairs(myLinkedList.preHeaderNode.next);
    }
}
