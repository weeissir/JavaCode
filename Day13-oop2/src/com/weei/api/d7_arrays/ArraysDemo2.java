package com.weei.api.d7_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {
    public static void main(String[] args) {
        //掌握对数组中的对象进行排序
        Student[] students = new Student[4];
        students[0] = new Student("momo", 154, 17);
        students[1] = new Student("momo2", 154, 174);
        students[2] = new Student("momo2", 155, 11);
        students[3] = new Student("momo4", 153.6, 27);

//        Arrays.sort(students);
//        System.out.println(Arrays.toString(students));

        //2、public static <T> void sort(T[] arr, Comparator<? super T> c)
        //参数一： 需要排序的数组
        //参数二：Comparator比较器对象（用来制定对象的比较规则）
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //制定比较规则：左边o1,右边o2
/*                if(o1.getHeight() > o2.getHeight()){
                    return 1;
                }else if(o1.getHeight() < o2.getHeight()){
                    return -1;
                }
                return 0;*/
                //官方提供的针对小数的比较方法
                return Double.compare(o1.getHeight() , o2.getHeight());
            }
        });
    }
}
