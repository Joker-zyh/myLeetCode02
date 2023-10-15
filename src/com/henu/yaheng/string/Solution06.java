package com.henu.yaheng.string;

public class Solution06 {
    public int strStr(String haystack, String needle) {
        //KMP,获取next数组
        int[] next = new int[needle.length()];
        getNext(next,needle);

        //寻找子串在主串中的位置
        //定义两指针，i指向主串，j指向子串
        int j = -1;
        for (int i = 0; i < haystack.length(); i++) {
            //不同就在next数组中寻找下一个匹配的位置
            while (j>=0 && haystack.charAt(i) != needle.charAt(j+1)){
                j = next[j];
            }
            //相同两指针都加一
            if (haystack.charAt(i) == needle.charAt(j+1)){
                j++;
            }
            //判断是否匹配完成
            if (j == needle.length() - 1){
                return i - needle.length() +1;
            }
        }
        return -1;

    }

    //获取前缀表
    private void getNext(int[] next,String needle){
        //初始化
        int j = -1;//方便后续回退
        next[0] = j;
        //寻找相等的前后缀
        for (int i = 1;i < needle.length();i++){
            //不相同就回退
            while (j >= 0 && needle.charAt(i) != needle.charAt(j+1)){
                j = next[j];
            }
            //相同两指针都往后加一，且填充next数组
            if (needle.charAt(i) == needle.charAt(j+1)){
                j++;
            }
            next[i] = j;
        }

    }


    /*public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)){
                int indexH = i;
                int indexN = 0;
                while (indexH < haystack.length() && indexN < needle.length()){
                    if (haystack.charAt(indexH) == needle.charAt(indexN)){
                        indexH++;
                        indexN++;
                    }
                }
                if (indexN == needle.length()){
                    return i;
                }
            }
        }
        return -1;
    }*/
}
