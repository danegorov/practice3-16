package practice12;

import com.practice11.punkt2.StringConverter;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {
    Menu() {

        setBounds(300, 100, 300, 200);

        JTextArea area = new JTextArea();

        Planet[] planets = new Planet[] {
                Planet.MERCURY,
                Planet.VENUS,
                Planet.EARTH,
                Planet.MARS,
                Planet.JUPITER,
                Planet.SATURN,
                Planet.URANUS,
                Planet.NEPTUNE
        };

        JComboBox planet = new JComboBox(planets);
        JPanel panel = new JPanel(new FlowLayout());

        panel.add(area);

    }

}
