package Day04;

/*
接口: 是一种特殊的抽象类，接口中定义了一些抽象方法和常量
接口使用interface来定义

飞机和鸟都有飞的功能，飞机和鸟是两种不同的事物，两者之间没有继承关系
把飞机和鸟飞的功能提取成一个公共方法，可以作为一个接口。
 */
public interface Demo06 { ;

    public static void main(String[] args) {
//        Fly fly = new Fly() ;
        Fly plane = new Plane();
        plane.fly();
        Fly bird = new Bird();
        bird.fly();
    }
}
interface  Fly{
    public static final String name = "";
    // 在接口中定义的方法都是公共的，抽象的。即使不用public abstract修饰，也是公共的
    public abstract void fly();
}


class Plane implements Fly{

    @Override
    public void fly() {
        System.out.println("飞机飞行");

    }
}
class Bird implements  Fly{
    @Override
    public void  fly(){
        System.out.println("鸟儿飞");
    }
}
