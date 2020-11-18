package Day04;
/*
继承: 所有类的父类object
 */
//1.圆的类: 半径 r、方法: 计算圆周长（r 封装到类的内部，提供get、set方法,构造方法）
//2.圆柱的类，从圆继承，属性:高，重写父类计算面积的方法，和重写计算周长的方法
//新建一个文件，两个类写到新建的文件中。

public class Demo02 {
    public static void main(String[] args){
        Dog wangCai = new Dog("旺财",10,100);
        wangCai.setName("旺财"); // 子类继承父类的属性和方法
        wangCai.setHealth(80);
        System.out.println(wangCai.toString());

        Dog dog1 = new Dog("阿黄",5,50,"拉布拉多犬");
        System.out.println(dog1.toString());
    }
}
//宠物类
class Pet{
     private String name;
     private  int age;
     private  int health; // 健康度

    public Pet(String name, int age, int health) {
        this.name = name;
        this.age = age;
        this.health = health;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", health=" + health +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
//宠物狗的类，从宠物类继承，继承使用extends关键字
// 子类继承父类的属性、方法、不继承父类的构造方法
class Dog extends  Pet{
    private String strain = "牧羊犬"; //品种

    public Dog(String name, int age, int health) {
        super(name, age, health); //super表示父类，也叫superClass超类
    }
    public  Dog(String name,int age,int health,String strain){
        super(name,age,health); // 调用父类的构造方法
        this.strain = strain;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    @Override // 重写：子类重写父类同名的方法
    public String toString() {
        return "Dog{" +
                "strain='" + strain + '\'' +
                "} " + super.toString(); //supper.toString（）调用父类的toString()方法
    }
}