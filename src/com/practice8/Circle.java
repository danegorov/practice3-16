package com.practice8;

import java.awt.*;

public class Circle extends Shape {
    protected double radius;
    public Circle(double radius, double x, double y){
        super();
        this.radius = radius;

    }
    public Circle(Color color, boolean filled, double x, double y, double radius){
        super(color, filled, x, y);
        this.radius = radius;

    }

    public Circle(){
        super();
        this.radius = 0;

    }
    public void setRadius(double radius) {
        this.radius = radius;
         }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", len=" + getPerimeter() +
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
        int radius = (int) Math.round(this.radius);
        gr.drawOval(x, y, radius, radius);
        if (filled) gr.fillOval(x, y, radius, radius);
    }
}
