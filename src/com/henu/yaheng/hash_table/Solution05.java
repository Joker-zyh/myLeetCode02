package com.henu.yaheng.hash_table;

import java.util.HashMap;
import java.util.Map;

public class Solution05 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        //遍历两个数组，将其元素之和出现的次数记录在map中
        Map<Integer,Integer> map = new HashMap<>();
        for (int num1 : nums1){
            for (int num2 : nums2){
                int sum = num1 + num2;
                map.put(sum,map.getOrDefault(sum,0) + 1);
            }
        }

        //遍历后两个数组，将0 - (c+d)与map中key比较，若有则结果加上map中的val
        int ans = 0;
        for (int num3 : nums3){
            for (int num4 : nums4){
                int sum = -num3 - num4;
                if (map.containsKey(sum)){
                    ans += map.get(sum);
                }
            }
        }
        return ans;
    }
}
