package com.henu.yaheng.linked_list;

public class MyLinkedList {
    ListNode preHeaderNode;
    int size;

    static class ListNode {
        int val;
        ListNode next;

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

    public MyLinkedList() {
        preHeaderNode = new ListNode();
        size = 0;
    }

    //获取在index处的节点值
    public int get(int index) {
        if (index < 0 || index >= size){
            return -1;
        }
        ListNode cur = preHeaderNode;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.next.val;
    }

    //在添加节点使其成为头结点
    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        node.next = preHeaderNode.next;
        preHeaderNode.next = node;
        size++;
    }

    //在尾部添加节点使其成为尾结点
    public void addAtTail(int val) {
        ListNode node = new ListNode(val);
        ListNode cur = preHeaderNode;
        for (int i = 0; i < size; i++) {
            cur = cur.next;
        }
        cur.next = node;
        size++;
    }

    //在index处添加节点
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size){
            return;
        }
        if (index == size){
            addAtTail(val);
            return;
        }
        ListNode node = new ListNode(val);
        ListNode cur = preHeaderNode;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        node.next = cur.next;
        cur.next = node;
        size++;
    }

    //删除在index处的节点
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size){
            return;
        }
        ListNode cur = preHeaderNode;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        if (cur.next.next == null){
            cur.next = null;
        }else {
            cur.next = cur.next.next;
        }
        size--;
    }
}
