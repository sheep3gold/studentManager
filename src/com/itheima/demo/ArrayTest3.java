package com.itheima.demo;

import java.util.Scanner;

public class ArrayTest3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[]={171,72,19,16,118,51,210,7,18};
        System.out.print("请输入一个数：");
        int num=in.nextInt();
        ArrayTest3 arrayTest3=new ArrayTest3();
//        System.out.println(arrayTest3.getMax(arr));
        System.out.println(arrayTest3.locOfArr(arr,num));
    }
    int getMax(int []arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    int sum(int[]arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    int sumCase2(int[]arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            boolean b=arr[i]%10!=7 && arr[i]/10%10!=7 && arr[i]%2==0;
            if (b)
                sum+=arr[i];
        }
        return sum;
    }
    int locOfArr(int[]arr,int num){
//        int loc=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num)
                return i;
        }
        return -1;
    }
}
