package org.example;

import java.util.ArrayList;
import java.util.List;

class AA{
    @Override
    public String toString() {
        return "AA{}";
    }
}

class BB extends AA {
    public void BB() {

    }
    @Override
    public String toString() {
        return "BB{}";
    }
}

class CC extends AA {
    public void CC() {

    }
    @Override
    public String toString() {
        return "CC{}";
    }
}


public class Main4 {
    public static void main(String[] args) {
        List<AA> list = new ArrayList<>();
        list.add(new BB());
        list.add(new CC());

        // 안쓴다 외우지마라 그냥 이런 식으로 코드를 짠 사람이 있더라.
        if(list.get(0) instanceof BB) {
            BB b1 = (BB) list.get(0);
            b1.BB();
        }

        if(list.get(0) instanceof CC) {
            CC c1 = (CC) list.get(0);
            c1.CC();
        }
    }
}
