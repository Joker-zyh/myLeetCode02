package com.henu.yaheng.array;

public class Solution05 {
    public boolean isPerfectSquare(int num) {
        //二分查找，最后middle是其开根数就true
        int left = 0;
        int right = num/2 + 1;
        while (left <= right){
            int middle = (right - left)/2 + left;
            long x = (long) middle * middle;
            if (x < num){
                left = middle + 1;
            }else if (x > num){
                right = middle - 1;
            }else {
                return true;
            }
        }
        return false;
    }
}
