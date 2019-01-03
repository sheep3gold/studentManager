package com.itheima.demo;

import java.util.Scanner;

public class Day3t9 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int sum=0;
        int index=0;
        System.out.println("请输入学生成绩，-1结束：");
        int num=in.nextInt();

        while (num!=-1){
            if (num<-1){
                System.out.println("请输入大于等于-1的数！");
                continue;
            }
            index++;
            sum+=num;
            System.out.println("请输入学生成绩，-1结束：");
            num=in.nextInt();

        }
        System.out.println("成绩的平均值为："+sum/index);
    }
}
