package org.example.task1.point;

public class point implements Movable {
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    @Override
    public void moveUp(double shiftY) {
        this.y += shiftY;
    }

    @Override
    public void moveRight(double shiftX) {
        this.x += shiftX;
    }

}
