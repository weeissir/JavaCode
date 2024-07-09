package com.weei.d12_extends_override;

public class B extends A{
    //方法重写
    public void print(){
        System.out.println("666");
    }

    @Override //使用override注解，可读性好，检查重写格式是否正确
    public void print2(int a, int b) {
        System.out.println("777");;
    }
}
