package com.henu.yaheng.hash_table;

public class Solution01 {
    public boolean isAnagram(String s, String t) {
        //定义数组作为哈希表，数组大小为26
        int[] hashTable = new int[26];
        //遍历字符串s，哈希映射
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hashTable[c - 'a']++;
        }
        //遍历t来验证
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            hashTable[c - 'a']--;
        }
        for(int i : hashTable){
            if (i != 0){
                return false;
            }
        }
        return true;
    }
}
