package org.example;

public class Ex06 {
    public static void Type(Scale sc) {
        switch (sc) {
            case DO:
                System.out.println("도");
                break;
        }
    }

    public static void main(String[] args) {
        Type(Scale.DO);
    }
}
