package org.example.lombokTest;

public class Main4 {
    public static void main(String[] args) {
        Car c = new Car("k3");
        System.out.println(c);

        System.out.println();

        c.setName("마! 뭔찬데!");
        System.out.println(c.getName());
    }
}
