package Day04;
/*
多态：多种形态。子类从父类继承，他既是子类的类型，也是父类的类型。
 */
class Cat extends Pet{
    public Cat(String name,int age,int health){
        super(name,age,health);
    }
}
public class Demo04 {
    // 宠物看病的方法
    // Dog类型，dog是参数名
    public  static  void master(Dog dog){
        if (dog.getHealth()<60){
            System.out.println("吃药打针输液");
            dog.setHealth(80);
        }else{
            System.out.println("洗澡按摩");
            dog.setHealth(90);
        }
    }
    public  static  void master_shenyi(Pet pet){
        if (pet.getHealth()<60){
            System.out.println("吃药打针输液");
            pet.setHealth(80);
        }else{
            System.out.println("洗澡按摩");
            pet.setHealth(90);
        }
    }


    public static void main(String[] args) {
        Dog dog =new Dog("",10,10);
        master(dog);
        master_shenyi(dog);


        Pet cat = new Pet("",5,70);
//        master(cat); //父类不能当做子类去用。
        master_shenyi(cat);

        Cat c = new Cat("",20,80);
        master_shenyi(c);
    }
}
