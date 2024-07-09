package com.weei.api.d1_api_object;

public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //掌握object类提供的对象克隆方法
        //1、protected Object clone():对象克隆

        User u1 = new User(1, "张三",
                "123456", new double[]{67, 57.5});
        //object类中clone方法是由protected修饰，因此调用需要重写
        User u2 = (User) u1.clone(); //暂时把异常提示抛出去
        System.out.println(u2.getId());
        System.out.println(u1.getId());
        System.out.println(u1.getScores());
        System.out.println(u2.getScores());  //数组对象指向新地址
    }
}
