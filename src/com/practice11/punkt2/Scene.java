package com.practice11.punkt2;

import javax.swing.*;
import java.awt.*;

public class Scene extends JFrame {

    Scene(Color color, Font font) {
        setBounds(300, 300, 500, 600);
        Listener listener = new Listener();
        Container pen = getContentPane();
        JLabel label = new JLabel();
        label.setBackground(color);
        label.setFont(font);


        DialogBtn center = new DialogBtn("CENTER");
        label = new JLabel();
        label.setForeground(color);
        label.setFont(font);
        label.setText("Добро пожаловать в ЦАО");
        center.setDialogStyle(label);
        center.addMouseListener(listener);

        DialogBtn north = new DialogBtn("NORTH");
        label = new JLabel();
        label.setForeground(color);
        label.setFont(font);
        label.setText("Добро пожаловать в СЗАО");
        north.setDialogStyle(label);
        north.addMouseListener(listener);

        DialogBtn south = new DialogBtn("SOUTH");
        label = new JLabel();
        label.setForeground(color);
        label.setFont(font);
        label.setText("Добро пожаловать ЮЗАО");
        south.setDialogStyle(label);
        south.addMouseListener(listener);

        DialogBtn west = new DialogBtn("WEST");
        label = new JLabel();
        label.setForeground(color);
        label.setFont(font);
        label.setText("Добро пожаловать в ЗАО");
        west.setDialogStyle(label);
        west.addMouseListener(listener);

        DialogBtn east = new DialogBtn("EAST");
        label = new JLabel();
        label.setForeground(color);
        label.setFont(font);
        label.setText("Добро пожаловать в СВАО");
        east.setDialogStyle(label);
        east.addMouseListener(listener);



        pen.add(north, BorderLayout.NORTH);
        pen.add(south, BorderLayout.SOUTH);
        pen.add(west, BorderLayout.WEST);
        pen.add(east, BorderLayout.EAST);
        pen.add(center, BorderLayout.CENTER);
        setVisible(true);

    }
}
// почему зависит от позиции