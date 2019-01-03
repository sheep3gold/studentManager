package com.itheima.demo;

import java.util.Scanner;

public class Day4Extends {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("输入组数：");
        int row=in.nextInt();
        System.out.println("每组学生数量:");
        int col=in.nextInt();
        int [][]arr=new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]=(int)(Math.random()*101);
            }
        }
        /*System.out.println("打印每组不及格人数：");

        for (int i = 0; i < row; i++) {
            int num=0;
            for (int j = 0; j < col; j++) {
                if(arr[i][j]<60)
                    num++;
            }
            System.out.println("第"+(i+1)+"组不及格人数为："+num);
        }
//        System.out.println(num);
        System.out.println("打印每组平均分：");
        for (int i = 0; i < row; i++) {
           int score=0;
            for (int j = 0; j < col; j++) {
                score+=arr[i][j];
            }
            System.out.println("第"+(i+1)+"组平均分为："+score/col);
        }
        System.out.println("每组最高分为：");
        for (int i = 0; i < row; i++) {
            int max=arr[i][0];
            for (int j = 0; j < col; j++) {
                if(arr[i][j]>max)
                    max=arr[i][j];
            }
            System.out.println("第"+(i+1)+"组的最大值为："+max);
        }
        System.out.println("打印班级不及格人数为：");
        int num=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i][j]<60)
                    num++;
            }
        }
        System.out.println("班级中不及格人数为："+num);
        System.out.println("班级平均分：");
        int sum=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println("班级平均分为："+sum/(row*col));*/
        int sum=0,sumAll=0,num=0,numAll=0,average=0,max=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i][j]<60){
                    num++;
                    numAll++;
                    sum+=arr[i][j];
                    sumAll+=arr[i][j];
                }
            }
            average=sum/col;
            if (max<average)
                max=average;
            System.out.println("第"+(i+1)+"组不及格人数为："+num);
            System.out.println("第"+(i+1)+"组平均分为："+average);
            num=0;
            sum=0;
        }
        System.out.println("班级中单组最高平均分："+max);
        System.out.println("班级中不及格人数为："+numAll);
        System.out.println("班级中总平均分为："+sumAll/(row*col));
    }
}
