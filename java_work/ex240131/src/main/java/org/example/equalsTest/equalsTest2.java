package org.example.equalsTest;

public class equalsTest2 {

    public static void main(String[] args) {
        String str1 = new String("so");
        String str2 = new String("so");

        String str3 = "so";
        String str4 = "so";

        System.out.println(str1 == str2);
        System.out.println(str3 == str4);

        System.out.println();

        System.out.println(str1.equals(str2));
        System.out.println(str3.equals(str4));
    }
}
