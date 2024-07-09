package com.weei.d7_generics_interface;

import com.weei.d7_generics_class.Animal;

import java.util.ArrayList;

public interface Data<E> {
    void add(E e);
    ArrayList<E> getbyname(String name);
}
