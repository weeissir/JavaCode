package com.weei.d14_extends_constructor;

public class Test2 {
    public static void main(String[] args) {
        //搞清楚子类构造器为什么要调用父类构造器，应用场景是什么
        Teacher t = new Teacher("momo", 19, "pig");
        System.out.println(t.getSkill());
    }
}

class Teacher extends People{
    private String skill;


    public Teacher(String name, int age, String skill){
        super(name, age); //在子类构造器中调用父类有参，实现方便赋值
//        setAge(age);//可以调用父类中的getter/setter但是麻烦
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}

class People{
    private String name;
    private int age;

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}