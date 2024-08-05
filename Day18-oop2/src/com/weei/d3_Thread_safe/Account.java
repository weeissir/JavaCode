package com.weei.d3_Thread_safe;

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

    public void DrawMoney(double money) {
        //提示谁在取钱
        String name = Thread.currentThread().getName();
        //1、判断余额
        if (this.money >= money){
            System.out.println(name + "来取钱" + money + "元成功");
            this.money -= money;
            System.out.println(name + "取钱后余额：" +this.money);
        }else {
            System.out.println(name + "来取钱，余额不足");
        }
    }
}
