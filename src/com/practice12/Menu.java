package com.practice12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    Menu() {

        setBounds(300, 100, 300, 200);

        JTextArea area = new JTextArea();

        Planet[] planet = new Planet[] {
                Planet.MERCURY,
                Planet.VENUS,
                Planet.EARTH,
                Planet.MARS,
                Planet.JUPITER,
                Planet.SATURN,
                Planet.URANUS,
                Planet.NEPTUNE
        };
        JComboBox planets = new JComboBox(planet);

        JButton button = new JButton("Рассчитать");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int i = planets.getSelectedIndex();
               float dr = planet[i].getRadius();
               float mass = 0;
               try {

                   mass = Float.valueOf(area.getText());

               } catch (NumberFormatException ex) {

                   JOptionPane.showMessageDialog(null, "Данные введены некорректно");
                   return;

               }

               double f = 9.816243509 * mass * planet[i].getMass() / (dr * dr);
               JOptionPane.showMessageDialog(null, "Сила притяжения равна " + String.format("%.4f", f));


            }
        });
        JPanel panel = new JPanel(new FlowLayout());

        panel.add(area);
        panel.add(planets);
        panel.add(button);
        setContentPane(panel);
        setVisible(true);
    }

}
