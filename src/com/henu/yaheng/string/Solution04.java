package com.henu.yaheng.string;

public class Solution04 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length()-1;
        int j = i;
        for (;i >= 0;i--){
            if (s.charAt(i) == ' '){
                continue;
            }
            for (j = i;j >= 0;j--){
                if (s.charAt(j) == ' '){
                    sb.append(s, j+1, i+1);
                    sb.append(' ');
                    i = j;
                    break;
                }
                if (j == 0){
                    sb.append(s,j,i+1);
                    sb.append(' ');
                    i = j;
                }
            }
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
