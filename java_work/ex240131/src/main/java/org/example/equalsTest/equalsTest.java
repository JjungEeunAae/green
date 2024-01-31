package org.example.equalsTest;

public class equalsTest {
    public static void main(String[] args) {
        INum num1 = new INum(10);
        INum num2 = new INum(10);
        INum num3 = new INum(13);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        System.out.println(num1 == num2);
        System.out.println(num1.equals(num2));
    }
}
