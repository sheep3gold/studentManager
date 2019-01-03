package com.itheima.demo;

public class Day4t3 {
    public static void main(String[] args) {
        int index=0;
        /*for (int i = 1; i <= 100; i++) {
            if (i%6==0)
                index++;
        }*/
        for (int i = 1; i <= 100; i++) {
            if (i%3==0 && i%7==0)
                index++;
        }
        System.out.println(index);

    }
}
