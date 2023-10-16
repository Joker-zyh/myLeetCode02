package com.henu.yaheng.stack;

import java.util.Deque;
import java.util.LinkedList;

public class Solution06 {
     class MyQueue1{ //单调队列，从大到小
        private Deque<Integer> deque = new LinkedList<>();

        //当要弹出的元素与队首（队列中最大的元素）元素相同时，弹出队首元素
        public void pop(int val){
            if (!deque.isEmpty() && val == deque.peekFirst()){
                deque.pollFirst();
            }
        }

        //当插入元素大于队首元素时，将队列中元素全部清除
        public void push(int val){
            while (!deque.isEmpty() && val > deque.peekLast()){
                deque.pollLast();
            }
            deque.offerLast(val);
        }

        public int first(){
            return deque.peekFirst();
        }

    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        MyQueue1 myQueue1 = new MyQueue1();
        for (int i = 0; i < k; i++) {
            myQueue1.push(nums[i]);
        }

        int index = 0;
        ans[index++] = myQueue1.first();

        for (int i = k; i < nums.length; i++) {
            myQueue1.pop(nums[i-k]);
            myQueue1.push(nums[i]);
            ans[index++] = myQueue1.first();
        }
        return ans;
    }



    /*public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            max = Math.max(max,nums[i]);
        }
        int index = 0;
        ans[index++] = max;

        for (int i = k; i < nums.length; i++) {
            max = Math.max(max,nums[i]);
            ans[index++] = max;
        }
        return ans;
    }*/
}
