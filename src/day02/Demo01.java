package day02;
/*
循环: for 循环、while循环、do-while循环
循环包含四部分内容: 初始化条件、循环条件、循环体、迭代条件
 */

import java.util.Random;
import java.util.Scanner;

public class Demo01 {
    int i; // 实例的属性    对象 .i
    static int j; // 类的属性 Demo01.j

    public static void main(String[] args) {
//        int i;
        Demo01 dd = new Demo01(); //创建一个对象
        System.out.println(dd.i);
        for (int i = 0; i < 5; i++) {  //int i =0 初始化条件；i < 5 循环条件； i++ ; 迭代条件

            System.out.println("Hello world"); //循环体
        }
//        System.out.println(i);
        /*
        1.int = 0 只执行一次
        2.i<5 是不是成立
        3.如果成立，执行循环体，如果不成立，跳出循环
        4.再去执行i++

        1 -> 2 -> 3 -> 4 -> 2 -> 3 -> 4 -> 2 -> 3 -> 4
         */

        //打印1~100之间的偶数，for循环遍历

        for (int a = 2; a <= 101; a += 2) {
            System.out.print(a + ",");
        }
        System.out.println("\n");

        for (int a = 2; a <= 101; a += 2) {
            if (a % 2 == 0) {
                System.out.print(a + ",");
            }
        }
        System.out.println(""); //换行
        int k = 0; //初始化条件
        while (k <= 100) { // 循环条件
            // 循环体
            if (k % 2 == 0) {
                System.out.print(k + ","); // 打印到下一行
            }
            //  迭代条件
            k++;
        }
        System.out.println(""); //换行

        //1-100的和，while求和
        // ctrl +alt +l 格式化代码
        int b = 0;
        int s = 0; //定义一个结果，存储结果
        while (b <= 100) {
            s = s + b; //
            b++;
        }
        System.out.println(s);
        // 1*2*3*...*100
        int c = 1;
        long long1 = 1; //
        while (c <= 20) {
            long1 += c;
            c++;
        }
        System.out.println(long1);

        // 1+2+3+....+100
        int x = 0; //初始化条件
        int d = 0;
        do {
            d = d + x; // 循环体
            x++; // 迭代条件
            System.out.println("do-while-1");
        } while (x <= -1); // 循环条件
        System.out.println(d);

        // do-while 至少执行一次

        //******** 8个 j = 1; i = 8
        //********   j = 2; i = 8
        //********   j = 3; i = 8
        //********   j = 4; i = 8
        //********   j = 5; i = 8
        //********
//        for(int  i = 0; i < 6; i++) {//打印8行 控制行
//            for (j = 0; j < 6; j++) { // 打印一行，每行8个星星 控制列
//                System.out.println("*");// 6*8=48次
//            }
//        }
//            System.out.println();
//

//            for (int j = 0; j < 6; j++) {
//                // j = 0
//                // i = 0; i = 1
//
//                for (int i = 0; i < j + 1; j++) {
//                    System.out.print("*");
//                }
//            }
//                System.out.println();

        // 圈复杂度（也就是嵌套深度）不能太高:1、执行效率低 2、 代码逻辑复杂
        // 3, 圈复杂又专门静态检查工具

        // break: 跳出循环
        // continue: 跳出本次循环
        aaa:
        for (int i = 1; i <= 4; i++) {
            bbb:
            for (int j = 1; j <= 10; j++) {
                if (j % 4 == 0) {
//                   break; // 跳出包裹此关键字的这一层的循环
                  /*
                  123
                  123
                  123
                  123
                   */
//                    continue; // 12345678910 * 4
//                    break aaa; //跳出到指定层次 123*1
                    continue aaa; // 123*4
                }
                System.out.println(j);
            }
            System.out.println();
        }

            // 循环录入某个学生5门课程的成绩（可能是小数），计算平均分。如果录入负数，停止并提示错误
            // for 循环实现
            Scanner scanner = new Scanner(System.in);
                System.out.println("请输入5门课成绩: ");
                float total = 0;
                for (int e = 1; e <= 5; e++) {
                    float score = scanner.nextFloat();
                    if (score < 0) {
                        System.out.println("请停止输入: ");
                        break;
                    } else {
                        total = total + score;


                    }
                }
                System.out.println("总成绩为: " + total + ",平均成绩为: "+ total/5);










    }
}
