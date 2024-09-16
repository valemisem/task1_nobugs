package org.example.task1.car;

public class Main {
    public static void main(String[] args) {
        car car_1 = new car();
        car_1.setBrand("BMW");
        car_1.setModel("Black");
        car_1.setYear(2020);
        car_1.setPosition(0);
        car_1.start();
        car_1.stop();
        car_1.drive(500);
    }
}
