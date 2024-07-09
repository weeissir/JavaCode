package com.weei.d4_inner_class4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        //拓展：搞清楚匿名内部类在开发中的真实使用场景
        //GUI编程
        //1、创建窗口
        JFrame win = new JFrame("登陆界面");
        JPanel panel  = new JPanel();
        win.add(panel);

        JButton btn = new JButton("登录");
        win.add(btn);

        //给按钮绑定单击事件监听器 （监听器对象是一个接口类型，一种方法调用实现类，另一种方法直接将匿名内部类传给方法）
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(win, "登陆一下");
            }
        });
        //匿名内部类的核心目的：简化代码

        win.setSize(400, 400);//窗口大小
        win.setLocationRelativeTo(null);//居中
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //关闭窗口退出程序
        win.setVisible(true);

    }
}
