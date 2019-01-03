package com.itheima.demo;

public class Day3t8 {
    public static void main(String[] args) {
        double thick=0.0001;
        int num=0;
        while (thick<8848){
            thick*=2;
            num++;
        }
        System.out.println(num);
    }
}
