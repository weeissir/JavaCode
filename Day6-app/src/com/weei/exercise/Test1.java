package com.weei.exercise;

public class Test1 {
    public static void main(String[] args) {
        //买机票，请开发程序计算出用户当前机票的优惠价
//        优惠方案如下:5-10月为旺季，头等舱9折，经济舱8.5折;
//        11月到来年4月为淡季，头等舱7折，经济舱6.5折
        double price = calculate(1745, 2, "经济舱");
        System.out.println("优惠价格： " + price);
    }
    public static double calculate(double price, int month, String type){
        //判断月份
        if(month >=5 && month <= 10){
            //旺季
            //判断仓位
            switch (type){
                case "头等舱":
                    price *= 0.9;
                    break;
                case "经济舱":
                    price *= 0.85;
                    break;
            }
        }else{
            //淡季
            switch (type){
                case "头等舱":
                    price *= 0.7;
                    break;
                case "经济舱":
                    price *= 0.65;
                    break;
            }
        }
        return price;
    }
}
