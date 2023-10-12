package com.henu.yaheng.hash_table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution08 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //四数之和，和三数之和类似，只不过在其for循环外再套一层for循环。N数之和也同样如此。
        //排序，结果不要求顺序，且要根据元素大小进行剪枝和移动指针
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
            //剪枝
            if (nums[i] > target && nums[i] > 0){
                break;
            }
            //去重
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            //第二次for循环
            for (int j = i + 1; j < nums.length; j++) {
                //剪枝
                if (nums[i] + nums[j] > target && nums[i] + nums[j] >0){
                    break;
                }
                //去重
                if (j > i + 1 && nums[j] == nums[j-1]){
                    continue;
                }

                //定义双指针开始操作
                int left = j + 1;
                int right = nums.length-1;

                while (left < right){
                    //判断四元组之和是否为零，不是要根据正负分别移动left和right，是的话要去重
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum > target){
                        right--;
                    }else if (sum < target){
                        left++;
                    }else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        ans.add(list);

                        //去重
                        while (right >= left && nums[right] == nums[right-1])right--;
                        while (left <= right && nums[left] == nums[left+1]) left++;

                        //移动指针
                        left++;
                        right--;
                    }
                }
            }
        }
        return ans;
    }
}
