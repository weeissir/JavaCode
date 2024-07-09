package com.weei.method;

public class methodTest {
    public static void main(String[] args) {
        //求1-N的和
        System.out.println("1-88的和：" + add(88));
        //判断奇偶
        judge(79);
    }
    //求1-N的和
    public static int add(int n){
        int sum = 0;
        for (int i = 1; i <=n; i++) {
            sum += i;
        }
        return sum;
    }
    //判断奇数还是偶数
    public static void judge(int n){
        if(n%2 == 0){
            System.out.println(n + "为偶数");
        }else{
            System.out.println(n + "是一个奇数");
        }
    }
}
