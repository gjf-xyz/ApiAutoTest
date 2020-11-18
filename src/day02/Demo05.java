package day02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
        //2. 每次打印一个*，输出如下图案
        //******
        //*****
        //****
        //***
        //**
        //*
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        //   3. 定义一个学生成绩的数组，键盘录入10个学生的成绩，计算总成绩。
        Scanner scanner = new Scanner(System.in);
        float[] ids = new float[10];

        System.out.println("输入10个学生的成绩");

        float s = 0;
        for (int i1 = 0; i1 <= 9; i1++) {
            ids[i1] = scanner.nextFloat();
            if (ids[i1] < 0 || ids[i1] > 100) {
                System.out.println("输入成绩不合法，退出 ");
                break;
            } else {
                s = s + ids[i1];
            }
        }
        System.out.println(Arrays.toString(ids));
        System.out.println("总成绩为: " + s);


    }
}



