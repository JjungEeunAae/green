import java.util.Arrays;

public class Ex03 {

    public static void main(String[] args) {
        int a[] = {10,20,30};
        int b[] = {40,50,60,70};

        // score[0]의 길이는 3입니다.
        // score[1]의 길이는 4입니다.
        // = int[][] score = {{10,20,30},{40,50,60,70}};

        int[] c = {90,80,100};
        int[][] score = {a,b};

        System.out.println(score.length);
        System.out.println("score[0] : " + score[0].length);
        System.out.println("score[1] : " + score[1].length);

        score[1] = c;   // 배열의 복사가 아닌 b 배열이 c 배열로 바뀌는 것
        System.out.println("NEW score[1] : " + score[1].length);

        c[0] = 50;  // 90이였던 값이 50으로 바뀜(덮어쓰기)

        System.out.println(Arrays.toString(score[1]));
    }
}
