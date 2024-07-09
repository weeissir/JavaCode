package com.weei.d5_enum;

public enum A {
    //注意：枚举类第一行都是常量，记住的是枚举类的对象
    X, Y, Z;
    private String name;

//    private A(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
