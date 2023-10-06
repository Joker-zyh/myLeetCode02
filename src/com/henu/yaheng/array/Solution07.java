package com.henu.yaheng.array;

public class Solution07 {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int index = ans.length-1;

        int left = 0;
        int right = nums.length-1;
        while (left <= right){
            int leftPow = nums[left] * nums[left];
            int rightPow = nums[right] * nums[right];
            if (leftPow <= rightPow){
                ans[index] = rightPow;
                right--;
            }else{
                ans[index] = leftPow;
                left++;
            }
            index--;
        }
        return ans;
    }
}
