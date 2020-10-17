package com.practice8;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main (String [] args) {
        Plot myplot = new Plot();
        myplot.setSize(1920, 1000);
        myplot.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] colors = {"Red", "Green", "Blue"};
        Random ran = new Random();
        int[] ints = new int[3];
        int sum = 20;
        double x, y;
        for(int i = 0; i < 3; i++){
            if (sum == 0) break;
            ints[i] = ran.nextInt(sum) + 1;
            sum = sum - ints[i];
        }
        Shape[][] arr = {new Circle[ints[0]],
                         new Rectangle[ints[1]],
                         new Square[ints[2]]};
        for(int i = 0; i < arr[0].length; i++){
            Color color = new Color(ran.nextInt(256), ran.nextInt(256), ran.nextInt(256));
            boolean filled = ran.nextBoolean();
            x = ran.nextDouble() * 600;
            y = ran.nextDouble() * 1024;
            double radius = ran.nextDouble() * 200;
            arr[0][i] = new Circle(color, filled, x, y, radius);
            Graphics grap = new Graphics() {
            }
            myplot.draw(arr[0][i], new Graphics());
        }


        myplot.setVisible(true);
    }
}