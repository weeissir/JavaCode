package com.weei.pkg.String;

public class demo2 {
    public static void main(String[] args) {
        String s = "黑马java";
        //1、获取字符串长度
        System.out.println(s.length());

        //2、提取字符串中某个索引位置的字符
        char c = s.charAt(1);
        System.out.println(c);

        //字符串遍历
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println(ch);
        }

        //3、把字符串转换成字符数组，再遍历
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        //4、判断字符串内容，一样就返回true
        String s1 = new String("黑马");
        String s2 = new String("黑马");
        System.out.println(s1 == s2); //false,因为比较的是地址不一样
        System.out.println(s1.equals(s2));//true  比较内容是一样的

        //5、忽略大小写比较字符串内容  【验证码】
        String c1 = "43Hdkvn";
        String c2 = "43hDkvN";
        System.out.println(c1.equals(c2)); //false
        System.out.println(c1.equalsIgnoreCase(c2)); //true

        //6、截取字符串内容(包前不包后)
        String s3 = "java是最好的编程语言";
        System.out.println(s3.substring(0, 8));

        //7、从当前位置一直截取到字符串末尾
        System.out.println(s3.substring(5));

        //8、把字符串某个内容替换成新内容，并返回新字符串 【敏感词】
        String info = "这个电影简直是个垃圾，垃圾电影";
        String rs3 = info.replace("垃圾", "**");
        System.out.println(rs3);

        //9、判断字符串中是否包含某个关键字
        String info2 = "java是最好的编程语言";
        System.out.println(info2.contains("java")); //true
        System.out.println(info2.contains("Java"));  //false
        System.out.println(info2.contains("java2")); //false

        //10、判断字符串是否以某个字符串开头 【检查姓氏】
        String name = "张三丰";
        System.out.println(name.startsWith("张"));//true
        System.out.println(name.startsWith("张三"));//true
        System.out.println(name.startsWith("张三2"));//false

        //11、把字符串按照某个指定内容分割成多个字符串，放到一个字符串数组返回
        String rs5 = "张无忌，周芷若，赵敏";
        String[] names = rs5.split(",");
        for (int i = 0; i < name.length(); i++) {
            System.out.println(names[i]);
        }
    }
}
