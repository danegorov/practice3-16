package com.practice5;

public class Main {
    public static void main(String[] args){
        int x = 23;
        int y = 6;
        int xSpeed = 23;
        int ySpeed = 2;
        int radius = 44;
        MovableCircle circle = new MovableCircle(x, y, xSpeed, ySpeed, radius);
        System.out.println(circle.toString());
    }
}
