package com.weei.object.constructor;

public class Test {
    public static void main(String[] args) {
        //认识构造器，并掌握构造器特点，应用场景，注意事项
        Student s = new Student("znag", 89);
        //创建对象时，会根据参数类型选择对应构造器执行
        Student s2 = new Student("zang");
        Teacher t = new Teacher();
    }
}
