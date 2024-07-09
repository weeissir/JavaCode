package com.weei.d10_modifer;

import com.weei.d9_modifer.Fu;

public class Zi extends Fu {
    public void test(){
//        privateMethod();//报错
//        method();//报错
        protectedMethod();
        publicMethod();
    }
}
