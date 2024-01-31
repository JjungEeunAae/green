package org.example;

import java.util.Arrays;

public class copyOfTest {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        int[] brr = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(brr));

        int[] crr = Arrays.copyOf(arr, 3);
        System.out.println(Arrays.toString(crr));

        System.out.println();

        // 주소를 참조하는 것이 아니기 때문에 brr과 crr은 그대로다.
        arr[0] = 100;
        System.out.println(Arrays.toString(brr));
        System.out.println(Arrays.toString(crr));

        System.out.println();

        int[] test = arr;
        System.out.println(Arrays.toString(test));
    }
}
