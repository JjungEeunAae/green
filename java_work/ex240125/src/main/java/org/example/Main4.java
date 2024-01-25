package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main4 {

    public void doA() {
        try {
            int[] arr = new int[10];
            arr[11] = 10;

            Scanner sc = new Scanner(System.in);

            System.out.print("1/2숫자입력 >> ");
            int a = sc.nextInt();
            System.out.print("2/2숫자입력 >> ");
            int b = sc.nextInt();

            System.out.println("a/b = " + (a / b));
        } catch (ArithmeticException ae) {
            System.err.println("0으로 나눌 수 없습니다. " +  ae.getMessage());;
        }  catch (InputMismatchException input) {
            System.err.println("문자 입력이 불가합니다. " +  input.getMessage());;
        } catch (Throwable t) {
            System.err.println(t.getMessage());;
        } finally {
            // 정상실행이 됐든 예외발생이 발생했든 무조건 실행되는 구간
            System.out.println("Good Bye!");
        }
    }

    public static void main(String[] args) {
        Main4 ma = new Main4();

        ma.doA();
    }
}
