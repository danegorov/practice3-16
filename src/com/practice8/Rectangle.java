package com.practice8;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Rectangle extends Shape {
    protected double width, length;
    Rectangle(){
        super();
    }

    public Rectangle(Color color, boolean filled, double x, double y, double width, double length){
        super(color, filled, x, y);
        this.width = width;
        this.length = length;
    }
    public Rectangle(Random ran){
        super(ran);
        width = ran.nextInt(30);
        length = ran.nextInt(25);

    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return 2 * width + 2 * length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", position=" +'{' + x + ", " + y + '}' +
                ", filled=" + filled +
                ", perimeter=" + getPerimeter() +
                ", area=" + getArea() +
                '}';
    }
    public void draw(Graphics gr){
        gr.setColor(color);
        int x = (int) Math.round(this.x);
        int y = (int) Math.round(this.y);
        int width = (int) Math.round(this.width);
        int len = (int) Math.round(this.length);
        gr.drawRect(x, y, width, len);
        if (filled) gr.fillRect(x, y, width, len);
    }
}
