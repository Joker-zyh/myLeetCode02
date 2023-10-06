package com.henu.yaheng.array;

public class Solution10 {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int start = 0;
        int offset = 1;
        int loop = 0;
        int count = 1;
        while (loop++ < n/2){
            int i = start;
            int j = start;

            for (;j < n - offset;j++){
                ans[i][j] = count++;
            }

            for (;i < n - offset;i++){
                ans[i][j] = count++;
            }

            for (;j > offset-1;j--){
                ans[i][j] = count++;
            }

            for (;i >offset -1;i--){
                ans[i][j] = count++;
            }
            start++;
            offset++;
        }
        if (n % 2 == 1){
            ans[start][start] = count;
        }
        return ans;
    }
}
