package day05;
/*
包装类： 基本类型包装成引用类型（对象）
每个基本类型都有一个包装类
int Integer
byte Byte
float Float
double Double
char Character
short Short
long Long
boolean Boolean

包装类的作用；1，提供了一些实用方法 2，集合中不允许基本类型，比如存放数字时，要用包装类

 */

public class Demo02 {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = new Integer(34);

        Integer c = a + b;
        String d = "34";
        int e = Integer.valueOf(d); //字符串转整数
        System.out.println(e);

        int f = Integer.parseInt("34");
        System.out.println(f);
        System.out.println(Integer.parseInt("34", 11)); //34是11进制的数，转成10进制
        System.out.println(Integer.parseInt("34EF", 16));//34EF是16进制的数，转成10进制
//        System.out.println(Integer.parseInt("34EF",2)); 进制不匹配，会报错
        System.out.println("十进制转十六进制： " + Integer.toHexString(100));
        System.out.println("十进制转二进制：" + Integer.toHexString(100));
        System.out.println("十进制转八进制： " + Integer.toHexString(100));

        int num1 = 10;
        int num2 = 0b111011101; //二进制数字，前面加0b
        int num3 = 01237; //八进制，前面加0
        int num4 = 0x123ef; //十六进制，前面加0x
        System.out.println("八进制转二进制：" + Integer.toBinaryString(01237));

        // 写一个函数，实现将一个五位的八进制转成十进制数。
        System.out.println(oct2sec("12345")); // 边界内的值
        // 最小边界值
        System.out.println(oct2sec("00000"));
        // 最大边界值
        System.out.println(oct2sec("70000"));
        // 非法的八进制，报错
        System.out.println(oct2sec("a1345"));
        // 长度小于5，报错
        System.out.println(oct2sec("1234"));
        // 长度大于5，报错
        System.out.println(oct2sec("123456"));
        // 空值
        System.out.println(oct2sec(null));
        System.out.println(oct2sec("+7777")); //正数
        System.out.println(oct2sec("-7777")); //负数

        // 拆箱：包装类转基本类型
        // 装箱： 基本类型转换成包装类型
        int j = 10;
        Integer i = j; // 自动装箱
        Integer k = 10;
        int m =k; // 自动拆箱
    }

    public static int oct2sec(String oct) {
        try {
            if (oct.length() != 5) {
                System.out.println("长度不正确");
                return -1;
            } else {
                int value = Integer.parseInt(oct, 8);
                return value;
            }
        } catch (Exception e) {
            System.out.println("输入的数据不是一个八进制数字：" + e.getMessage());
            return -1;


        }

    }
}
