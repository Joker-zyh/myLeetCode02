package com.henu.yaheng.array;

import java.util.ArrayList;
import java.util.List;

public class Solution11 {
    public List<Integer> spiralOrder(int[][] matrix) {
        //m行n列
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        //定义循环次数（根据最小行或列数）
        int loop = 0;
        //定义每次循环在行列末尾前几项处转弯
        int offset = 1;
        //定义每次循环的起始位置
        int startX = 0;
        int startY = 0;
        //循环
        while (loop++ < Math.min(m,n)/2){
            //循环不变量
            int i = startX;
            int j = startY;
            //上行
            for (;j < n - offset;j++){
                ans.add(matrix[i][j]);
            }
            //右列
            for (;i < m - offset;i++){
                ans.add(matrix[i][j]);
            }
            //下行
            for (;j > offset - 1;j--){
                ans.add(matrix[i][j]);
            }
            //左列
            for (;i > offset - 1;i--){
                ans.add(matrix[i][j]);
            }
            offset++;
            startX++;
            startY++;

        }
        if (Math.min(m,n)%2 == 1){
            if (m < n){
                for (;startY < n - offset+1;startY++){
                    ans.add(matrix[startX][startY]);
                }
            }else {
                for (;startX < m - offset + 1;startX++){
                    ans.add(matrix[startX][startY]);
                }
            }
        }
        return ans;
    }
}
