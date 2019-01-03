package com.itheima.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 学生信息管理系统
 */
public class StudentManager {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //学生信息
        String []name=new String[5];
        int []age=new int[5];
        double []score=new double[5];
        List<Student> studentList = new ArrayList<>();
        //存储到第几个学生了
        int index=0;

        while (true) {
            System.out.println("*********************学生信息管理系统*****************");
            System.out.println("1、添加学生信息");
            System.out.println("2、修改学生信息");
            System.out.println("3、删除学生信息");
            System.out.println("4、查看学生信息");
            System.out.println("5、退出系统");
            System.out.println("请选择功能编号（1～5）：");
            int choose=in.nextInt();



            switch (choose) {
                case 1:
                    Student s1 = new StudentManager.Student();
                    System.out.println("*********添加学生信息***********");
                    System.out.print("学生姓名：");
                    name[index] = in.next();
                    System.out.print("学生年龄：");
                    age[index] = in.nextInt();
                    System.out.print("学生成绩：");
                    score[index] = in.nextInt();
                    System.out.println("学生信息添加成功！");
                    index++;
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("************查看学生信息*************");
                    System.out.println("姓名\t\t年龄\t\t成绩");
                    for (int i = 0; i <index ; i++) {
                        System.out.println(name[i] + "\t\t" + age[i]+"\t\t" + score[i]);
                    }
                    break;
                default:
                    System.out.println("系统即将退出...\n 谢谢使用！");
                    System.exit(0);
                    break;

            }
            System.out.println("*******************************************");
        }
    }
    static class Student{
        private String name;
        private int age;
        private double score;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

    }
}
