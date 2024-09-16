package org.example.task1.clock;

public class clock implements Readable {
    private int hours;
    private int min;
    private int sec;

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public void tick() {
        this.sec += 1;
    }

    @Override
    public void readTime() {
        System.out.println(this.hours + ":" + this.min + ":" + this.sec);
    }
}
