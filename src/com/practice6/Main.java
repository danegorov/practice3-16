package com.practice6;

import com.practice5.MovablePoint;

public class Main {
    public static void main(String[] args){
        MovablePoint a = new MovablePoint(12, 2, 23, 34);
        MovablePoint b = new MovablePoint(133, 45, 23, 34);
        MovableRectangle rectangle = new MovableRectangle(a, b);
        System.out.println(rectangle);

    }
}
