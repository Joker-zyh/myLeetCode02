package com.henu.yaheng.hash_table;

import java.util.Set;
import java.util.TreeSet;

public class Solution03 {
    public boolean isHappy(int n) {
        int sum = n;
        Set<Integer> set = new TreeSet<>();
        while (true){
            n = sum;
            sum = 0;
            while (n > 0){
                int i = n % 10;
                sum += i*i;
                n /= 10;
            }
            if (sum == 1){
                return true;
            }
            if (set.contains(sum)){
                return false;
            }else {
                set.add(sum);
            }
        }
    }

}
