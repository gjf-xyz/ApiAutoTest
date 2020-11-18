package day01;

/**
 * Java:注释、标识符、输入和输出，变量
 *Java数据类型：(1） 8种数据类型： 整型(byte,short,int long)、浮点型（float，double）、字符型（char），boolean类型
 *            （2） 引用类型： 类（class）、接口（interface）和数组(array）
 * Pytnon可变数据类型：列表，字典，集合
 *        不可变数据类型： 数值(int、float、double、bool）元组，字符串
*/
public class Demo04 {
    public static void main(String[]args){
      //1.整型（byte、short、int、long）,取值范围不一样
      //byte 一个字节来表示，取值范围： -128~127
      byte b1 = -128;
      byte b2 = 127;
      //byte b3 = 255; //超出取值范围，报语法错误
      System.out.println(b1 + "," + b2);
      // short 两个字节表示，取值范围：-2的15次方 —— 2的15次方-1，-32678-32767
      short s1 = -32768;
      short s2 = 32767;

      System.out.println(s1 + "," + s2);
      // int四个字节表示，取值范围： -2的31次方~2的31次方-1，-2147483648-2147483647
      int i1 = -2147483648;
      int i2 = 2147483647;
      System.out.println(i1 + "," + i2);
      // long 八个字节来表示,long类型的数字后面加个L
      long long1 = -9223372036854775808L;
      long  long2 = 9223372036854775807L;// 大小写都可以，尽量不要用小写l

      System.out.println(long1 + "," + long2);
      // 浮点类型，float 4个字节， double 8个字节.浮点数字默认是double类型的，如果赋值给float，数字后面加f
      float f1 = 1123.13123f;
      double d1 = 1123.13123;
      System.out.println(f1 + "," + d1);
      // 字符类型，值使用单引号括起来，String字符串，使用双引号括起来
      char c1 = '0'; //48
      char c2 = 'a'; //97
      System.out.println(c1 + "," + c2);
      System.out.println(c1 + c2); //不是0a, 而是145（两个ASCII码相加）， char类型实际存储的是整数
      char c3 = '\n';
      char c4 = '\t'; // 可以是转义字符
      // boolean取值true/false
      boolean boll = true;
      boolean bool2 = false; //

      // 类型与类型之间的转换。除boolean布尔之外的7种类型间转换
      // 自动转换： 小容量向大容量转换  小瓶水倒入大瓶子中 byte\char\short-->int--->long--->float--->double
      // 强制转换   大容量向小容量转换  大瓶水倒入小瓶子中
      byte byte1 = 10;
      int int1 = 20;
      int int2 = byte1 + int1; // byte1会自动转换成int类型后，在与int1计算
      System.out.println(int2);

      long long3 = 102342342343434343L;
      //小容量与大容量计算是，自动把小容量的转化成大容量的在计算 最终结果是大容量类型的·
      long long4 = long3 + int1; // int1会自动转成long类型后，在long3计算 结果最终是long类型
      // 强制转换会导致溢出或精度丢失
      int int3 = (int) (long3 + int1); // (int)long3 + int1
      System.out.println((int3)); //-220608389




    }
}
