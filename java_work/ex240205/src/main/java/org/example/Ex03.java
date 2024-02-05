package org.example;

import java.util.*;

class MyComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o2.getDisp() - o1.getDisp();
    }
}

public class Ex03 {
    public static void main(String[] args) {
        List<Car> list = Arrays.asList(new Car(2000), new Car(1400), new Car(4000));
        list = new ArrayList<>(list);

        Collections.sort(list, new MyComparator());
        System.out.println(list);
    }
}
