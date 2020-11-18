package day01;

import java.util.Scanner;

public class Demo07 {
    // 成员变量
    int classNumber = 36;
    String schoolName;

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("请输入你的名字");
        System.out.println("请输入你的名字");
        String name = scanner.next(); //定义一个成员变量, 数据类型+变量名=变量值
        System.out.println(name);

        Demo03 demo03 = new Demo03();
        System.out.println(demo03.classNumber);
        demo03.schoolName = "aaa";
        System.out.println(demo03.schoolName);


    }
}
