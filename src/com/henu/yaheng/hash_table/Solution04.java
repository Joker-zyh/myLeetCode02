package com.henu.yaheng.hash_table;

import java.util.HashMap;
import java.util.Map;

public class Solution04 {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int sub = target - nums[i];
            if (map.containsKey(sub)){
                ans[0] = i;
                ans[1] = map.get(sub);
            }else {
                map.put(nums[i],i);
            }
        }
        return ans;



        /*//先把个元素及其下标存入map
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }

        //遍历每一位，判断map中是否存在target与其之差的元素
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                Integer index = map.get(target - nums[i]);
                if (index == i){
                    continue;
                }
                ans[0] = i;
                ans[1] = index;
            }
        }
        return ans;*/

    }
}
