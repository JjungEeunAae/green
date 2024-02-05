package org.example;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    private int disp;

    public Car(int disp) {
        this.disp = disp;
    }

    public int getDisp() {
        return disp;
    }

    @Override
    public String toString() {
        return "Car{" +
                "disp=" + disp +
                '}';
    }

    @Override
    public int compareTo(Car c) {
        return this.disp - c.disp;
    }
}
