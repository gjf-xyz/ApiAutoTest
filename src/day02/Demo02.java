package day02;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

/**
 * 数组:同一个类型的一组数据，使用一个名字访问。固定长度，有序排列的。
 */

public class Demo02 {
    public static void main(String[] args) {
        int[] ids; //数组声明
        ids = new int[]{1001, 1002, 1003}; //数组的初始化，初始化时进行了赋值操作
        System.out.println(ids[1]); //使用下标访问第二个元素，如果下标超过数组的长度，数组越界java.long.Array
        System.out.println(ids.length); //数组的长度
        //
        for (int a : ids) {
            System.out.println(a);
        }
        // 遍历数组
        for (int i = 0; i < ids.length; i++) {
            System.out.println(ids.length);
        }
        int[] nums = new int[10]; // 先声明一个数组，不赋值，10表示数组长度
        // 不赋值的情况下，有默认的初始值，int类型的初始值是0
        for (int n : nums) {
            System.out.println(n);
        }
        // 数组的定义方式三
        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; //

        //String数组，存放人名
        String[] names = {"杨瑞瑞", "于萌萌", "郭金凤", "陆凯利"};

//        System.out.println(names);
//        for (String name: names){
//            System.out.println(name);
//        }
        String[] os = new String[10];
        // String是引用类型，引用类型的默认初始值是0值
        // int\float\double\ 是基本类型，基本类型默认初始值是0
        for (String n : os) {
            System.out.println(n); //打印出来为null
        }

        //  找出数组中的最大值、最小值
        // 打擂的方式
        int[] scores2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int max = scores2[0]; // 将数组中第一个元素设置为max
        for (int s : scores2) {
            if (s > max) {
                max = s;
            }
        }
        System.out.println(max);
        String[] stu = new String[]{"ss", "ww", "dd", "qq", "zz", "vv"};
        String min = stu[0];
        for (String name : stu) {
            if (name.compareTo(min) > 0) {
                min = name;
            }
        }
        System.out.println(min);
        System.out.println("AA".compareTo("AA")); // 相等返回0
        System.out.println("AA".compareTo("AB")); // -1
        System.out.println("ZB".compareTo("BA")); // 24
        System.out.println("中国".compareTo("花朵")); // -13444
        char c = '中';
        char h = '花';
        System.out.println(c - h);
        System.out.println(c);
        // 冒泡排序: 由大到小排序
        int[] m = new int[]{8, 4, 7, 3, 9, 2, 5};
        int a;
        for (int i = 0; i < m.length-1; i++) {
            for (int j = 0; j < m.length-1-i; j++) {
                if (m[j] > m[j + 1]) {
                    int temp = m[j];
                    m[j] = m[j + 1];
                    m[j + 1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println(Arrays.toString(m));

    }

    }





