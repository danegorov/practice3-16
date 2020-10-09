package com.practice4;

import com.sun.tools.javac.Main;

public class Circle extends Shape {
    protected double radius;
    Circle(double radius){
        super();
        this.radius = radius;

    }
    Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;

    }

    Circle(){
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
                ", len=" + Math.PI * 2 * radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", perimeter=" + getPerimeter() +
                ", area=" + getArea() +
                '}';
    }
}
