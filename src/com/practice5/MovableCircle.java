package com.practice5;

public class MovableCircle implements Movable {
    int radius;
    MovablePoint center;
    MovableCircle(int x, int y, int xSpeed, int ySeed, int radius){
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySeed);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
    public void moveUp(){
        center.moveUp();
    }
    public void moveDown(){
        center.moveDown();
    }
    public void moveLeft(){
        center.moveLeft();
    }
    public void moveRight(){
        center.moveRight();
    }

}
