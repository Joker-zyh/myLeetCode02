package com.henu.yaheng.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class RemoveDuplicates {
    public String removeDuplicates(String s) {
        //定义栈，每次每个数和栈顶元素比较，相同栈顶元素出栈，不同该元素入栈
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!deque.isEmpty() && c == deque.peek()){
                deque.pop();
            }else {
                deque.push(c);
            }
        }
        String ans = "";
        while (!deque.isEmpty()){
            ans = deque.pop() + ans;
        }
        return ans;
    }
}
