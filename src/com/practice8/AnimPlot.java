package com.practice8;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.util.ArrayList;

public class AnimPlot extends JFrame {
    AnimPlot(Image image) {
        setSize(3100, 3000);
        ImComponent com = new ImComponent();
        com.addImage(image);
        add(com);
        setVisible(true);
    }


}
