package com.weei.pkg.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperator {
    //1、定义一个Arratlist集合，存储菜品类Food对象
    private ArrayList<Food> FoodList = new ArrayList<>();

    //2、开发功能：上架菜品
    public void addFood(){
        //3、创建一个菜品对象，封装上架的菜品信息
        Food f = new Food();
        //4、录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入名称：");
        String name = sc.next();
        f.setName(name);

        System.out.println("请输入价格：");
        double price = sc.nextDouble();
        f.setPrice(price);

        System.out.println("请输入其他信息：");
        String desc = sc.next();
        f.setDesc(desc);

        //5、把菜品存入集合
        FoodList.add(f);
        System.out.println("上架成功：");

    }
    //6、展示菜品
//    FoodList = [f1, f2, f3, f4, ...]
    public void showFood(){
        if(FoodList.size() == 0){
            System.out.println("菜品为空，去上架");
            return;
        }  //卫语句
        for (int i = 0; i < FoodList.size(); i++) {
            Food f = FoodList.get(i);
            System.out.println(f.getName());
            System.out.println(f.getPrice());
            System.out.println(f.getDesc());
            System.out.println("-----------------");
        }
    }

    //7、展示操作界面
    public void start(){
        while (true) {
            System.out.println("请选择功能");
            System.out.println("1、上架菜品");
            System.out.println("2、展示菜品");
            System.out.println("3、退出功能菜单");
            Scanner sc = new Scanner(System.in);
            String com = sc.next();
            System.out.println("请输入操作您的选择：");
            switch (com){
                case "1":
                    addFood();
                    break;
                case "2":
                    showFood();
                    break;
                case "3":
                    System.out.println("马上退出");
                    return; // 结束当前所在方法 【跳出无返回值的方法，结束执行】
                default:
                    System.out.println("请输入正确的序号 ");
            } //ctrl+alt +T 放在死循环中
        }
    }
}
