package org.example;

enum Person {
    MAN(10, "hong"), WOMAN(20, "hee");
    private int age;
    private String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("생성자");
    }

    @Override
    public String toString() {
        return "Person age = " + age + ", name = " + name;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Person.MAN);
         System.out.println(Person.WOMAN);
    }
}