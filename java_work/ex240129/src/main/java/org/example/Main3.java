package org.example;

class Dbox<L,R> {
    private L l;
    private R r;

    public Dbox(L l, R r) {
        this.l = l;
        this.r = r;
    }

    @Override
    public String toString() {
        return "Dbox{" +
                "l=" + l +
                ", r=" + r +
                '}';
    }
}

public class Main3 {
    public static void main(String[] args) {
        Dbox<String, Integer> dbox = new Dbox<>("더블박스",10);

        System.out.println(dbox);
    }
}
