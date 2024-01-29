package org.example;

// T는 Number 클래스를 상속받아 인스턴스 생성 시
// Number 또는 Number를 상속받는 클래스만 올 수 있음
class EBox<T extends Number> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

public class Main5 {
    public static void main(String[] args) {
        EBox<Integer> ebox = new EBox<>();
        ebox.setT(100);
        System.out.println(ebox.getT());

//        EBox<String> error = new EBox<String>();  // 오류
    }
}
