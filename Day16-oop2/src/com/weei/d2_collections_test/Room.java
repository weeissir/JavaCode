package com.weei.d2_collections_test;

import java.util.*;

public class Room {
    //创建一副牌
    private List<Card> allCards = new ArrayList<>();

    public Room(){
        //1、做出54张牌存入集合allCards
        //点数：个数、花色确定
        String[] numbers = {"3", "4","5", "6", "7", "8", "9", "10","J", "Q", "K", "A", "2"};
        //花色
        String[] colors = {"♥","♠","♦","♣"};
        int size = 0;//表示大小
        //遍历点数、花色，组合牌
        for (String number : numbers){
            size++;
            for (String color : colors){
                Card c = new Card(number, color,size);
                allCards.add(c);//存牌
            }
        }
        //单独存入大小王
        Card c1 = new Card("", "🃏", ++size);
        Card c2 = new Card("", "👑", ++size);
        Collections.addAll(allCards,c1, c2);
        System.out.println("新牌：" + allCards);
    }

    public void start() {
        //1、洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后："+ allCards);

        //2、发牌，定义三个玩家  用List可排序可重复有索引
        List<Card> player1 = new ArrayList<>();
        List<Card> player2 = new ArrayList<>();
        List<Card> player3 = new ArrayList<>();
        //正式发牌，依次发出51张牌，剩余三张底牌
        //三个人轮番发牌，可以用对三求余实现
        for (int i = 0; i < allCards.size() - 3; i++) {
            Card c = allCards.get(i);
            if(i % 3 == 0 ){
                player1.add(c);
            }else if (i % 3 == 1){
                player2.add(c);
            }else if(i % 3 == 2){
                player3.add(c);
            }
        }

        //3、对3个玩家的牌排序
        sortCards(player1);
        sortCards(player2);
        sortCards(player3);
        //4、看牌
        System.out.println("玩家1" + player1);
        System.out.println("玩家2" + player2);
        System.out.println("玩家3" + player3);
        List<Card> diCard = allCards.subList(allCards.size() - 3, allCards.size());
        System.out.println("底牌" + diCard);
        player3.addAll(diCard);
        sortCards(player3);
        System.out.println("玩家3抢地主：" + player3);
    }

    /*
    * 排序
    * */
    private void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o2.getSize() - o1.getSize(); //降序
            }
        });
    }
}
