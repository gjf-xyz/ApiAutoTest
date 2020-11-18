package studentManage.view;
/*
添加页面
1.属性（Label、TextField）
2. 确定、取消
 */

import studentManage.model.Student;
import studentManage.utils.SqliteDb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.UUID;

public class AddView extends JFrame {
    JTextField nameField;
    JTextField ageField;
    JTextField genderField;
    JTextField classesField;
    JTextField phoneField;


    public AddView() {

        this.add(northPanel(), BorderLayout.NORTH);
        this.add(southPanel(), BorderLayout.SOUTH);
        setTitle("添加学生");
        setBounds(650, 300, 500, 300);
        setVisible(true);

    }

    private JPanel northPanel() {
        JPanel jPanel = new JPanel();
        GridLayout grid = new GridLayout(5, 2);
        jPanel.setLayout(grid);


        JLabel nameLabel = new JLabel("姓名");
        jPanel.add(nameLabel);
        nameField = new JTextField();
        jPanel.add(nameField);

        JLabel ageLabel = new JLabel("年龄");
        jPanel.add(ageLabel);
        ageField = new JTextField();
        jPanel.add(ageField);

        JLabel classesLabel = new JLabel("班级");
        jPanel.add(classesLabel);
        classesField = new JTextField();
        jPanel.add(classesField);

        JLabel genderLabel = new JLabel("性别");
        jPanel.add(genderLabel);
        genderField = new JTextField();
        jPanel.add(genderField);


        JLabel phoneLabel = new JLabel("电话");
        jPanel.add(phoneLabel);
        phoneField = new JTextField();
        jPanel.add(phoneField);


        return jPanel;
    }

    private JPanel southPanel() {
        JPanel jPanel = new JPanel();
        JButton ok = new JButton("确定");
        ok.addActionListener(new OkAction());
        jPanel.add(ok);

        JButton cancel = new JButton("取消");
        cancel.addActionListener(new CancelAction());
        jPanel.add(cancel);
        return jPanel;


    }


    private class OkAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //UUID Universally Unique Identifier
            // 标准的UUID格式为: xxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxx(8-4-4-4-12)
            // 其中每个x 是0-9 或 a-f 范围内的一个十六进制数字
            String id = UUID.randomUUID().toString().replaceAll("-", "");
            String name = nameField.getText(); // 获取界面输入框的输入
            String age = ageField.getText();
            String classes = classesField.getText();
            String gender = genderField.getText();
            String phone = phoneField.getText();
            Student stu = new Student(id, name, gender, age, classes, phone); // 构造学生对象
            boolean isSuccess = SqliteDb.addStudent(stu); //将学生信息写入数据库
            if (isSuccess) {
                JOptionPane.showMessageDialog(null, "添加成功");
                dispose(); // 关闭对话框
                // 刷新表格
                // MainView 中修改为: public static JTable jTable;
                MainView.initTable(MainView.jTable, SqliteDb.queryStudent());
            }
        }
    }
    private class Mode  implements  ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class CancelAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }

    }
}
