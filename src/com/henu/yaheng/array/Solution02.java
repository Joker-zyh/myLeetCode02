package com.henu.yaheng.array;

public class Solution02 {
    public int searchInsert(int[] nums, int target) {
        // 1. 定义双指针
        int left = 0;
        int right = nums.length-1;
        // 2. 循环，二分查找
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
        // 3. 若找到返回下标，若没有找到比较t和num[l]的值，t大在右，t小在左
        return right+1;
    }
}
