package com.henu.yaheng.stack;

import java.util.Deque;
import java.util.LinkedList;

public class Solution05 {
    public int evalRPN(String[] tokens) {
        //定义栈，遇到符号就出栈两个元素进行运算，运算结果再压入栈中
        Deque<Integer> deque = new LinkedList<>();
        for (String s :tokens) {
            if (s.equals("+")){
                Integer num1 = deque.pop();
                Integer num2 = deque.pop();
                deque.push(num1 + num2);
            }else if (s.equals("-")){
                Integer num1 = deque.pop();
                Integer num2 = deque.pop();
                deque.push(num2 - num1);
            }else if (s.equals("*")){
                Integer num1 = deque.pop();
                Integer num2 = deque.pop();
                deque.push(num2 * num1);
            }else if (s.equals("/")){
                Integer num1 = deque.pop();
                Integer num2 = deque.pop();
                deque.push(num2 / num1);
            }else {
                deque.push(Integer.parseInt(s));
            }
        }
        return deque.pop();
    }
}
