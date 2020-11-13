package com.practice11;

import com.practice8.Plot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    MainWindow() {

        setSize(800, 500);
        JButton button = new JButton("push");
        int bHeidht = button.getHeight();
        int bWidht  = button.getWidth();
        button.setBounds(250 - bHeidht,400 - bWidht, bWidht, bHeidht);
        getContentPane().add(button);
        final JTextField input = new JTextField("input");
        input.setColumns(20);
        input.setLocation(200, 200);
        getContentPane().add(input);
        System.out.println(getMousePosition());
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               System.out.println(input.getColumns());

            }
        });


    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
    }
}
