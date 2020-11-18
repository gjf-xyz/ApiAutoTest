package day05;
/*
列表：list
1，特点：有序、可变、元素可以重复
2, List是Interface，无法实例化。ArrayList、LinkedList是它的实现类。ArrayList、LinkedList是它的实现类
    ArrayList类似于可变长度的数组。
    LinkedList 链表，查找元素效率高
 */

import day03.Demo02;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo03 {
    public static void main(String[] args) {
        List list;
        //定义一个列表，<String>表示列表中元素的类型
        List<String> names = new ArrayList<>();
        //增删改查，排序

        names.add("tom");
        names.add("Lily");

        String name = names.remove(0);//根据索引删除
        System.out.println(name); //删除的元素名字
        boolean b = names.remove("Lily"); // 根据元素值删除
        System.out.println(b); // 删除是否成功

        names.add("tom");
        names.add("Lily");


        names.set(0, "TOM"); //修改元素的值
        System.out.println(names.get(0)); // 获取元素的值
//        names.set(3,"Kity"); // 如果索引不存在，报错
        names.add(2, "Kity"); //插入元素

        System.out.println(names.size()); //列表长度
        System.out.println(names.contains("Tom")); //是否包含某个元素

        //遍历列表
        // for
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i)+",");
        }
        // foreach
        for (String n : names) {
            System.out.println(n);
        }

        //List<int> 基本类型无法放入列表
        //1~100放入一个列表，遍历将值打印到一列，用逗号分隔
        List<Integer> a = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            Integer c = i;
            a.add(c);

        }
        System.out.println(a);

        //新建一个学生的类，name，score两个属性，实例化几个学生，把学生加入列表

        Stu stu = new Stu("张三",96);
        Stu stu1 = new Stu("李四",99);
        Stu stu2 = new Stu("王五",90);

        List<Stu> ids = new ArrayList<>();
       ids.add(stu);
       ids.add(stu1);
       ids.add(stu2);
        System.out.println(ids);
        System.out.println(ids.get(0).name);
        System.out.println(ids.get(0).score);
        System.out.println(ids.get(1).name);
        System.out.println(ids.get(1).score);
        System.out.println(ids.get(2).name);
        System.out.println(ids.get(2).score);
        System.out.println(ids.get(0).toString());
        System.out.println(ids.get(1).toString());

        for (Stu stus : ids){
            System.out.println(stus.getName() + " "+stus.getScore());
        }
        Stu[] aa = {stu1,stu2}; //数组存放 Stu的对象
        List<Integer> dds = Arrays.asList(1,2,3,4,5,6); //数组转列表
        Integer[]  sss = (Integer[]) dds.toArray(); // 列表转数组
        System.out.println(Arrays.toString(sss));

        List<Stu> stus = Arrays.asList(stu1,stu2); //数组转换成列表




    }

}
class Stu{
     String name;
    float score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public Stu(String name, float score) {
        this.name = name;
        this.score = score;



    }
}
