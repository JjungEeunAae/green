package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        AA.doB();

        AA aa = new AA();
        aa.doA();

        System.out.println(aa.getA());
    }
}