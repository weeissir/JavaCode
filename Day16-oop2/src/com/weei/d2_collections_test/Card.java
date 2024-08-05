package com.weei.d2_collections_test;

public class Card {
    private String number; //点数
    private String color; //花色
    private int size; //每张牌的大小

    @Override
    public String toString() {
        return color + number ;
    }

    public Card() {
    }

    public Card(String number, String color, int size) {
        this.number = number;
        this.color = color;
        this.size = size;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
