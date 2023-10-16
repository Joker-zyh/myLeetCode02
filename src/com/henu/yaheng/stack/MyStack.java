package com.henu.yaheng.stack;

import java.util.Deque;
import java.util.LinkedList;

public class MyStack {
    //定义队列
    private Deque<Integer> deque;

    public MyStack() {
        deque = new LinkedList<>();
    }

    public void push(int x) {
        deque.offerLast(x);
    }

    public int pop() {
        makeTailToHeader();
        return deque.pollFirst();
    }

    public int top() {
        makeTailToHeader();
        Integer integer = deque.pollFirst();
        deque.offerLast(integer);
        return integer;
    }

    public boolean empty() {
        if (deque.isEmpty()){
            return true;
        }
        return false;
    }

    //当需要弹出栈顶元素和查看栈顶元素时，依次出队再入队，直至队尾元素成为队首元素，其余元素顺序不变
    private void makeTailToHeader(){
        for (int i = 0; i < deque.size()-1; i++) {
            Integer integer = deque.pollFirst();
            deque.offerLast(integer);
        }
    }
}
