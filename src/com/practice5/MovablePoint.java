package com.practice5;

public class MovablePoint implements Movable{
   protected int x;
   protected int y;
   protected int xSpeed;
   protected int ySpeed;
   public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void moveUp(){
        y = y + ySpeed;
    }
    public void moveDown(){
        y = y - ySpeed;
    }
    public void moveLeft(){
        x = x - xSpeed;
    }
    public void moveRight(){
        x = x + xSpeed;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
