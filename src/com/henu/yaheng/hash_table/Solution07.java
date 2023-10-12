package com.henu.yaheng.hash_table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution07 {
    public List<List<Integer>> threeSum(int[] nums) {
        //先排序，题目对顺序没要求，我们要根据元素的大小来移动指针
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        //使用双指针法，left从i+1开始，right从数组末尾开始
        for (int i = 0; i < nums.length; i++) {
            //在进行寻找三元组之前，要先对nums[i]去重
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int left = i+1;
            int right = nums.length-1;

            while (left < right){
                //判断三元组之和是否为零，不是要根据正负分别移动left和right，是的话要去重
                if (nums[i] + nums[left] + nums[right] > 0){
                    right--;
                }else if (nums[i] + nums[left] + nums[right] < 0){
                    left++;
                }else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    ans.add(list);

                    //去重
                    while (right >= left && nums[right] == nums[right-1])right--;
                    while (left <= right && nums[left] == nums[left+1])left++;

                    //移动指针
                    left++;
                    right--;
                }
            }
        }
        return ans;
    }
}
