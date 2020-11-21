package com.practice11.punkt3;

import com.practice11.punkt2.DialogBtn;
import com.practice11.punkt2.Listener;

import javax.swing.*;
import java.awt.*;

public class Scene extends JFrame {

    Scene(Color color, Font font) {
        setBounds(300, 300, 300, 200);
        JTextArea area = new JTextArea();
        area.setFont(font);
        area.setForeground(color);
        JPanel editon = new JPanel(new FlowLayout(FlowLayout.CENTER));
        editon.add(area);
        setContentPane(editon);
        setVisible(true);

    }
}
