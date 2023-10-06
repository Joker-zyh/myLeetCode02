package com.henu.yaheng.array;

public class Solution04 {
    public int mySqrt(int x) {
        //二分查找，从1到x/2

        int ans = 0;
        int left = 1;
        int right = x/2;
        while (left <= right){
            int middle = (right - left)/2 + left;
            if ((long) middle * middle <= x){
                ans = middle;
                left = middle+1;
            }else {
                right = middle - 1;
            }
        }
        return ans;
    }
}
