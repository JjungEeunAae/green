package org.example.cloneTest;

public class cloneTest {

    public static void main(String[] args) {
        Point org = new Point(10, 20);

        Point clo = null;   // 복사

        try {
            // Point 의 clone은 throws로 인해 try-catch는 무조건 있어야 함.
            // 형변환을 하지 않으면 에러가 난다.
            clo = (Point) org.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(org);
        System.out.println(clo);

        org.setXpos(20);
        System.out.println(org);
        System.out.println(clo);

    }
}
