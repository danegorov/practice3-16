package com.practice11.punkt2;

import javax.swing.*;
import java.awt.*;
import java.awt.color.*;
public class DialogBtn extends JButton {
    JPanel dialogStyle; //label
    DialogBtn() {
        super();
        dialogStyle = new JPanel();
    }
    DialogBtn(String name) {
        super(name);
        dialogStyle = new JPanel();
    }
    public void setDialogStyle(JLabel input) {
       // System.out.println(input);
        JLabel inp = input;
        dialogStyle.add(inp);
        System.out.println(dialogStyle.getComponent(0));
    }

    public JPanel getDialogStyle() {
        return dialogStyle;
    }

}
