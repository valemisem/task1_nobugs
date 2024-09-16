package org.example.task1.car;

public class car implements Drivable {
    private String brand;
    private String model;
    private int year;
    private double position;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPosition(double position) {
        this.position = position;
    }

    @Override
    public void start() {
        System.out.println("START from " + this.position);
    }

    @Override
    public void stop() {
        System.out.println("STOP at " + this.position);
    }

    @Override
    public void drive(int distance) {
        System.out.println("DRIVE to " + distance);
    }
}
