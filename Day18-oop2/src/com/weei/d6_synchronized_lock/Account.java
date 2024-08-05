package com.weei.d6_synchronized_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private double money;//余额
    private String cardId;//卡号
    //创建一个锁对象  用final修饰更专业，表明锁对象无法被修改/二次赋值
    private final Lock lk = new ReentrantLock();//多态写法

    public Account(double money, String cardId) {
        this.money = money;
        this.cardId = cardId;
    }

    public Account() {
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public  void DrawMoney(double money) {
        //提示谁在取钱
        String name = Thread.currentThread().getName();
        //1、判断余额   ctrl+alt+T选择第9个


        //放在try catch finally中可以保证即便出现异常也能正常完成加锁解锁而不是锁在里面走不下去
        try {
            lk.lock();//加锁
            if (this.money >= money){
                System.out.println(name + "来取钱" + money + "元成功");
                this.money -= money;
                System.out.println(name + "取钱后余额：" +this.money);
            }else {
                System.out.println(name + "来取钱，余额不足");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lk.unlock(); //解锁
        }

    }
/*    public static void test(){
        synchronized (Account.class){
            //静态方法官方建议用类名.class（是一个字节码文件，内存中仅有一份）作为锁
            //合理性：静态方法的访问是通过调用类名的，因此用类名.class可以将当前访问该方法的线程锁住
        }
    }*/
}
