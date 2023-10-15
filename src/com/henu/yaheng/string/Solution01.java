package com.henu.yaheng.string;

public class Solution01 {
    public void reverseString(char[] s) {
        //定义双指针，一个在头一个在尾，交换元素
        int left = 0;
        int right = s.length-1;
        while (left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
