package com.weei.loop;

public class BreakAndContinue {
    public static void main(String[] args) {
        //break:跳出并结束当前所在循环的执行
        int i;
        for( i = 1; i <=4; i++){
            System.out.println("吃饭" + i);
            if (i == 3){
                break;
            }
        }
        System.out.println("跳出时i等于：" + i);

        for(int j = 1; j < 5 ; j++){
            if(j ==3){
                continue; //跳过本次循环后续程序，之前进入循环的下一次
            }
            System.out.println("洗碗" + j);
        }
    }
}
