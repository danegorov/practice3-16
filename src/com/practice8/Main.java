package com.practice8;
import javax.swing.*;

public class Main
{
    public static void main (String [] args) {
        JFrame win1 = new JFrame("JFrame");
        win1.setSize(400, 300);
        win1.setLocation(10,10);

        win1.setVisible(true);
        JOptionPane.showMessageDialog(win1,"Привет","Нажато",
                JOptionPane.WARNING_MESSAGE);
    }
}