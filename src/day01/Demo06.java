package day01;

/*
顺序
循环     while、for、do-while（python中没有）
分支结构：if-else： switch-case
 */

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
       int age = 18;
       if(age >= 18){
           System.out.println("已成年");
       }else {
           System.out.println("未成年");
       }
       // elif
       // else if
       //

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入狗的年龄");
            int age1 = scanner.nextInt();
            if (age1 > 0 && age1 <= 2){
                System.out.println("狗相当于人的年龄是: "+age1*10.5);
                break;
            }else if (age1 > 2) {
                System.out.println("狗相当于人的年龄是: " + (2 * 10.5 + (age1 - 2) * 4));
                break;
            }else{
                System.out.println("狗尚未出生。请重新输入！");
            }

        }

        // switch-case 多分支结构
        System.out.println("请输入一个季节");
        String season = scanner.next();
        switch (season) {
            case "春季":
                System.out.println("春暖花开");
//                break; //如果有break,则退出
            case "夏季":
                System.out.println("烈日炎炎");
//                break;
            case "秋季" :
                System.out.println("秋高气爽"); // 如果没有break,一直执行后面的case，直到遇到break为止
//                break;
            case "冬季":

                System.out.println("冬雪皑皑");
//                break;
            default:
                System.out.println("不认识得季节");
//                break;
        }
        //
        System.out.println("请输入一个月份");
        int mouth = scanner.nextInt();
        switch (mouth) {
            case 2 :
                System.out.println("春季");
            case 3:
                System.out.println("春季");
            case 4:
                System.out.println("春季");
            case 5:
                System.out.println("秋季");
            case 6:
                System.out.println("秋季");
            case 7:
                System.out.println("秋季");
            case 8:
                System.out.println("秋季");
            case 9:
                System.out.println("冬季");
            case 10:
                System.out.println("冬季");
            case 11:
                System.out.println("冬季");
            case 12 :
                System.out.println("冬季");
            case 1:
                System.out.println("冬季");
        }

    }
}
