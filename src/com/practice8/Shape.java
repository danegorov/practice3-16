package com.practice8;

import java.awt.*;

public abstract class Shape {
   protected Color color;
   protected boolean filled;
   protected double x, y;
    public Shape(){
        color = null;
        filled = false;
        x = y = 0;
    }
    public Shape(Color color, boolean filled, double x, double y) {
        this.color = color;
        this.filled = filled;
        this.x = x;
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPosition(double x ,double y) {
        this.x = x;
        this.y = y;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public double[] getPosition() {
        return new double[]{x, y};
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
    public abstract void draw(Graphics gr);
}
