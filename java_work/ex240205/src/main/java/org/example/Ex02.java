package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        List<Car> car = Arrays.asList(new Car(1000),
                                    new Car(1800),
                                    new Car(1200),
                                    new Car(3000));
        Collections.sort(car,
                        new Comparator<Car>() {
                            @Override
                            public int compare(Car o1, Car o2) {
                                return ((Car)o1).getDisp() - ((Car)o2).getDisp();
                            }
                        }
        );
        System.out.println(car);
    }
}
