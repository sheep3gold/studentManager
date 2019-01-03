package com.itheima.demo;

public class Day3t11 {
    public static void main(String[] args) {

        for (int i = 1; i <=9; i++) {
            int c=0;
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"*"+j+"\t");
                c++;
                if (c==7)
                    System.out.println();
            }
            if (c!=7)
                System.out.println();
        }
    }
}
