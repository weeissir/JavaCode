package com.weei.exercise;

public class Test4 {
    public static void main(String[] args) {
//        某系统的数字密码是一个四位数，如1983，为了安全，需要加密后再传输，
//        加密规则是:对密码中的每位数都加5,再对10求余，最后将所有数字顺序反转，
//        得到一串加密后的新数，请设计出满足本需求的加密程序
        System.out.println("加密后的结果：" + encrypt(8346));
    }
    public static String encrypt(int num){
        //num = 1983
        //拆分成独立的数字【拆分方法】独立功能最好用单独的方法
        int[] nums = split(num);
        //[1,9,8,3]
        //遍历每个数字，加密处理
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (nums[i] + 5) % 10;
        }
        //[6,4,3,8]
        //反转数组 【反转方法】
        reverse(nums);
        //[8,3,4,6]
        //拼接数字
        String data = "";
        for (int i = 0; i < nums.length; i++) {
            data += nums[i];
        }
        return data;
    }

    public static void reverse(int[] nums) {
        //反转数组
        int temp = 0;
        for (int i = 0 , j = nums.length - 1; i < j; i++, j--) {
            //交换i、j位置处的值
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    public static int[] split(int num) {
        //拆分 1983
        int[] n = new int[4];
        n[0] = num /1000;
        n[1] = (num /100) % 10;
        n[2] = (num /10) % 10;
        n[3] = num % 10;
        return n;
    }
}
