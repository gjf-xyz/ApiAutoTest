package day06;
/*
文件读写（输入输出流，相对于计算机内存来说）：
读文件： 从磁盘读到内存中。 输入流，InputStream
写文件：从内存写到磁盘中. 输出流 ， OutputStream

字节流（一次读写8位）： InputStream、OutputStream
字符流 (16位）: Reader、write 是父类
open 打开文件
read/write 读写文件
close 关闭文件

*/

import java.io.*;
import java.sql.SQLOutput;

public class Demo02 {
    /*
    读文件、按字节读取
     */
    public static void readByBte(String fileName) throws IOException {
        // InputStream 是抽象类，FileInputStream 是它的一个子类
        FileInputStream in = new FileInputStream(fileName);
        // 读取文件
        int a = in.read();
        // System.out.write(a);
//        System.out.write(a);
        while (a != -1) { // 判断是否达到文件末尾

            System.out.write(a); //System.out.write将字节转换成字符后使用
            System.out.flush(); // 防止缓冲区的数据没有读出来
            a = in.read();
        }
        // 关闭文件
        in.close();

    }

    /*

     */
    public static void readByChar(String fileName) throws IOException {
        // FileReader是InputStreamReader的子类，InputStreamReader是Reader的子类
        FileReader fr = new FileReader(fileName);

        int a = fr.read(); //16位，unicode， 取值范围： 0x0000~0xFFFF, -1表示文件末尾
        while (a != -1) {
//            System.out.println((char) a); //打印一个字符
            System.out.print((char) a);
            a = fr.read(); //读取下一个字符
        }
        fr.close();
    }

    /*
    一次读一行
     */
    public static void readByLine(String fileName) throws IOException {
        FileReader r = new FileReader(fileName);
        // BufferedReader 构造方法需要一个Reader参数
        // Reader 是抽象类，无法实例化，用Reader的子类FileReader来实例化。
        BufferedReader br = new BufferedReader(r);
        String line = br.readLine(); //读取一行
        while (line != null) {
            System.out.println(line); //打印
            line = br.readLine(); // 读取下一行
        }
        br.close();
        r.close();

    }

    //BufferedReader  BufferedReader
    //FileReader FileWrite
    //FileInputStream FileOutputStream
    public static void write(String fileName, String content) throws IOException {
        //BufferedWrite
        Writer b = new FileWriter(fileName, true);
        //创建写文件的对象
        BufferedWriter b1 = new BufferedWriter(b);
        // 写文件
        b1.write(content);
        //关闭文件
        b1.close();


    }


    public static void main(String[] args) throws IOException {
        readByBte("d:/test.txt");
        System.out.println();
        readByChar("d:/test.txt");
        System.out.println();
        readByLine("d:/test.txt");
        write("d:/test2.txt", "花开满城、明灯三千");
        readByLine("d:/test2.txt");


    }
}
