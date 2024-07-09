package com.weei.d5_enum;

//拓展：抽象枚举（含有抽象方法的枚举类）
public enum B {
    //要求枚举的对象全部重写
    X(){
        @Override
        public void go() {

        }
    },Y("momo"){
        @Override
        public void go() {
            System.out.println(getName() + "在跑~");
        }
    };
    public abstract void go();

    //构造器默认私有
    private B() {
    }

    private B(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
