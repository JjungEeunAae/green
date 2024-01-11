import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int[] lottoNumbar = new int[10];

        for(int i = 0 ; i <  lottoNumbar.length ; i++) {
            lottoNumbar[i] = (int)(Math.random() * 10) + 1;

            for(int j = 0 ; j < i ; j++) {      // 중복제외
                if(lottoNumbar[i] == lottoNumbar[j]) {
                   i--;
                   break;
                };
            };
        };
        System.out.println(Arrays.toString(lottoNumbar));

        for(int i = 0 ; i < lottoNumbar.length ; i++) {
            // 오름차순
            for(int j = 0 ; j < lottoNumbar.length ; j++) {
                // 앞의 숫자보다 뒷번호가 크면?
                System.out.println();
                System.out.print("lottoNumbar[i] : 순서" + i + ", " + lottoNumbar[i] + " ");
                System.out.print("lottoNumbar[j] : 순서" + j + ", "  + lottoNumbar[j] + " ");
                System.out.println(lottoNumbar[i] < lottoNumbar[j]);
                if(lottoNumbar[i] < lottoNumbar[j]) {
                    // 작은 수를 tmp에 담기
                    int tmp = lottoNumbar[i];
                    // 작은 수를 가지고 있던 방에 큰 숫자 넣기
                    lottoNumbar[i] = lottoNumbar[j];
                    // 작은수를 뒷쪽에 배치
                    lottoNumbar[j] = tmp;
                }
            }
        };

        System.out.println(Arrays.toString(lottoNumbar));
    }
}