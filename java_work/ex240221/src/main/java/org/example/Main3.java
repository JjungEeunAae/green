package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main3 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newSingleThreadExecutor();

        // 쓰레드 풀에게 시킬 작업
        es.submit( () -> {
            int n1 = 10;
            int n2 = 20;
            System.out.println(Thread.currentThread().getName() + (n1 + n2));
        });

        System.out.println("main Thread 종료");

        // 쓰레드 풀과 그 안에 있는 쓰레드의 소멸
        es.shutdown();
    }
}
