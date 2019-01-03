package com.itheima.demo;

/**
 * @author  yangxin
 * @create  2018/11/2 9:20 PM
 * @desc
 **/
import java.util.Scanner;

public class Day4t4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int l=in.nextInt();
        int []arr=new int[l];
        for (int i = 0; i < l; i++) {
            arr[i]=(int)(Math.random()*10+1);
            if (arr[i]>5 && arr[i]%2==0)
                System.out.print(arr[i]+"\t");
        }
    }
}
