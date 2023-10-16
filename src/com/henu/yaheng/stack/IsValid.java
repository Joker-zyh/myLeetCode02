package com.henu.yaheng.stack;

import java.nio.file.PathMatcher;
import java.util.Deque;
import java.util.LinkedList;

public class IsValid {
    public boolean isValid(String s) {
        //定义栈。遇到左括号入栈，遇到右括号出栈进行比较
        //成功的条件：当字符串遍历完后，栈为空
        //失败：匹配的括号类型不同，遍历字符串时栈为空，遍历完字符串时栈不为空
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            //判断该字符是什么
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{'){
                deque.push(c);
            }else {
                if (deque.isEmpty()){
                    return false;
                }
                char pop = deque.pop();
                if ((pop == '(' && c != ')') || (pop == '[' && c != ']') || (pop == '{' && c != '}')){
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }

}
