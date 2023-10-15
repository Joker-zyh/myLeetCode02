package com.henu.yaheng.string;

import java.util.Arrays;

public class Solution02 {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i += 2*k) {
            //后续区域大于等于k个
            if (i + k <= s.length()){
                swap(chars,i,i+k-1);
                continue;
            }
            swap(chars,i,s.length()-1);
        }
        return Arrays.toString(chars);
    }

    private void swap(char[] chars,int i,int j){
        for (;i < j;i++,j--){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
    }
}
