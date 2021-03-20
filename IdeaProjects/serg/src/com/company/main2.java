package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class main2 extends JApplet {
    JTextField txt = new JTextField(15);
    public main2() {}
    public void init() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JLabel lbl = new JLabel("Первый аплет");
        c.add(lbl);
        JButton btn = new JButton("Нажать один раз");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txt.setText("Привет");
            }
        });
        c.add(btn);
        c.add(txt);
    } }
