package com.henu.yaheng.array;

public class Solution12 {
    public int[] spiralArray(int[][] array) {
        if (array.length < 1){
            return new int[]{};
        }
        //数组m行n列，定义结果集
        int m = array.length;
        int n = array[0].length;
        int[] ans = new int[m*n];
        //循环轮次
        int loop = 0;
        //循环开始位置
        int startX = 0;
        int startY = 0;
        //每轮遍历到每行列前多少元素结束
        int offset = 1;
        //结果集下标
        int index = 0;
        //循环
        while (loop++ < Math.min(m,n)/2){
            //循环不变量
            int i = startX;
            int j = startY;
            //上行
            for (;j < n - offset;j++){
                ans[index++] = array[i][j];
            }
            //右列
            for (;i < m - offset;i++){
                ans[index++] = array[i][j];
            }
            //下行
            for (;j > offset - 1;j--){
                ans[index++] = array[i][j];
            }
            //左列
            for (;i > offset - 1;i--){
                ans[index++] = array[i][j];
            }

            startX++;
            startY++;
            offset++;
        }
        //填充最内行或列元素
        if (Math.min(m,n)%2 == 1){
            if (m <= n){
                //最内行
                for (;startY < n - offset + 1;startY++){
                    ans[index++] = array[startX][startY];
                }
            }else {
                //最内列
                for (;startX < m - offset + 1;startX++){
                    ans[index++] = array[startX][startY];
                }
            }
        }
        return ans;
    }
}
