package chap03;
class OperatorEx18 {
	public static void main(String args[]) { 
		double pi = 3.141592; 
		double shortPi = Math.round(pi * 1000) / 1000.0;
		/* Math 함수 활용
		 * 		.random : 랜덤 함수(0<x<1 사이에 값 랜덤으로 구함)
		 * 		.round  : 반올림함수
		 */
		System.out.println(shortPi);
	}
}
