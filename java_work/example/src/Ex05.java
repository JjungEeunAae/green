import java.util.*;

public class Ex05 {
    public static void main(String[] args) {
        // 성적관리 프로그램
        /* String
            [0]["철수"] = [100,80,90]
            [1]["짱구"] = [50,60,70]
            [2]["훈이"] = [50,60,85]
            [3]["유리"] = [80,90,67]
            [4]["맹구"] = [80,80,75]
         */

        String[] student1 = {"철수","100","80","90"};
        String[] student2 = {"짱구","50","60","70"};
        String[] student3 = {"훈이","50","60","85"};
        String[] student4 = {"유리","80","90","67"};
        String[] student5 = {"맹구","80","80","75"};

        // 학생의 숫자, 국어 평균점수, 영어 평균점수, 수학 평균점수
        // 모든 점수의 평균점수와 1~3등을 구하라

        // 2차원 배열 생성
        String[][] all = {student1,student2,student3,student4,student5};
        int korean = 0;
        int math = 0;
        int english = 0;
        String[] student_name = new String[all.length];

        // 각 과목의 합 구하기
        for(int i = 0 ; i < all.length ; i++) {
            student_name[i] = all[i][0];
            korean += Integer.parseInt(all[i][1]);
            math += Integer.parseInt(all[i][2]);
            english += Integer.parseInt(all[i][3]);
        };

        System.out.println("국어 평균 : " + (korean/ all.length));
        System.out.println("수학 평균 : " + (math/ all.length));
        System.out.println("영어 평균 : " + (english/ all.length));
        System.out.println("총 평균 : " + ((korean+english+math) / (all.length*all.length)));

        int stu_total[] = new int[5];     // 학생 5명의 과목 총 점수를 확인하라
        for(int i = 0 ; i < all.length ; i++) {
            for(int j = 1 ; j < all.length-1 ; j++) {
                stu_total[i] += Integer.parseInt(all[i][j]);
            };
        };
        System.out.println(
                "모든 학생의 점수를 담았다 > " + Arrays.toString(stu_total)); // [270, 180, 195, 237, 235]

        for(int i = 0 ; i < all.length ; i++) {
            System.out.println(student_name[i] + "의 총 점수는 " + stu_total[i] + "입니다.");
        };

        // 내림차순
        // int[] 배열을 내림차순을 정렬할 때는 Integer[]로 바꿔줘야 한다.
        // Arrays.stream(<변환하려는 배열>).boxed().toArray(Integer[]::new);
        Integer[] new_arr = Arrays.stream(stu_total).boxed().toArray(Integer[]::new);
        Arrays.sort(new_arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(new_arr));
        // 1 ~ 3등 구하기
        for(int i = 0 ; i < all.length ; i++) {
            System.out.println(i+1 + "등 : " + all[i][0] + "학생. 총점 : " + new_arr[i] + "점 입니다. 축하합니다!");
            if(i == 2) {
                break;
            };
        };
    }
}
