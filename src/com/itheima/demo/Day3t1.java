package com.itheima.demo;

import java.util.Scanner;

public class Day3t1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int x=in.nextInt();
        int y=0;
        if (x<0)
            y=-1;
        else if(x==0)
            y=0;
        else
            y=1;
        System.out.println("x="+x+",y="+y);
    }
}
