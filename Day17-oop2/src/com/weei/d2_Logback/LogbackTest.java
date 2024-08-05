package com.weei.d2_Logback;

import org.slf4j.Logger;  //注意导包位置是slf4j！！
import org.slf4j.LoggerFactory;

/*
* 掌握Logback日志框架的使用
* */
public class LogbackTest {
    //创建一个Logger日志对象
    public static final Logger LOGGER = LoggerFactory.getLogger("LogbackTest");
    public static void main(String[] args) {
        try {
            LOGGER.info("除法方法开始");  //info一般表示记录一个重要的信息
            chu(10, 0);
            LOGGER.info("计算成功");
        } catch (Exception e){
            LOGGER.error("除法有误");  //error记录一个错误
        }
    }

    public static void chu(int a, int b) {
        LOGGER.debug("参数a：" + a);
        LOGGER.debug("参数b：" + b);  //debug一般记录执行过程
        int c = a /b;
//        System.out.println("除法结果：" + c);  //用日志就不用输出语句的方式了
        LOGGER.info("结果是" + c);
    }
}
