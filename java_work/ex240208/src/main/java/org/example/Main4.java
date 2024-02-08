package org.example;

interface Calculate<T> {
    void cal(T a, T b);
}

public class Main4 {
    public static void main(String[] args) {
        Calculate<Integer> cal = (a, b) -> System.out.println(a+b);
        cal.cal(10,20);

        Calculate<Double> cal_double = (a, b) -> System.out.println(a+b);
        cal_double.cal(10.6, 23d);

        Calculate<String> cal_string = (a, b) -> System.out.println(a + " " + b);
        cal_string.cal("나는", "우주의 먼지보다 못하다!");
    }
}
