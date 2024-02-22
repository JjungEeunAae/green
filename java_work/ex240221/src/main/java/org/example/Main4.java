package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main4 {
    public static void main(String[] args) {
        Runnable run1 = () -> {
            for(int i = 0 ; i < 3 ; i++) {
                System.out.println(Thread.currentThread().getName() + " :: A Thread");
            }
        };

        Runnable run2 = () -> {
            for(int i = 0 ; i < 3 ; i++) {
                System.out.println(Thread.currentThread().getName() + " :: B Thread");
            }
        };

        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(run1);
        es.submit(run2);
        es.submit(() -> {
            for(int i = 0 ; i < 3 ; i++) {
                System.out.println(Thread.currentThread().getName() + " :: C Thread");
            }
        });

        es.shutdown();
    }
}
