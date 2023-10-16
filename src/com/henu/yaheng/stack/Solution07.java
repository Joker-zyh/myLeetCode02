package com.henu.yaheng.stack;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution07 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i :nums) {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        //comparator接口，返回值为负数，第一个参数在前，返回值为正，第二个参数在前
        //所以从大到小排序，arg2 - arg1.
        //从小到大排序，arg1 - arg2.
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });

        //队列从头到尾，数值从大到小，这是大顶堆。
        map.entrySet().forEach(entry -> {
            priorityQueue.add(new int[]{entry.getKey(),entry.getValue()});
        });

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = priorityQueue.poll()[0];
        }
        return ans;

    }
}
