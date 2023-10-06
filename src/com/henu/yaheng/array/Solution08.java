package com.henu.yaheng.array;

public class Solution08 {
    public int minSubArrayLen(int target, int[] nums) {

        int ans = Integer.MAX_VALUE;
        int sum = 0;
        int subLength = 0;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            while (sum >= target){
                subLength = i - start + 1;
                ans = Math.min(subLength,ans);
                sum -= nums[start];
                start++;
            }
        }
        return ans == Integer.MAX_VALUE? 0:ans;


        /*int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum >= target){
                    ans =  Math.min(ans,j - i + 1);
                    break;
                }
            }
        }
        return ans == Integer.MAX_VALUE?0:ans;*/
    }
}
