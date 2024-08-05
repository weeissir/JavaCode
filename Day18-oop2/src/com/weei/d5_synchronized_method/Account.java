package com.weei.d5_synchronized_method;

public class Account {
    private double money;//余额
    private String cardId;//卡号

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

    //同步方法
    public synchronized void DrawMoney(double money) {
        //提示谁在取钱
        String name = Thread.currentThread().getName();
        //1、判断余额   ctrl+alt+T选择第9个

            if (this.money >= money){
                System.out.println(name + "来取钱" + money + "元成功");
                this.money -= money;
                System.out.println(name + "取钱后余额：" +this.money);
            }else {
                System.out.println(name + "来取钱，余额不足");
            }
    }
/*    public static void test(){
        synchronized (Account.class){
            //静态方法官方建议用类名.class（是一个字节码文件，内存中仅有一份）作为锁
            //合理性：静态方法的访问是通过调用类名的，因此用类名.class可以将当前访问该方法的线程锁住
        }
    }*/
}
