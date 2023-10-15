package com.henu.yaheng.string;

public class Solution03 {
    public String pathEncryption(String path) {
        char[] chars = path.toCharArray();
        for (int i = 0; i < path.length(); i++) {
            if (chars[i] == '.'){
                chars[i] = ' ';
            }
        }
        return new String(chars);
    }
}
