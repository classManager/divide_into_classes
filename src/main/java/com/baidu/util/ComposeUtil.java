package com.baidu.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 分组工具类
 * Created by lt on 2018/5/27.
 */
public class ComposeUtil {

    public static String[] array = {"物理", "化学", "生物", "政治", "历史", "地理"};

    //N选2的分组结果
    public Set printArrayCom(String[] array) {

        Set set = new HashSet();

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                String[] comStr = new String[2];

                comStr[0] = array[i];

                comStr[1] = array[j];

                if (!set.contains(comStr)) {

                    set.add(comStr);

                }

            }

        }

        return set;

    }

    /**
     * N选3的结果
     * @return
     */
    public Set threeArrayCom(String[] array) {

        Set set = new HashSet();

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    String[] comStr = new String[3];

                    comStr[0] = array[i];

                    comStr[1] = array[j];
                    comStr[2] = array[k];
                    if (!set.contains(comStr)) {

                        set.add(comStr);
                    }
                }

            }

        }

        return set;

    }
    public static void main(String[] args) {

        //输出N选二的结果
        Set re =new ComposeUtil().printArrayCom(array);

        Iterator it = re.iterator();

        while (it.hasNext()) {

            String arr[] = (String[]) it.next();

            System.out.println(arr[0] + " ," + arr[1]);

        }
        //输出N选三的结果
//        Set re = new ComposeUtil().threeArrayCom(array);
//        System.out.println(re.size());
//        Iterator it = re.iterator();
//        while (it.hasNext()) {
//
//            String arr[] = (String[]) it.next();
//
//            System.out.println(arr[0] + " ," + arr[1]+ " ," + arr[2]);
//
//        }
    }
}
