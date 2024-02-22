package org.example;

public class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 0 ; i <= 10 ; i++) {
            if(name.equals("athread")) {
                System.out.println("athred = " + i);
            } else {
                System.out.println("이름이 다른 쓰레드 = " + i);
            }
        }
    }

    public static void main(String[] args) {
        MyThread mt = new MyThread("athread");
        mt.start();

        MyThread mt2 = new MyThread("bthread");
        mt2.start();
    }
}
