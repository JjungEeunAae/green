package org.example;

class ParenAdder {
    public void add(int num1, int num2) {
        System.out.println("합 : " + (num1 + num2));
    }
}

class ChildAdder extends ParenAdder {
    @Override   // 부모 클래스에 있는 메서드를 재정의한다.
    public void add(int ddfsf, int sdfsdfsdf) {
        System.out.println("덧셈을 진행합니다.");
        super.add(ddfsf, sdfsdfsdf);
    }
}

public class Main2 {
    public static void main(String[] args) {
        ChildAdder ca = new ChildAdder();
        ca.add(10,20);
    }
}
