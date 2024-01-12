package org.example;

import java.util.Arrays;

public class Programmers {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][] twoArr = {{0,3},{1,2},{1,4}};
        System.out.println(solution(arr, twoArr));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int[] arr1 = new int[queries.length];
        int[] arr2 = new int[queries.length];

        for(int i = 0 ; i < queries.length ; i++) {
//            arr1[i] = queries[0][i];
//            arr2[i] = queries[1][i];
            for(int j = 0 ; j < queries[i].length ; j++) {
                System.out.println(queries[i][j]);
            }
        }
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
        return answer;

    }
}