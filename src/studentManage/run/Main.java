package studentManage.run;

import studentManage.utils.SqliteDb;
import studentManage.view.MainView;

/*
主函数，程序的入口。
 */
public class Main {
    public static void main(String[] args) {
       // 1. 创建数据库，初始化表
        SqliteDb.initTable();
       // 2. 创建主页面
        new MainView();
    }
}