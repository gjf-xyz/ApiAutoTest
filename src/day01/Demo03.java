package day01;

import java.util.Scanner; // 自动导包

/**
 *  Java中的输入和输出
 */

public class Demo03 {
    // 成员变量
    int classNumber = 36; //类的属性
    String schoolName ; // 可以不初始化

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // new 关键字表示创建一个对象，System.in表示从键盘输入


        System.out.println("请输入你的性别");
        // 获取输入的内容直到遇到空格
        System.out.println("请输入你的名字");
        // 定义一个String类型的变量，定义格式 数据类型 变量名 = 变量值；
        // 局部变量， 只在离他最近的括号内生效。出了作用域就失效了。
        String name = scanner.next(); // 类似 python中的inputec
        System.out.println(name);

        System.out.println("请输入你的年龄");
        int age = scanner.nextInt(); // 整型
        System.out.println(age);

        System.out.println("请输入你的身高（米):");
        float f = scanner.nextFloat(); // 浮点类型
        System.out.println(f);

        Demo03 demo03 = new Demo03(); //类实例化
        System.out.println(demo03.classNumber); //调用属性
        demo03.schoolName = "aaa";
        System.out.println(demo03.schoolName);


    }
}
