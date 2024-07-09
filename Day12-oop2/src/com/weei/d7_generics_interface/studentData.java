package com.weei.d7_generics_interface;

import com.weei.d7_generics_class.Cat;

import java.util.ArrayList;
//创建实现类
public class studentData implements Data<Cat>{


    @Override
    public void add(Cat cat) {

    }

    @Override
    public ArrayList<Cat> getbyname(String name) {
        return null;
    }

}
