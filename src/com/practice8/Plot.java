package com.practice8;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Plot extends JFrame  {
    ArrayList<Shape> shapes;
    Plot(int count){
        shapes = new RandomArrayFactory(count).makeArray();
        setSize(1000, 800);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (Shape el : shapes){
            el.draw(g);
        }
    }
}
