package com.weei.api.d8_method_references;

import com.weei.api.d7_arrays.Student;

public class CompareByDate {
    public static int CompareByAge(Student o1, Student o2){
        return o1.getAge() - o2.getAge();
    }

    public int compareByAgeDesc(Student o1, Student o2){
        return o2.getAge() - o1.getAge();
    }
}
