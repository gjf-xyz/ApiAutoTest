package day08;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = "hello";
        System.out.println(str1);
        String str2 = "he" + new String("llo");
        System.out.println(str2);
        System.err.println(str1 == str2);

        System.out.println(2 + "5");
        int[] b = new int[2];
        int[] b1 = {1, 2, 3};
        int[] b2 = new int[]{1, 2, 3,};

        java.util.HashMap map = new java.util.HashMap();
        map.put("name", null);
        map.put("name", "Jack");
        System.out.println(map.size());


//byte(1),short(2),int(4),long(8),float(4),double(8),boolean(1),char(2)
// String 和Stringbuffer，Stringbuilder都是用于字符串修改，String的对象是不可变得，其它两个都是可变对象
//Stringbuffer线程比较安全，Stringbuilder线程不安全，Stringbulider速度相较于其它较快


//        100以内的所有质数的输出？



        System.out.println("请输入一个七位卡号： ");
        int s = scanner.nextInt();
        int a1 = s / 1000000;
        System.out.println(a1);
        int a2 = s / 100000 % 10;
        System.out.println(a2);
        int a3 = s / 10000 % 10;
        System.out.println(a3);
        int a4 = s / 1000 % 10;
        System.out.println(a4);
        int a5 = s / 100 % 10;
        System.out.println(a5);
        int a6 = s / 10 % 10;
        System.out.println(a6);
        int a7 = s % 10;
        System.out.println(a7);
        s = a1 + a2 + a3 + a4 + a5 + a6 + a7;
        if (s == 35) {
            System.out.println("恭喜中奖！");
        } else {
            System.out.println("很遗憾未中奖！");
        }
    }
}

