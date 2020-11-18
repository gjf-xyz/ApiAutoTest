package studentManage.view;
/*
主页面
1. 按钮: 增删改查
2.学生表格（全部学生信息）
 */

import studentManage.model.Student;
import studentManage.utils.SqliteDb;

import javax.print.DocFlavor;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

// JFrame顶层容器，任何组件必须放在顶层容器内。
public class MainView extends JFrame {
    JTextField searchText;
    public static  JTable jTable;

    /*
    构造方法中绘制页面
     */
    public MainView() {
        //将Panel放到Frame中
        this.add(northPanal(), BorderLayout.NORTH);
        this.add(centerPanel(), BorderLayout.CENTER);

        setTitle("学生管理"); //标题
        setBounds(200, 100, 600, 300); //位置和大小
        setVisible(true); //设置窗口可见。

    }

    /*
    北边的Panel,存放增删改查的按钮
     */
    private JPanel northPanal() {
        JPanel north = new JPanel();
        //1行5列，GridLayout是网格布局管理器
        GridLayout grid = new GridLayout(1, 5);//设置Panel的布局管理器
        north.setLayout(grid); //设置Panel的布局管理器

        JButton jButtonAdd = new JButton("添加");
        jButtonAdd.addActionListener(new AddAction());
        north.add(jButtonAdd);

        JButton jButtonModify = new JButton("修改");
        jButtonModify.addActionListener(new MoidifyAction());
        north.add(jButtonModify);

        JButton jButtonDelete = new JButton("删除");
        jButtonDelete.addActionListener(new DeleteAction());
        north.add(jButtonDelete);
        //组件 JTextField 单行文本输入框
        searchText = new JTextField(); //查找的输入框
        north.add(searchText);

        JButton jButtonFind = new JButton("查找");
        jButtonFind.addActionListener(new FindAction()); //按钮得监听事件
        north.add(jButtonFind);
        return north;


    }
    /*
    中间的Panel，存放学生的表格
     */

    private JPanel centerPanel() {
        JPanel center = new JPanel();

        GridLayout g1 = new GridLayout(1, 1);
        center.setLayout(g1);

        jTable = new JTable(); // 创建一个表格
        DefaultTableCellRenderer cr = new DefaultTableCellRenderer();
        cr.setHorizontalAlignment(JLabel.CENTER); //设置单元格里面的数据居中对齐
        // 默认的单元格渲染器
        jTable.setDefaultRenderer(Object.class, cr);
        // 初始化表格
        initTable(jTable, SqliteDb.queryStudent());
        // enter.add(jTable); //直接把table加到panel上，不显示表头
        // 滚动条（水平、垂直的滚动条）
        JScrollPane jScrollPane = new JScrollPane(jTable);
        center.add(jScrollPane);


        return center;
    }


    /*
    初始化表格
    */
    //java.util.List java.awt.List 冲突
    public static void initTable(JTable jTable, java.util.List<Student> student) {
        String[][] res = SqliteDb.list2Arrays(student);
        String[] columns = {"编号", "姓名", "性别", "年龄", "班级", "电话"};
        // 表的数据模型，通过一个Vector存放数据
        TableModel tableModel = jTable.getModel();
        ((DefaultTableModel) (jTable.getModel())).setDataVector(res, columns);
        jTable.setRowHeight(30); //设置表格高度


    }

    private void queryByName() {
        searchText.getText(); //
    }

    /*
    点击查找按钮，实现的功能。
     */
    private class FindAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String param = searchText.getText();  //获取文本框的输入
            java.util.List<Student> students = new ArrayList<>(); // 定义一个列表接受查询的结果
            if (param == null || param.equals("")) {
                students = SqliteDb.queryStudent(); //查询所有数据
            } else {
                students = SqliteDb.queryStudent(param); //根据名字查询数据库
            }
            initTable(jTable, students);

            System.out.println("查找");

        }
    }

    private static class AddAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new AddView();



            System.out.println("添加");


        }
    }

    private static class MoidifyAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("修改");

        }
    }

    private static class DeleteAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("删除");

        }
    }


}
