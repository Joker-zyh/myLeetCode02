package com.henu.yaheng.string;

public class Solution05 {
    public String dynamicPassword(String password, int target) {
        char[] chars = password.toCharArray();
        swap(chars,0,password.length()-1);
        swap(chars,0,password.length() - target - 1);
        swap(chars,password.length()-target,password.length()-1);
        return new String(chars);

        /*StringBuilder sb = new StringBuilder();
        for (int i = target-1;i < password.length();i++){
            sb.append(password.charAt(i));
        }
        for (int i = 0;i < target;i++){
            sb.append(password.charAt(i));
        }
        return sb.toString();*/
    }

    private void swap(char[] chars,int start,int end){
        while (start < end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

    }
}
