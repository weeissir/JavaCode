package com.weei.method;

public class methodDemo3 {

    public static void main(String[] args) {
//        方法在类中的位置放前放后无所谓，但一个方法不能定义在另一个方法里面。
//        方法的返回值类型写void(无返回申明)时，方法内不能使用return返回数据，如果方法的返回值类型写了具体类型，方法内部则必须使用return返回对应类型的数据，
//        return语句的下面，不能编写代码，属于无效的代码，执行不到这儿。方法不调用就不会执行，调用方法时，传给方法的数据，必须严格匹配方法的参数情况。
//        调用有返回值的方法，有3种方式:1、可以定义变量接收结果 2、或者直接输出调用，3、甚至直接调用;
//        调用无返回值的方法，只有1种方式:1、只能直接调用。
        //定义变量接收
        int rs = print(3);
        //直接输出调用
        System.out.println(print(3));
        //直接调用，不要返回值
        print(3);
    }
    public static int print(int n){
        return 2*n;
    } //可以放在main方法前后，不能放在里面
}
