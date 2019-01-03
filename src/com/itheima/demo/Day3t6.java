package com.itheima.demo;

public class Day3t6 {
    public static void main(String[] args) {
        int c=0;
        for (int i = 1; i < 100; i++) {

                if (i<10) {
                    if (i == 9)
                        continue;

                    System.out.print(i + " ");
                    c++;

                }else {
                    if(i/10==9||i%10==9)
                        continue;
                    System.out.print(i+" ");
                    c++;
                }
                if (c%5==0)
                    System.out.println();

        }
    }
}
