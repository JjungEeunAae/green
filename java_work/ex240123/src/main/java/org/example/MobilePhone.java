package org.example;

public class MobilePhone {
    protected String number;

    public MobilePhone() {};

    public MobilePhone(String number) {
        this.number = number;
    }

    public void answer() {
        System.out.println("대답하다. 번호는 " + number);
    }
}

