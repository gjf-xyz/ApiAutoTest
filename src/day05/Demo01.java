package day05;
/*
异常处理： try-catch finally (同python中try-except-finally) throw throws
 */

public class Demo01 {
    public static void main(String[] args) {
        String s = null;
        try {
            float a = 10 / 0;
            s.toLowerCase();  //
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println(e.getMessage()); // e.getMessage()shi异常信息
            e.printStackTrace(); //打印调用栈（函数之间的调用关系）
        } finally {
            System.out.println("执行结束");
        }

    }

}

class Student {
    String name;
    char gender;

    // throws 放在方法头的，使用throws声明抛出了一个异常
    //throw 是放在方法体中，使用throw抛出有个异常
    public void setGender(char gender) throws Exception {
        if (gender == '男' || gender == '女') {
            this.gender = gender;
        }else{
            System.out.println("输入的参数错误");
            Exception exp = new Exception("性别必须是男或女"); //自定义一个异常
            throw exp;//使用throw抛出一个异常
        }

    }

    public static void main(String[] args) {
        Student student = new Student();
        try{
            student.setGender('h');
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("结束");
        }

    }

}




