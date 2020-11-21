package com.practice11.punkt2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Listener implements MouseListener {

    @Override
    public void mouseEntered(MouseEvent e) {
        DialogBtn button = (DialogBtn) e.getSource();
        int ds=0;
        switch (button.getText()) {
            case "CENTER":

                JOptionPane.showMessageDialog(null, button.getDialogStyle(), "Добро пожаловать в ЦАО", JOptionPane.PLAIN_MESSAGE);
                //System.out.println(button.getDialogStyle().getComponent(0));
                break;
            case "WEST":
                JOptionPane.showMessageDialog(null, button.getDialogStyle(), "Добро пожаловать в ЗАО", JOptionPane.PLAIN_MESSAGE);
                //System.out.println(button.getDialogStyle().getComponent(0));
                break;
            case "EAST":
                JOptionPane.showMessageDialog(null, button.getDialogStyle(), "Добро пожаловать в СВАО", JOptionPane.PLAIN_MESSAGE);
                //System.out.println(23);
                break;
            case "SOUTH":
                JOptionPane.showMessageDialog(null, button.getDialogStyle(), "Добро пожаловать ЮЗАО", JOptionPane.PLAIN_MESSAGE);
                //System.out.println(23);
                break;
            case "NORTH":
                JOptionPane.showMessageDialog(null, button.getDialogStyle(), "Добро пожаловать в СЗАО", JOptionPane.PLAIN_MESSAGE);
                //System.out.println(23);
                break;

        }

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }
}
