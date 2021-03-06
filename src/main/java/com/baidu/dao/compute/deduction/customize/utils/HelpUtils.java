package com.baidu.dao.compute.deduction.customize.utils;

/**
 * Created by lt on 2018/05/2.
 */
public class HelpUtils {

    /**
     * 判断n对应的二进制里面有多少个1
     *
     * 把一个整数减去1，再和原整数做运算，会把该整数最右边一个1变成0，那么一个整数的二进制表示有多少个1，就可以进行多少次这样的操作
     * @param n
     * @return
     */
    public static int numberOf1(int n){
        int count = 0;
        while(n!=0){
            n = n&(n-1);
            count++;
        }
        return count;
    }
}
