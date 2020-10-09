package com.practice6;
import com.practice4.Rectangle;
import com.practice5.Movable;
import com.practice5.MovablePoint;

public class MovableRectangle implements Movable {
    Rectangle rectangle;
    MovablePoint topLeft, bottomRight;
    MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) throws IllegalStateException {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        if (!areHaveEqualSpeed()) {
            throw new IllegalStateException("ERROR: control points have not equal speed!!!");
        }
        int weight = Math.abs(topLeft.getY() - bottomRight.getY());
        int lenght = Math.abs(topLeft.getX() - bottomRight.getX());
        rectangle = new Rectangle(weight, lenght);

    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "rectangle=" + rectangle +
                ",\n                 topLeft=" + topLeft +
                ",\n                 bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
    public boolean areHaveEqualSpeed() {
        return topLeft.getxSpeed() == bottomRight.getxSpeed() && topLeft.getySpeed() == bottomRight.getySpeed();
    }
}
