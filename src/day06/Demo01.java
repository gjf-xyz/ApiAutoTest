package day06;
/*
文件读写
File类; 文件/目录的增删查
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        //创建File对象，构造方法带参数，输入String类型，表示文件/目录的路径
        // 可以是相对路径，也可以是绝对路径
        //相对路径是相对工程的路径
        File path = new File("D:\\learnjava\\scr\\day06");
        File file = new File("src/day06/test.txt");

        System.out.println(path.isDirectory()); //判断是不是目录
        System.out.println(file.isDirectory());

        System.out.println(path.isFile()); //是否文件
        System.out.println(path.isAbsolute()); // 是否绝对路径

        if (path.isDirectory()) { //如果是目录
            File[] files = path.listFiles(); //获取目录下所有文件，返回文件的数组
            String[] fileStrs = path.list(); //获取目录下所有文件，返回字符串数组

            //遍历数组
            for (File f : files) {
                System.out.println(f.getName());
            }
            for (String s : fileStrs) {

                System.out.println(s);

            }
            try {

                System.out.println(file.getCanonicalFile());
                file = new File("test.txt");
                boolean isOK = file.createNewFile(); //创建文件
                System.out.println("创建文件: " + isOK); //不存在这个文件，能创建成功，返回true.如果之前有这个文件，创建失败，返回flase
                boolean del = file.delete();
                System.out.println("删除文件: " + del);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("=================分割线===================");
        List<File> allFiles = getAllFiles("D:\\learnjava");
        for (File f : allFiles) {
            System.out.println(f.getCanonicalFile());
        }

    }

    // 定义一个方法，输入一个目录，获取目录下所有的java文件，包含目录下的文件
    public static List<File> getAllFiles(String path) {
        List<File> allFiles = new ArrayList<>(); // 定义一个列表，接收最后的结果
        File file = new File(path);
        if (file.isDirectory()) { //
            String[] files = file.list(); // 获取目录下的子目录或文件
            for (String s : files) { // 遍历每个子目录/文件
                System.out.println("调试信息： " + s); //
                s = path + "\\" + s;
                //addAll 是 List 中定义的一个方法
                // getAllFiles 返回一个list，将 list加入到allFiles这个list中去
                allFiles.addAll(getAllFiles(s));  // 递归判断子目录/文件
            }
        } else {// 否则是文件
          int i = path.lastIndexOf('.'); //最后一个点的索引
            // equaIsIgnoreCase 比较字符串，不区分大小写。
            // substring 取子串，一个参数时，表示开始的索引，取开始索引直到字符串结束
            if (path.substring(i + 1).equalsIgnoreCase("java")){ // 获取文件额后缀，如果是java文件
                allFiles.add(file);
            }

        }
        return allFiles;
    }

}
