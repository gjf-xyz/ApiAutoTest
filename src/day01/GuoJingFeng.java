package day01;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class GuoJingFeng {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. 编写一个程序,为给定的年份找出其中国生肖值。(中国生肖基于12年一个周期)
        //注:1900年属鼠,因为1900%12为4,则判定4为鼠年,依次类推。
        System.out.println("请输入一个年份: ");
        int year = scanner.nextInt();
        if (year < 0) {
            System.out.println("输入不合法");
        }else{
            int a = year%12;
            switch (a){
                case 1:
                    System.out.println(year+ "年是鸡年");
                    break;
                case 2:
                    System.out.println(year+ "年是狗年");
                    break;
                case 3:
                    System.out.println(year+ "年是猪年");
                    break;
                case 4:
                    System.out.println(year+ "年是鼠年");
                    break;
                case 5:
                    System.out.println(year+ "年是牛年");
                    break;
                case 6:
                    System.out.println(year+ "年是虎年");
                    break;
                case 7:
                    System.out.println(year+ "年是兔年");
                    break;
                case 8:
                    System.out.println(year+ "年是龙年");
                    break;
                case 9:
                    System.out.println(year+ "年是蛇年");
                    break;
                case 10:
                    System.out.println(year+ "年是马年");
                    break;
                case 11:
                    System.out.println(year+ "年是羊年");
                    break;
                case 12:
                    System.out.println(year+ "年是猴年");
                    break;

            }

         // 2. 将百分制的学生成绩转成A/B/C/D等级制
            ////  分数>=90：A
            ////  90>分数>=70:B
            ////  70>分数>=50:C
            ////  分数<50:D
            System.out.println("请输入一个分数: ");
            int score = scanner.nextInt();
            if(score>=90){
                System.out.println('A');
            }else if(90 > score && score >=70){
                System.out.println('B');
            }else if(70 > score && score >=50){
                System.out.println('C');
            }else{
                System.out.println('D');
            }

         //3.3.输入一个4位数的会员卡号，如果4个数的和为25，则该会员中奖。比如输入卡号6666，和为24.

            System.out.println("请输入一个4位数的会员卡号: ");
            int num = scanner.nextInt();
            int b = num/1000 +(num%1000)/100+(num%100)/10+num%10;
            System.out.println(b);
            if (b == 25) {
                System.out.println("恭喜中奖");
            }else{
                System.out.println("未中奖");

            }


        }

    }
}


