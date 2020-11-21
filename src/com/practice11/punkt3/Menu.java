package com.practice11.punkt3;

import com.practice11.punkt2.Scene;
import com.practice11.punkt2.StringConverter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu extends JFrame {
    public Menu() {
        super();
        setBounds(600, 700, 300, 300);
        String[] colors = new String[] {
                "blue",
                "red",
                "black",
        };
        String[] fonts = new String[] {
                "Times New Roman",
                "MS Sans Serif",
                "Courier New"
        };
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("Color: ");
        JLabel label2 = new JLabel("Font: ");
        JComboBox box1 = new JComboBox(colors);
        JComboBox box2 = new JComboBox(fonts);
        JButton start = new JButton("Start");
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String color = (String) box1.getSelectedItem();
                String font = (String) box2.getSelectedItem();
                box2.getSelectedIndex();
                Font[] fonts = new Font[] {
                        new Font("TimesRoman", Font.BOLD, 22),
                        new Font(Font.SANS_SERIF, Font.PLAIN, 23),
                        new Font("Courier", Font.ITALIC, 10),
                };
                Color col= new com.practice11.punkt3.StringConverter(color).getColor();
                com.practice11.punkt3.Scene scene = new com.practice11.punkt3.Scene(col, fonts[box2.getSelectedIndex()]);
            }
        });
        panel.add(label1);
        panel.add(box1);
        panel.add(label2);
        panel.add(box2);
        panel.add(start);
        setContentPane(panel);
        setVisible(true);
    }

}
