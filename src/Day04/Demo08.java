package Day04;
/*
final 最终的
1.修饰类,该类不能被继承
2.修饰方法,该方法不能被重写
3.修饰变量/成员变量，只能被赋值一次
 */

public class Demo08 {
    public  static final  float PI = 3.14F; //常量
}
final class A{

}
//class B extends A{
//
//}
class B{
    public final void func(){
        final String name;
        name ="AA";
        //name = "BB";

    }
}
//class C extends  B{
//    public void func(){
//
//    }
//}
