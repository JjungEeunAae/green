package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(ar);
        IntStream intStream2 = intStream.filter(n -> n % 2 == 1);
        int sum = intStream2.sum();
        System.out.println(sum);

        // 위의 코드를 한줄로 간결하게 만들 수 있다.
        System.out.println(Arrays.stream(ar).filter(n -> n % 2 == 1).sum());

        sum = Stream.of(1,2,3,4,5)
                    .filter(n -> n % 2 == 1)    // 1, 3, 5
                    // .reduce() : 연산이 되지 않으면 0을 반환해라.
                    .reduce(0, ((integer, integer2) -> integer += integer2));
                    //                     1         3            1    +     3
                    //                     4         5            4    +     5
                    //                                           ----- 합계 : 9
        System.out.println(sum);
    }
}
