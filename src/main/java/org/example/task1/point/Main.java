package org.example.task1.point;

public class Main {
    public static void main(String[] args) {
        point point1 = new point();
        point1.setX(0.0);
        point1.setY(2.5);

        point1.moveUp(5.0);
        point1.moveRight(3.0);

        System.out.println("x = " + point1.getX() + ", y = " + point1.getY());
    }
}
