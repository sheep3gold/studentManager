package com.itheima.demo;

public class Day3t7 {
    public static void main(String[] args) {
        int c=0;
        for (int i = 9999; i > 999; i--) {
            int ge=i%10;
            int shi=i/10%10;
            int bai=i/100%10;
            int qian=i/1000;
            if (ge+bai==shi+qian){
                System.out.print(i+" ");
                c++;
                if (c%5==0)
                    System.out.println();
            }

        }
    }
}
