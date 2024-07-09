package com.weei.method.parameter;

public class MethodDemo {
    public static void main(String[] args) {
        int a= 10;
        change(a) ; //相当于change(10) ,把a中的值复制给形参
        System.out.println("main: " + a);
        int[] b = {1, 3, 5};
        array(b); //相当于把数组的地址复制给形参，形参也指向同一区域
        System.out.println("main2: " + b[1]); //被修改成200
        int[] arr = {11,22, 33, 44, 55};
        print(arr);
        int[] arr1 ={12, 13, 14, 15, 16};
        int[] arr2 = {12, 13, 14, 15, 16};
        System.out.println(equal(arr1, arr2));
    }
    //基本类型 :值传递
    public static void change(int a){
        System.out.println("change1:" +a);
        a = 22;
        System.out.println("change2:" + a);
    }

    //引用类型：值传递
    public static void array(int[] a){
        System.out.println("array1: " + a[1]);
        a[1] = 200;
        System.out.println("array2: " + a[1]);
    }

    //案例：输出一个int类型的数组内容，要求输出格式为:[11，22，33，44，55]
    public static void print(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
//            if(i == arr.length - 1){
//                System.out.print(arr[i]);
//            } else{
//                System.out.print(arr[i] + ", ");
//            } //改成三元运算符
            System.out.print(i == arr.length -1? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }

    //案例：判断两个int类型的数组是否一样
    public static boolean equal(int[] arr1, int[] arr2){
        //判断是否都为null
        if(arr1 ==  null && arr2 == null){
            return true;
        }
        //判断一个为null
        if(arr1 == null || arr2 == null){
            return false;
        }
        //判断长度是否相同
        if(arr1.length != arr2.length){
            return false;
        }
        //说明长度相同
        for (int i = 0; i < arr1.length; i++) {
            //判断相同位置元素是否一样
            if(arr1[i] != arr2[i]){
                return false; //如果不触发return说明全部位置都相等
            }
        }
        return true;
        //卫语句风格，用于检查输入参数的有效性或执行特定条件的判断，如果条件不满足，则立即返回或抛出异常，避免继续执行后续代码
    }
}
