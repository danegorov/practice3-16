package com.practice8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.jar.JarEntry;

public class Main {
    public static void main(String[] args) {
        try {
            Plot plot = new Plot(20);
            plot.setVisible(true);


            //AnimPlot plt = new AnimPlot(ImageIO.read(new File("src/com/practice8/ball.png")));

        } catch (IOException e) {
        }

    }
}
