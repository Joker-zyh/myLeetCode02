package com.henu.yaheng.array;

public class Solution01 {
    public int search(int[] nums, int target) {
        //二分查找，定义左右指针
        int left = 0;
        int right = nums.length - 1;
        //循环，取中间数与Target比较，小于t则将l赋给m，大于则将r赋给m
        // 直到找到Target或者left>right
        while (left <= right){
            int middle = (right - left)/2 + left;
            if (nums[middle] < target){
                left = middle + 1;
            }else if (nums[middle] > target){
                right = middle - 1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
