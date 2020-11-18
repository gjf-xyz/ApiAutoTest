package day08;
/*
实用类
Math:常用到的一些数学运算方法，常量PI
Random: SecureRandom ： 生成随机数（开发的代码里，不允许使用Random，要用SecureRandom）
Date: 日期的类（写日志文件，拿当前时间作为文件名: 2、把当前时间记录到日志中: 3、代码中加等待时间）

 */

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Demo01 {
    public static void main(String[] args) throws InterruptedException {
        //伪随机数，种子+算法，Random 是拿当前时间作为种子，SecureRandom是用临时文件大小，线程休眠时间作为种子
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());  //int 范围内的随机数
            System.out.println(random.nextInt(10));//0~参数之间的随机数
            System.out.println(random.nextFloat()); // 0~1之间的小数

        }
        System.out.println("===============分割线================");
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());  //int 范围内的随机数
            System.out.println(random.nextInt(10));//0~参数之间的随机数
            System.out.println(random.nextFloat()); // 0~1之间的小数

        }
        System.out.println("==============分割线=============");
        Date date = new Date();
        System.out.println(date); // 获取当前时间， Thu Nov 05 09:54:07  CST 2020

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss"); //新建一个格式
        System.out.println(sdf.format(date));

        System.out.println(date.getTime()); //把时间改成时间戳 , 1970-1-1 8:00 0

        long begin = (new Date().getTime());
        Thread.sleep(3000); //等待5秒
        long end = (new Date().getTime());
        System.out.println("耗时" + (end - begin));


    }
}