package com.practice4;

public class Rectangle extends Shape {
    protected double width, length;
    Rectangle(){
        super();
    }
   public Rectangle(double width, double length){
        this.length = length;
        this.width = width;

    }
    Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
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
                ", filled=" + filled +
                ", perimeter=" + getPerimeter() +
                ", area=" + getArea() +
                '}';
    }
}
