package com.practice3;

public class Circle {
    double radius, len, S;
    Circle(){
        radius = len = S = 0;
    }
    Circle(float radius){
        this.radius = radius;
        len = 2 * Math.PI * radius;
        S = Math.PI * radius * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        len = 2 * Math.PI * radius;
        S = Math.PI * radius * radius;
    }

    public double getLen() {
        return len;
    }

    public double getRadius() {
        return radius;
    }

    public double getS() {
        return S;
    }
}
