package com.itheima.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagerPro {
    public static void main(String[] args) {

            Scanner in=new Scanner(System.in);
            //学生信息
            StudentManagerPro sp=new StudentManagerPro();
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
//                        Student s1 = new Student();
                        System.out.println("*********添加学生信息***********");
                        System.out.print("学生姓名：");
                        String name= in.next();
                        System.out.print("学生年龄：");
                        int age = in.nextInt();
                        System.out.print("学生成绩：");
                        double score = in.nextDouble();
                        System.out.println("学生信息添加成功！");
                       /* s1.setName(name);
                        s1.setAge(age);
                        s1.setScore(score);
                        studentList.add(s1);*/
                        sp.addStuList(studentList,name,age,score);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        System.out.println("************查看学生信息*************");
                        System.out.println("姓名\t\t年龄\t\t成绩");
                        for (int i = 0; i < studentList.size(); i++) {
                            Student s=studentList.get(i);
                            System.out.println(s.getName()+"\t\t"+s.getAge()+"\t\t"+s.getScore());
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
        List<Student> addStuList(List<Student> list,String name,int age,double score){
            Student s=new Student();
            s.setName(name);
            s.setAge(age);
            s.setScore(score);
            list.add(s);
            return list;
        }
        class Student{
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
