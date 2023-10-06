package com.henu.yaheng.array;

public class Solution03 {
    public int[] searchRange(int[] nums, int target) {
        //定义左右指针，二分查找
        int left = 0;
        int right = nums.length-1;
        while (left <= right){
            int middle = (right - left)/2 + left;
            if (nums[middle] < target){
                left = middle + 1;
            }else if (nums[middle] > target){
                right = middle - 1;
            }else {
                left = middle;
                right = middle;

                //左右滑动寻找边界
                while (left - 1 >= 0 && nums[left-1] == target) left--;
                while (right + 1 < nums.length && nums[right + 1] == target) right++;

                return new int[]{left,right};
            }
        }
        // 若找到t值，左右指针分别向两边移动，找到最左和最右下标
        // 若找不到，返回[-1,-1]
        return new int[]{-1,-1};
    }
}
