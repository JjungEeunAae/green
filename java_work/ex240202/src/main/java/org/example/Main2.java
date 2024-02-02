package org.example;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Car {
    private String color;
    private String model;

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, model);
    }

    @Override
    public boolean equals(Object obj) {
        return this.color.equals( ((Car) obj).color ) && this.model.equals( ((Car) obj).model );
    }

    @Override
    public String toString() {
        return "(color='" + color + '\'' +
                ", model='" + model + '\'' + ')';
    }
}

public class Main2 {
    public static void main(String[] args) {
        Set<Car> set = new HashSet<>();

        set.add(new Car("빨강", "K3"));
        set.add(new Car("흰색", "K5"));
        set.add(new Car("빨강", "K3"));

        System.out.println(set);
    }
}
