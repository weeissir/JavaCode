package com.weei.d6_enum;

public class Test {
    public static void main(String[] args) {
        //掌握枚举的应用场景：做信息标志和分类
        check(Constant.GIRL);

        check2(Constant2.BOY);
    }

    //枚举的方式
    public static void check(Constant flag){
        switch (flag){
            case BOY: //不用加前缀
                System.out.println("the boy");
                break;
            case GIRL:
                System.out.println("the girl");
                break;
        }
    }
    //常量的方式
    public static void check2(int flag){
        switch (flag){
            case Constant2.BOY: //不用加前缀
                System.out.println("the boy");
                break;
            case Constant2.GIRL:
                System.out.println("the girl");
                break;
        }
    }

    //常量的方式
    public class Constant2{
        public static final int BOY = 0;
        public static final int GIRL = 1;

    }
}


