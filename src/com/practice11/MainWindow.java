package com.practice11;

import com.practice8.Plot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class MainWindow extends JFrame {
    int digit;
    int count;
    MainWindow() {
        count = 0;
        digit = new Random().nextInt(21);
        System.out.println("я загадал " + digit);
        setSize(800, 500);
        JButton button = new JButton("push");
        int bHeidht = button.getHeight();
        int bWidht  = button.getWidth();
        button.setBounds(250 - bHeidht,400 - bWidht, bWidht, bHeidht);
        //getContentPane().add(button);
        final JTextField input = new JTextField("input");
        input.setColumns(20);
        input.setLocation(200, 200);
        //getContentPane().add(input);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String msg = "Угадал, это " + input.getText();
               count++;
               try {
                   int in = Integer.parseInt(input.getText());
                   if (digit == in) {
                       JOptionPane.showMessageDialog(MainWindow.this, msg);
                       count--;
                       setVisible(false);

                   } else if (digit < in) {
                       JOptionPane.showMessageDialog(MainWindow.this, "нет, я загадал число меньше");
                   } else if (digit > in) {
                       JOptionPane.showMessageDialog(MainWindow.this, "нет, я загадал число больше");
                   }
                   if (count == 3) {
                       setVisible(false);
                       JOptionPane.showMessageDialog(MainWindow.this, "попытки кончились");
                   }
               } catch (NumberFormatException ex) {
                   JOptionPane.showMessageDialog(MainWindow.this, "Введите число корректно");

               }
            }
        });
        input.setText("Угадай число которое я загодал (от 0 до 20)");
        JPanel edition = new JPanel();
        edition.add(input);
        edition.add(button);
        setContentPane(edition);

    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
    }
}
