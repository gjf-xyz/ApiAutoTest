package day03;

import com.sun.org.apache.xerces.internal.xs.ItemPSVI;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class Demo06 {
    public static void main(String[] args) {
        // 九九乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + i * j + "\t");
            }
            System.out.println();



        }
        // 冒泡排序
        int[] d = {3,5,1,8,2,10};
        for (int i = 0; i<d.length-1; i++){
            for (int j=0; j<d.length-i-1;j++){
                if(d[j]>d[j+1]){
                    int temp = d[j];
                    d[j]=d[j+1];
                    d[j+1]= temp;

                }


            }

        }
        System.out.println(Arrays.toString(d));

        //冒泡排序
        int[] m = {2,8,3,12,4,10};
        for (int i = 0 ; i<m.length-1;i++){
            for (int j = 0; j<m.length-i-1;j++){
                if (m[j]>m[j+1]){
                    int temp = m[j];
                    m[j] = m[j+1];
                    m[j+1] = temp;

                }

            }
        }
        System.out.println(Arrays.toString(m));



        int[] s ={3,5,8,2,9,10};
        for (int i=0;i<s.length-1;i++){
            for (int j=0;j<s.length-i-1;j++){
                if (s[j]>s[j+1]){
                    int temp = s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(s));





        int[] g = {3,6,7,18,38,2,19};
        for (int i=0;i<g.length-1;i++){
            for (int j=0; j<g.length-i-1;j++){
                if (g[j]>g[j+1]){
                    int temp = g[j];
                    g[j] = g[j+1];
                    g[j+1]= temp;

                }
            }
        }
        System.out.println(Arrays.toString(g));









    }
}