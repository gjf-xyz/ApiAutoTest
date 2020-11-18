package studentManage.model;
// student类，属性跟数据库中字段对应

import sun.plugin2.main.server.Plugin;
import sun.security.mscapi.CPublicKey;

public class Student {
    private  String id;
    private  String name;
    private  String gender;
    private  String age;
    private  String classes;
    private  String phone;

    public Student(String id, String name, String gender, String age, String classes, String phone) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.classes = classes;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", classes='" + classes + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
     this.phone = phone;


    }

    public String getId(){
        return id;
    }
}
