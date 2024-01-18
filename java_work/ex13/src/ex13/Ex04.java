package ex13;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ex04 {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);	// yyyy-mm-dd hh:mm:ss.ss
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);		// yyyy-mm-dd
	}
}
