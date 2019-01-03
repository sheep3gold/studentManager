package com.itheima.demo;

public class Day4t1 {
    public static void main(String[] args) {
        int arr[]={1,4,2,5,43,6};
        int temp=arr[0];
        for (int i = 1; i < 5; i++) {
            if(temp>arr[i])
                temp=arr[i];
        }
        System.out.println(temp);
    }
}
