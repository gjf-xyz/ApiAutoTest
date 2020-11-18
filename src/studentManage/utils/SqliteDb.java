package studentManage.utils;


import studentManage.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
aqlite 相关的操作
1. 连接数据库
2.执行sql语句
3.断开连接
 */
public class SqliteDb {
    Connection conn;
    /*
    连接数据库：通过驱动连接，每种类型的数据库有相应的驱动，驱动的版本与数据库版本有对应关系。
     */
    private void connect(){

        String JDBC_DRIVER = "org.sqlite.JDBC"; //常量：驱动的名字
        String JDBC_URL = "jdbc:sqlite:student.db"; //常量：数据库的访问路径

    try{
        // 加载驱动
        Class.forName(JDBC_DRIVER);
        // 连接数据库
        conn = DriverManager.getConnection(JDBC_URL);
        System.out.println("连接数据库成功");
    }catch(Exception e){
        System.out.println("数据库连接失败，异常信息：" + e.getMessage());
    }
    }
       /*
    断开数据库连接
     */
     private void close(){
         try{
             conn.close();

         }catch (Exception e){
             System.out.println("断开数据库连接失败，异常信息："+ e.getMessage());
         }
     }
     /*
     执行增删改类的sql，返回成功/失败
     */
     private boolean execute(String sql){
         try{
             Statement statement = conn.createStatement();
             statement.execute(sql); // 执行sql
             int count = statement.getUpdateCount(); // 获取影响了多少条数据
             statement.close();
             System.out.println("执行sql语句："+ sql+","+ count + "条记录被更新");
             return count >= 1; // 执行成功时，至少1条记录被更新

         } catch (SQLException e) {
             System.out.println("执行sql语句异常，异常信息："+ e.getMessage());
         }
         return false;
     }
     private List<Student> executeQuery(String sql){
         List<Student> students = new ArrayList<>();
         try{
             Statement statement = conn.createStatement();
             boolean b = statement.execute(sql);
             if (b){
                 ResultSet rs = statement.getResultSet();
                 if (rs != null){
                     while(rs.next()){
                         String id = rs.getString("id");
                         String name = rs.getString("name");
                         String age = rs.getString("age");
                         String gender = rs.getString("gender");
                         String classes = rs.getString("classes");
                         String phone = rs.getString("phone");
                         // String id, String name, String age, String gender, String phone, String classes
                         Student stu = new Student(id, name, age, gender, classes, phone);
                         students.add(stu);
                     }
                 }
             }
             System.out.println("执行sql语句："+ sql+"共查询到数据："+ students.size());
             statement.close();
         } catch (SQLException e) {
             e.printStackTrace();
             System.out.println("执行sql语句异常，异常信息："+ e.getMessage());
         }
             return students;
     }
     /*
     初始化数据
      */

     public static void initTable(){
         SqliteDb db = new SqliteDb();
         db.connect();
         db.execute("create table if not exists student(\n" +
                 "id varchar(32) primary key,\n" +
                 "name varchar(10),\n" +
                 "classes varchar(10),\n" +
                 "age varchar(5),\n" +
                 "gender varchar(2),\n" +
                 "phone varchar(15)\n" +
                 ");");
         db.close();

     }
     /*
     添加学生
     好处：1、调用简单 2、屏蔽了sql/数据库，如果后续数据库变更为Mysql，只需要修改这一个文件
      */
     public static boolean addStudent(Student student){
         String id = student.getId();
         String name = student.getName();
         String gender  = student.getGender();
         String phone = student.getPhone();
         String age = student.getAge();
         String classes = student.getClasses();
         SqliteDb db = new SqliteDb();
         db.connect();
         boolean d = db.execute("insert into student (id, name, classes, age, gender, phone)"+
                 "values('" +id + "','"+name+"','"+classes +"','"+age+"','"+gender+"','"+phone+"');");
        db.close();
        return d;
     }
     /*
     删除学生
      */

     public static  boolean deleteStudent(String name){
         SqliteDb db = new SqliteDb();
         db.connect();
         boolean b = db.execute("delete from student where name = '"+name+"';");
         db.close();
         return  b;
     }
     /*
     查询学生
      */
     public static  List<Student> queryStudent(){
         SqliteDb db =  new SqliteDb();
         db.connect();
         List<Student> students = db.executeQuery("select * from student;");
         db.close();
         return students;

     }
     /*
     根据名字模糊查询
      */
     public static List<Student> queryStudent(String name){
         SqliteDb db = new SqliteDb();
         db.connect();
         List<Student> students = db.executeQuery("select * from student where name like '%" + name + "%';");

         db.close();
         return students;

     }
    // 测试代码：用完可以删掉
     public static  void main (String[] args){
         initTable();
         //添加学生
         Student stu = new Student("1003","abc","女" ,"19","十","123123");
        Student stu1 = new Student("1004","aaa2","女" ,"20","十","123126");
         addStudent(stu);
         addStudent(stu1);
         queryStudent();
         queryStudent("aa1");
        deleteStudent("aa2");
         System.out.println(queryStudent().toString());





     }
    /*
 List转二维数组
  */
    public static String[][] list2Arrays(List<Student> students) {
        String[][] res = null;
        if (students.size() > 0) {
            // 数组初始化时，需要给定长度
            res = new String[students.size()][6];
            for (int j = 0;j < students.size();j++){
                Student stu = students.get(j);

                res[j][0] = stu.getId();
                res[j][1] = stu.getName();
                res[j][2] = stu.getAge();
                res[j][3] = stu.getGender();
                res[j][4] = stu.getClasses();
                res[j][5] = stu.getPhone();



            }
        }
        return res;
    }



    // 测试代码：用完可以删掉
//    public static void main(String[] args) {
//        SqliteDb db = new SqliteDb();
//        db.connect();
//        db.execute("create table if not exists student(\n" +
//                "id varchar(32) primary key,\n" +
//                "name varchar(10),\n" +
//                "classes varchar(10),\n" +
//                "age varchar(5),\n" +
//                "gender varchar(2),\n" +
//                "phone varchar(15)\n" +
//                ");");
//        boolean b = db.execute("insert into student values ('001','tom','1','11','男','13838383838')");
//        boolean d = db.execute("insert into student values('002','tom','2','12','女','17712345678')");
//        List<Student> ss = db.executeQuery("select * from student; ");
//        for (Student s:ss){
//            System.out.println(s.getName());
//        }
//    }

}
