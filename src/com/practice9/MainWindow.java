package com.practice9;

import com.practice8.Plot;
import com.practice8.RandomArrayFactory;
import com.practice8.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainWindow extends JFrame {
    MainWindow() {
        setSize(800, 500);
        JButton button = new JButton("push");
        int bHeidht = button.getHeight();
        int bWidht  = button.getWidth();
        button.setBounds(250 - bHeidht,400 - bWidht, bWidht, bHeidht);
        getContentPane().add(button);
        setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Runnable newWindow = () -> {
                    Plot plot = new Plot(20);
                    plot.setVisible(true);
                };

                Thread thread = new Thread(newWindow);
                thread.start();

            }
        });
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        /*for (Shape el : shapes){
            el.draw(g);
        }*/

    }
}
