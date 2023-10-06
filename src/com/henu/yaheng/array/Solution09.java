package com.henu.yaheng.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Solution09 {
    public int totalFruit(int[] fruits) {
        int ans = 0;
        int start = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < fruits.length; i++) {
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            while (map.size() > 2){
                map.put(fruits[start],map.get(fruits[start]) -1);
                if (map.get(fruits[start]) == 0){
                    map.remove(fruits[start]);
                }
                start++;
            }
            ans = Math.max(ans,i - start + 1);
        }
        return ans;
    }
}
