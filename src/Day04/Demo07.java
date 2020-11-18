package Day04;

public class Demo07 {
    public static void main(String[] args) {
        AlarmDoor door = new AlarmDoor();
        door.open();
        door.close();
        door.alarm();

        PuTongDoor door1 = new PuTongDoor();
        door1.open();
        door1.close();
        
        Computer b = new Computer();
        b.usb("充电中");
        
    }
}
/*
门: 抽象类、开门、关门两个方法
警报: 接口类，报警的接口
防盗门: 从门继承，实现了警报的功能
 */
abstract  class Door{
    public abstract  void open(); //开门
    public  abstract  void  close(); //关门
}
interface Alarm{
    void alarm(); //报警的功能
}
interface  Usb{
    void usb(String status);
}
class Computer implements  Usb{

    @Override
    public void usb(String status) {
        System.out.println("传输数据");
        System.out.println(status);
    }
}
// 实现类
//防盗门，从门继承，同时实现了警报的功能
class AlarmDoor extends Door implements  Usb, Alarm{

    @Override
    public void open() {
        System.out.println("指纹校验通过，打开门");
    }

    @Override
    public void close() {
        System.out.println("关并锁门");
    }

    @Override
    public void alarm() {
        System.out.println("陌生人靠近，报警");

    }


    @Override
    public void usb(String status) {
        System.out.println("通过usb充电");
    }
}
class PuTongDoor extends Door{

    @Override
    public void open() {
        System.out.println("一推就开");
    }




    @Override
    public void close() {
        System.out.println("一推就关");

    }
}