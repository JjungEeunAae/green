package org.example;

import org.example.equalsTest.INum;

import java.util.Arrays;

public class Arrays_sortTest {
    public static void main(String[] args) {
        INum brr[] = new INum[5];
        brr[0] = new INum(30);
        brr[1] = new INum(10);
        brr[2] = new INum(50);
        brr[3] = new INum(1);
        brr[4] = new INum(5);
//        Arrays.sort(brr);       // Comparable 없으면 에러남
//        System.out.println(Arrays.toString(brr));

        Arrays.sort(brr, (o1, o2) -> (
            (INum)o2).getNum() - ((INum)o1).getNum()
        );

        System.out.println(Arrays.toString(brr));
    }
}
