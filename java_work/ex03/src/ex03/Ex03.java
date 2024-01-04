package ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
//		String a = "abcd";
//		System.out.println(a.toUpperCase());
		
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(int i = 0 ; i < a.length() ; i++) {
        	char b;
        	if(Character.isUpperCase(a.charAt(i))) {
        		b = Character.toLowerCase(a.charAt(i));
        	} else {
        		b = Character.toUpperCase(a.charAt(i));
        	}
        	System.out.print(b);
        }
	}
}
