//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int[] lottoNumbar = new int[10];

        // 입력하는 for
        // 1번째까지 비교해라
        // 0번에서 현재번호까지 비교하면서 같은게 있으면 counter 증가해라
        // 똑같은게 없을때까지 해라
        int counter = 0;
        for(int i = 0 ; i <  lottoNumbar.length ; i++) {
            lottoNumbar[i] = (int)(Math.random() * 50) + 1;

            for(int j = 0 ; j < i ; j++) {
                if(lottoNumbar[i] == lottoNumbar[j]) {
                    counter++;
                };
            };
            System.out.println("counter : " + counter);
        };
    
        // 출력하는 for문
        for(int i = 0 ; i < lottoNumbar.length ; i++) {
            System.out.print(lottoNumbar[i] + " ");
        };

        System.out.println("dd");
    }
}