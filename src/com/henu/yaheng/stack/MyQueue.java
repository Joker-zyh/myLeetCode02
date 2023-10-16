package com.henu.yaheng.stack;

import java.util.Deque;
import java.util.LinkedList;

public class MyQueue {
    //定义进入栈
    private Deque<Integer> deque1;
    //定义弹出栈
    private Deque<Integer> deque2;

    public MyQueue() {
        deque1 = new LinkedList<>();
        deque2 = new LinkedList<>();
    }

    public void push(int x) {
        deque1.push(x);
    }

    public int pop() {
        if (deque2.isEmpty()){
            exchange();
        }
        return deque2.pop();
    }

    public int peek() {
        if (deque2.isEmpty()){
            exchange();
        }
        return deque2.peek();
    }

    public boolean empty() {
        if (deque1.isEmpty() && deque2.isEmpty()){
            return true;
        }
        return false;
    }

    //当需要弹出队首元素和查看队首元素时，将进入栈元素弹出并压入弹出栈
    private void exchange(){
        while (!deque1.isEmpty()){
            Integer pop = deque1.pop();
            deque2.push(pop);
        }
    }
}
