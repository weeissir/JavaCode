package com.weei.d10_modifer;

import com.weei.d9_modifer.Fu;

public class Demo2 {
    public static void main(String[] args) {
        Fu f = new Fu();
//        f.protectedMethod();//报错
        f.publicMethod();

        Zi z = new Zi();
        z.publicMethod();
    }
}
