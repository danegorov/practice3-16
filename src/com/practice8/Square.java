package com.practice8;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(Random ran) {
        super(ran);
        width = length = ran.nextInt(50);
    }

    public Square(Color color, boolean filled, double x, double y, double side) {
        super(color, filled, x, y, side, side);
    }

    public double getSide() {
        return this.length;
    }

    public void setSide(double side) {
        this.width = this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = this.length = side;
    }

    public void setLength(double side) {
        this.width = this.length = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", position=" + '{' + x + ", " + y + '}' +
                ", filled=" + filled +
                ", perimeter=" + getPerimeter() +
                ", area=" + getArea() +
                '}';
    }

    public void draw(Graphics gr) {
        gr.setColor(color);
        int x = (int) Math.round(this.x);
        int y = (int) Math.round(this.y);
        int width = (int) Math.round(this.width);
        gr.drawRect(x, y, width, width);
        if (filled) gr.fillRect(x, y, width, width);
    }

}
