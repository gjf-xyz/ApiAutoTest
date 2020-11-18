package day08;
/*
字符串
String: 字符串常用的操作
StringBuilder: 字符串连接
StringJoiner: 字符串拼接
 */

import java.util.Arrays;
import java.util.Date;
import java.util.StringJoiner;

public class Demo02 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc"); //不常用
        //字符串判断是否相等，要用equals方法，不能用==，==比较的是内存地址，equals比较的是内容
        System.out.println(s1 == s2);


        // charAt() 获取某个位置上的字符
        System.out.println(s1.charAt(1));
        // contains() 是否包含某个子串
        System.out.println(s1.contains("bc"));

        // toLowerCase toUpperCase
        String s3 = "hello, this is a java file.";
        System.out.println(s3.toUpperCase());

        // subString 取子串
        String s4 = s3.substring(0,5); // 起始索引，结束索引(取的子串包含起始，不包含结束索引)
        System.out.println(s4);
        String s5 = s3.substring(7); // 一个参数表示起始的位置，一直取到最后
        System.out.println(s5);
        // indexOf("") lastIndexOf("") 获取字符在字符串中的索引
        int a = s3.indexOf(" "); //从头开始找
        int b = s3.lastIndexOf(" "); // 从字符串结尾倒序查找
        System.out.println(a); // 6
        System.out.println(b);  // 21

        // D:\learnjava\src\day08\Demo02.java
        // 取后缀名 java
        // 取文件名 Demo02.java
        String m  =  "D:\\learnjava\\src\\day08\\Demo02.java";
        int c  = m.lastIndexOf(".");
        System.out.println(m.substring(c + 1));
        int d = m.lastIndexOf("\\");
        System.out.println(m.substring(d + 1));

        // +
        String x = "Hello";
        String y = "World";
        String z1 = x+y;
        String z2 = x.concat(y); //
        System.out.println(z1);
        System.out.println(z2);
        // 拼一个1,2,3,4,5......10000, 计算耗时
//        String.valueOf(10); //整数转字符串
        long begin = (new Date().getTime());
        String str = "";
        for (int i=1;i<=100;i++){

            str = str + i + ",";


        }
        System.out.println(str);

//        Thread.sleep(3000); //等待5秒
        long end = (new Date().getTime());
        System.out.println("耗时" + (end - begin)); //10000 耗时: 519ms  100000 耗时 ： 30842

        // 涉及大量字符串拼接的时候，使用StringBuilder, 效率高，占用内存少。
        StringBuilder sb = new StringBuilder();
        begin = (new Date()).getTime();
        for (int i = 1; i<= 4500; i++){
            sb.append(i);
            sb.append(",");
        }
        end = (new Date()).getTime();
        System.out.println(sb);
        System.out.println("耗时" + (end - begin)); //10000 耗时: 519ms  100000 耗时 ： 30842

        /*
        + 拼接，每循环一次，生成一个临时的str变量放在内存中
        StringBuilder 不会生成临时变量
         */

        String filePath = "d:\\test\\aa\\bb\\cc.java";
        // 字符串分割
        String[] temp = filePath.split("\\\\");
        System.out.println(Arrays.toString(temp));
        // join 静态方法，第一个参数用来拼接的字符，第二到最后的参数是可变参数。
       String tt =  String.join("/","d:","test","aa","bb","cc.java");
        System.out.println(tt);

        //字符串分割和拼接的功能很常见，Java提供了专门用来拼接的类： StringJoiner
        StringJoiner sj = new StringJoiner(",","Hello","!");
        String[] names = {"Tom", "Lily", "Lucy"};
        for (String name: names){
            sj.add(name);
        }
        System.out.println(sj);
        //字符串比较
        System.out.println("aaa".equals("aaa"));
        System.out.println("aaa".equalsIgnoreCase("AAA")); //不区分大小写


    }
}
