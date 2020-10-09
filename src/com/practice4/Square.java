package com.practice4;

public class Square extends Rectangle {
    Square(){
        super();
    }
    Square(double side){
        super(side, side);
    }
    Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return this.length;
    }
    public void setSide(double side){
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
                ", filled=" + filled +
                ", perimeter=" + getPerimeter() +
                ", area=" + getArea() +
                '}';
    }

}
