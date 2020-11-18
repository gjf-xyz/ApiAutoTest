package day01;

/*
 * 运算符:
 * 赋值运算 : =，+=，-，-=，*，*=，/,/=
 * 比较运算:>、<,>= ,<=,==,!=
 * 算术运算 +、—、*、/、% ++（自加）、--（自减）
 * 逻辑运算； (python中 : and/or/not)  & (与），&&（短路与)、 |(或)、||（短路或）、!(非)， ^(异或）
        与： 两边都是true，结果为true，与和短路与计算结果是一样的。当左边能计算出结果时，就不去计算右边的，推荐使用&&
        或： 两边只要有一边是true，结果为true
        非： 取反
        异或：两边不一样时，结果为true


 * 位运算： >>> << >>
 三元运算： （条件表达式） ？ 表达式1：表达式2，如果条件表达式是true，执行表达式1，否则表达式2
    三元运算符可以用if-else来实现
 * */

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Demo05 {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i++); //先打印i，然后在执行i = i + 1
        System.out.println(i);

        System.out.println("======分割线======");
        i = 10;
        System.out.println(++i); // 先执行 i = i + 1，在打印i
        System.out.println(i);


        boolean b1 = false;
        int num = 18;
        if (b1 && num++ > 10) {
            System.out.println("今天晴天");
        } else {
            System.out.println("今天阴天");
        }
        System.out.println(num);  // $时，num= 19， &&时，num=18


        int m = 20;
        int n = 10;

        int max = (m > n) ? m : n; // m > n 如果为true，则返回m，否则返回n
        System.out.println(max);

        System.out.println("");
        //
        int a = 10, b = 20, c = 15;
        int d = (a > b) ? a : b;
        int e = (d > c) ? d : c;
        System.out.println(e);
        int f = Math.max(Math.max(a,b),c );





    }

}




