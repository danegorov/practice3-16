package com.practice4;

import java.awt.*;

public class Main {
    public static void main(String[] args){
        Circle circle = new Circle(2);
        System.out.println(circle.toString());
        circle.setRadius(8);
        circle.setFilled(true);
        circle.setColor("Green");
        System.out.println("\n" + circle.toString() + "\n\n");
        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println(rectangle.toString());
        rectangle.setLength(2);
        rectangle.setWidth(4);
        System.out.println("\n" + rectangle.toString() + "\n\n");
        Square square = new Square(2);
        System.out.println(square.toString());
        square.setSide(43);
        System.out.println("\n" + square.toString() + "\n\n");
    }
}
