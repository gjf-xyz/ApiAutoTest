package Day04;
/*
面向对象的三大特点: 封装、继承、多态
封装： 把属性设置为private
 */

public class Demo01 {
    public static void main(String[] args) {
        Student zhangsan = new Student();
        zhangsan.name = "zhangsan";
        zhangsan.age = 20;
        zhangsan.gender= '男';
        // gender; 男、女
        zhangsan.gender = '鬼';
        System.out.println(zhangsan.toString());
        System.out.println(zhangsan.name); // 获取名字


        Student1 lisi = new Student1();
        lisi.setName("lisi");
        String name = lisi.getName();
        System.out.println(name);

        lisi.setGender('女');
        System.out.println(lisi.getGender());
        lisi.setGender('鬼');
        System.out.println(lisi.getGender());

        lisi.setAge(120);
        System.out.println(lisi.getAge());
        lisi.setAge(-34);
        System.out.println(lisi.getAge());
    }
}
class Student{
    String name; //姓名
    int age;  // 年龄
    char gender; // 性别

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
    public  String getName(){
        return  name;
    }
    public int getAge(){
        return  age;
    }
    public char getGender(){
        return  gender;
    }
}
// 封装:把属性设置为private,对外提供public的get,set方法去访问
// 实现细节封装在类的内部，可以给属性增加一些逻辑控制，调用者通过类提供的方法访问属性/数据，避免一些不合理的操作
class Student1 {
    private String name; //姓名
    private int age;  // 年龄
    private char gender; // 性别

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public void setName(String a){
        this.name = a;

    }
    public String getName(){
        return  name;
    }
    public  void  setAge(int b ) {
        if (b < 0 || b> 200) {
            System.out.println("非法的参数，请重新设置");

        } else {
            this.age = b;
        }
    }
    public  int getAge(){
        return  age;
    }
//    public  void setGender(char b){
//      this.gender = b;
//    }
    public char getGender(){
        return  gender;
    }
    public void setGender(char gender){

            this.age = age;
        }



}
class Student2{
    private String name; //姓名
    private int age;  // 年龄
    private char gender; // 性别


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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

