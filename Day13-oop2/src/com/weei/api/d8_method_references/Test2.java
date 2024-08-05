package com.weei.api.d8_method_references;

import java.util.Arrays;
import java.util.Comparator;

public class Test2 {
    //特定类型的方法引用
    public static void main(String[] args) {
        String[] names ={"boby","angela","Andy" ,"dlei","caocao","Babo", "jack", "Cici"};
        //要求忽略首字符大小写进行排序
/*            Arrays.sort(names, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    //制定规则
                    return o1.compareToIgnoreCase(o2);
                }
            });*/

            //简化
//        Arrays.sort(names, (o1, o2) -> o1.compareToIgnoreCase(o2));
        //特定类型的方法引用
        Arrays.sort(names, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(names));
    }
}
