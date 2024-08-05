package com.weei.d3_exception;

public class ExceptionTest1 {
    /*
    * 掌握自定义异常，以及异常的作用
    * */
    public static void main(String[] args) {
        //需求：保存一个合法的年龄
        try {
            saveAge(230);  //ctrl+alt+T 选择抓住异常
            System.out.println("底层执行成功");
        } catch (Exception e) {
            e.printStackTrace();  //打印异常信息
            System.out.println("底层出现问题");
        }
    }

    public static void saveAge(int age) {
        if(age > 0 && age < 150){
            System.out.println("年龄被成功保存：" + age);
        }else{
            //用一个异常对象封装这个问题
            //throw抛出这个异常对象
            throw new AgeIllegalRuntimeException("/age is illegal");
        }
    }

    public static void saveAge2(int age) throws AgeIllegalException{
        if(age > 0 && age < 150){
            System.out.println("年龄被成功保存：" + age);
        }else{
            //用一个异常对象封装这个问题
            //throw抛出这个异常对象
            //throws 用在方法上，抛出方法内部异常
            throw new AgeIllegalException("/age is illegal");
        }
    }
}
