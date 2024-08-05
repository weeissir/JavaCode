package com.weei.api.d8_method_references;

import com.weei.api.d7_arrays.Student;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("momo", 154, 17);
        students[1] = new Student("momo2", 154, 174);
        students[2] = new Student("momo2", 155, 11);
        students[3] = new Student("momo4", 153.6, 27);

/*        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/

        //使用Lambda简化
//        Arrays.sort(students, (o1,o2) -> o1.getAge() - o2.getAge());

//        //使用静态方法引用
//        Arrays.sort(students, CompareByDate::CompareByAge);

        //实例方法引用
        CompareByDate compare = new CompareByDate();
        Arrays.sort(students, compare::compareByAgeDesc);

    }

}
