package day01; // 包路径
// Demo1为类名·与文件名一致。 首字母大写
// public是修饰符，是公共类 private 、 protected
// class 关键字，定义一个类
// 一个文件只能有一个public的类,public的类名与文件名一致。

public class Demo01 {
    // main 方法
    // public 公共的方法
    // static 表示静态的方法，静态方法调用的时候是类名+方法名调用。 Demo01.main
    // void 是返回值的类型，void表示没返回值
    // string[] 强类型的语言，args是参数名，string[]是参数类型，表示string类型的数组
    public static void main(String[] args) {
        //Systame.out.println 打印方法
        // 字符串用双引号括起来
        // 一条语句的结束使用；来结束
        System.out.println("Hello world"); // print("Hello world")
        // sout +回车
        System.out.println("Hello");
        System.out.print("print是不换行");
        System.out.print("World");


    }

// 单行注释
/*
多行的注释
/*
 /**
 * 文档注释、类、方法上使用的，说明性的，可以导出为文档。
 */
}

/**
 * Demo02
 */


class Demo02 {
    /**
     * 文档注释，对方法，方法的参数、返回值进行说明
     *
     * @param a 参数1
     * @param b 参数2
     * @return 返回结果为 a+b
     */


    public static int funcl(int a, int b) {
        return a + b;
    }

     /*
     标识符： 类名、方法名、变量名、包名
     1. 大小写、数字、下划线、$组成，不能以数字开头
     2. 不能用关键字和保留字，goto、const、 int、String等
     3. 规范(静态检查工具)
        包名: 全小写字母， xxxyyyzzz
        变量名、 方法名： 小驼峰，第一个单词首字母小写，后面单词首字母大写。xxxyyyZzzz
        类名：大驼峰， 每个单词首字母大写 XxxYyyZzzzz
        常量 : 全部字母都大写，单词之间用下划线分割， 比如XXX YYY ZZZZ

        文件； 代码行数，不超过500行/1000行
        方法; 代码行数 ，不超过30行
      */

}
