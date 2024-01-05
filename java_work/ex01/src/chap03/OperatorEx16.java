package chap03;
class OperatorEx16 { 
	public static void main(String[] args) { 
		float pi = 3.141592f; 
		float shortPi = (int)(pi * 1000) / 1000f; 

		System.out.println(shortPi); 
		
		double a = 2.123123d;
		// double*int
		System.out.println(a*100);
		// 형변환
		System.out.println((int)(a*100));
		// int/double
		System.out.println((int)(a*100)/100d);
	} 
} 
