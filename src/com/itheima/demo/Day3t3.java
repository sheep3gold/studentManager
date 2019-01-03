package com.itheima.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day3t3 {
    public static void main(String[] args) {
        /*List<Integer> list=new ArrayList<>();
        Scanner in=new Scanner(System.in);
        System.out.println("请输入三个整数：");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        list.add(a);
        list.add(b);
        list.add(c);
        Collections.sort(list);
        System.out.println(list);*/
        int arr[]={1,3,21,4,12};
        arr=new Day3t3().bubleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    int[] bubleSort(int []arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j > i; j--) {
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }
}
