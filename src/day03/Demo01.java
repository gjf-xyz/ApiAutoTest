package day03;
/*
面向对象：Object oriented Programming OOp
    把大象装入冰箱：
    大象： 大象。进入（冰箱)
    冰箱：冰箱.开门，关门.关门
    人： 人.打开（冰箱）  人.操作(大象） 人.关闭（冰箱)
   类(类型)：是一个抽象，具有属性和方法的一组对象的抽象
   对象: 是具体的实例，是具体的一个人/物

面向过程：
    最小单位势函数。
    把大象装入冰箱： 1，打开冰箱门  2，把大象放入冰箱 3， 把门关上。三个步骤封装成三个函数，按顺序调用

 */


public class Demo01 {
    public static void main(String[] args) {
        // Student: 是一个类型，表示一类人。类
        // zhangsan： 是一个实例，表示一个具体的人。对象
        Student zhangsan = new Student();
        zhangsan.name = "张三";
        zhangsan.age = 20;
        zhangsan.gender = '男';
        zhangsan.height = 160;
        zhangsan.weight = 50;

        zhangsan.learning();
        zhangsan.sleeping();
        zhangsan.info();

        // 在创建一个实例
        Student lisi = new Student();
        lisi.name = "李思";
        lisi.age = 22;
        lisi.gender = '女';
        lisi.height = 165;
        lisi.weight = 47;

        lisi.learning();
        lisi.sleeping();
        lisi.eating("盖浇饭","可乐"); //
        lisi.info();

        // 定义一个类， 圆  circle
        // 属性： 半径 r，圆心
        // 行为： 面积 area，周长 perimeter

       Cirle a = new Cirle();
       a.r = 4;
       //
       a.area();
       a.perimeter();


    }


}

/*
    属性： 性别，年龄，身高，体重，班级   属性->变量
    行为： 学习、吃饭、睡觉、打游戏      方法
     */
class Student {
    String name;   //姓名
    char gender;  //性别
    int age;   // 年龄
    float height; // 身高
    float weight;  // 体重

    public void learning() {
        System.out.println(name + "正在学习");
    }

    public void sleeping() {
        System.out.println(name + "正在睡觉");
    }
    public  void eating(String rice, String soup){
        System.out.println(name + "正在吃"+ rice + "喝" + soup);
    }

    public void info() {// 打印学生信息
        System.out.println("学生姓名: " + name + ",性别: " + gender + ". 年龄" + age +
           height + ",身高: " + weight + ",体重");
    }
}

class Cirle {
    //属性
    float r;
    // public 公共
    // void 无返回值
    // area 方法/函数名
    // () 括号内定义的参数
    // {} 方法体
    // 没有参数，没有返回值

    // 没有参数，有返回值
    public void area() {
        double b = Math.PI * r * r;
        System.out.println(String.format("面积%.2f m²",b));

    }

    public void perimeter() {
        double c = 2 * Math.PI * r;
        System.out.println(String.format("周长%.2f m",c));
    }


}






