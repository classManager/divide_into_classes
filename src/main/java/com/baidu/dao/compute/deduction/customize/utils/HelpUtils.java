package com.baidu.dao.compute.deduction.customize.utils;

/**
 * Created by lt on 2018/05/2.
 */
public class HelpUtils {

    /**
     * �ж�n��Ӧ�Ķ����������ж��ٸ�1
     *
     * ��һ��������ȥ1���ٺ�ԭ���������㣬��Ѹ��������ұ�һ��1���0����ôһ�������Ķ����Ʊ�ʾ�ж��ٸ�1���Ϳ��Խ��ж��ٴ������Ĳ���
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
