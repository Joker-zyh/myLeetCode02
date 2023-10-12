package com.henu.yaheng.hash_table;

import java.util.Set;
import java.util.TreeSet;

public class Solution02 {
    public int[] intersection(int[] nums1, int[] nums2) {
        //不用考虑输出结果的顺序，并且对加入哈希表的数据去重，使用set做哈希表
        Set<Integer> hashTable = new TreeSet<>();
        //遍历数组1，进行哈希映射
        for (int num : nums1){
            hashTable.add(num);
        }
        //遍历数组2，查找在数组1中也出现过的元素，加入结果集中,也要对加入的元素去重，结果集也使用set
        Set<Integer> ans = new TreeSet<>();
        for (int num : nums2){
            if (hashTable.contains(num)){
                ans.add(num);
            }
        }
        return ans.stream().mapToInt(x -> x).toArray();

        /*int[] result = new int[ans.size()];
        int index = 0;
        for (int num :ans) {
            result[index++] = num;
        }
        return result;*/


    }
}
