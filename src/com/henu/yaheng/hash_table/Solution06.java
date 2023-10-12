package com.henu.yaheng.hash_table;

public class Solution06 {
    public boolean canConstruct(String ransomNote, String magazine) {
        //定义数组哈希表，对magazine数组进行映射，映射其对应字母出现的次数
        int[] hashTable = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            hashTable[magazine.charAt(i) - 'a']++;
        }

        // 遍历ransomNote，当其字母在哈希表中出现的次数超过哈希表中存储的次数，返回false
        for (int i = 0; i < ransomNote.length(); i++) {
            int index = ransomNote.charAt(i) - 'a';
            hashTable[index]--;
            if (hashTable[index] < 0){
                return false;
            }
        }
        return true;
    }

}
