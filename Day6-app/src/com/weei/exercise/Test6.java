package com.weei.exercise;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
//        一个大V直播时发起了抢红包活动，分别有:9、666、188、520、99999五个红包。
//        请模拟粉丝来抽奖，按照先来先得,随机抽取，抽完即止，
//        注意:一个红包只能被抽一次，先抽或后抽哪一个红包是随机的，
        int[] m= {9, 666, 188, 520, 99999};
        pocket(m);
        pocket2(m);  //方法2的效率更高
    }
    /*方法1*/
    public static void pocket(int[] money){
        // money=[9, 666, 188, 520, 99999]

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        //定义一个循环，控制抽奖5次
        for (int i = 0; i < 5; i++) {
            //提示抽奖
            System.out.println("请您输入内容进行抽奖：");
            sc.next(); //输入任意内容，按下回车继续往下走
            //为当前粉丝找一个随机的红包
            //放在死循环中，直到用户抽中
            while (true) {
                int index = r.nextInt(money.length);//0-4
                int m = money[index];
                //判断当前位置是否还有红包
                if(m != 0){
                    System.out.println("恭喜您，抽中红包：" + m);
                    money[index] = 0; //将当前位置金额变成0
                    break; //抽中则跳出循环
                }
            }
        }
        System.out.println("活动结束");
    }
    /*方法2
    先把数组里面的5个金额打乱顺序接着，写个for循环，执行5次，每次都提示抽奖;
    每次抽奖，都依次取出数组中的每个位置处的金额作为中奖金额即可*/
    public static void pocket2(int[] money){
        int temp = 0;
        Scanner sc =  new Scanner(System.in);
        Random r = new Random();
        //遍历数组中的每个位置，每遍历到一个位置，都随机一个索引值出来，让当前位置与该索引位置处的数据进行交换。
        for (int i = 0; i < money.length; i++) {
            int index = r.nextInt(money.length);
            temp = money[i];
            money[i] = money[index];
            money[index] = temp;
        }
        for (int i = 0; i <money.length; i++) {
            System.out.println("请输入内容进行抽奖");
            sc.next();
            System.out.println("恭喜你抽中红包：" + money[i]);
        }
        System.out.println("来晚了，红包没有了~");
    }
}
