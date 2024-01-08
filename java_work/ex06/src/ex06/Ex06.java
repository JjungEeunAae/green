package ex06;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = "10, 20, 30, 40";
		String temp[] = a.split(", ");
		for(int i = 0 ; i < temp.length ; i++) {
			System.out.println(temp[i]);
		}
	}
}
