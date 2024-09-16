package org.example.task1.clock;

public class Main {
    public static void main(String[] args) {
        clock clock_1 = new clock();
        clock_1.setHours(0);
        clock_1.setMin(0);
        clock_1.setSec(0);

        clock_1.tick();

        clock_1.readTime();

    }
}
