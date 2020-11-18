package day03;
/*
static
1. 修饰方法，静态方法 比如main
2. 修饰变量
3.修饰类
 */

public class Demo04 {
    String name; // 成员变量，有多少个实例，就会有多少份。
    static String school; //静态变量，内存里只有一份。

    // 静态方法， static修饰
    public static void  print(String s){
        System.out.println(s); // 静态方法访问不了成员变量。

    }
    public void log(String s){
        System.out.println(s + name);
    }

    public static void main(String[] args) {
        Demo04.print("hello world"); // 静态方法调用: 类名.方法名
        Demo04 d = new Demo04();
        d.log("hello Java"); // 实例.方法名
        Voter yangruirui = new Voter("杨瑞瑞"); //创建一个选民的实例
        yangruirui.vote();// 杨瑞瑞投票
        System.out.println(Voter.count);

        Voter yumengmeng = new Voter("于萌萌");
        yumengmeng.Vote();
        System.out.println("于萌萌");

        for (int i = 1; i<=20; i++ ){
            Voter y = new Voter("1"+i);
            System.out.println(Voter.count);
            y.vote();
        }






    }
}
// 一群选民去投票，每个人投一票，投票总数达到20，停止投票
class Voter{
    String name; // 选民的名字，表示是不同的选民
    static int count; // 投票总数
    //构造方法
    public  Voter(String name){
        this.name = name;

    }
    // 投票
    public  void vote(){
        if (count >20){
            System.out.println("投票已经停止！");
            return;
        }
        System.out.println(name + ",谢谢投票！ ");
        count = count + 1;
    }

    public void Vote() {
    }
}