package day03;
/*
构造方法:
    1. 与类名一样的方法，在python中是__init__，实例化时调用的构造方法。
    2. 默认存在一个无参数，无返回值的构造方法
    3. 构造方法不能有返回值，方法内不能有return语句
    4. 构造方法初始化/实例化时使用，构造方法的重载，让实例化对象更加灵活。
 */

public class Demo03 {
    //默认的构造方法
    public Demo03() {

    }

    public static void main(String[] args) {
        Animal dog = new Animal(); //Animal()是构造方法
        dog.name = "旺财";
        dog.age = 10;

        Animal dog1 = new Animal("阿黄"); //Animal("阿黄")是构造方法
        dog1.age = 10;

        Animal dog2 = new Animal("阿呆", 5);

    }
}

class Animal {
    String name;
    int age;

    //默认的构造方法
    public Animal() {

    }

    // 定义的一个构造方法
    public Animal(String a) {
        name = a;
    }

    public Animal(String a, int b) {
        name = a;
        age = b;
    }
}

// 通过IDE可以自动生成构造方法
class Dog {
    String name; // 成员变量，实例变量
    int age; // 成员变量，实例变量
    static int omount; //类变量

    /*
    // 成员变量与局部变量： 定义的位置不一样
    // 成员变量：类里面，不在任何方法里面的变量（方法外面定义的）
    实例变量（局部变量）；不用static修饰的变量
    类变量： static修饰的变量
    // 局部变量： 方法里面、if-else、for、while、形参（定于欧方法是的参数）
    */
    // this
    public Dog(String name) {//String name 局部变量，作用域就这个方法的花括号内
        // this.属性名。 this代表实例,区分成员变量和局部变量
        // this.方法名()
        this.name = name;
    }


    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}