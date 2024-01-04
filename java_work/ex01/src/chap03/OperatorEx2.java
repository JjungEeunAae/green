package chap03;
class OperatorEx2 {
	public static void main(String args[]) {
		int i=5, j=0;

		j = i++;		// 후증가
		// j=i++; i=6, j=5
		System.out.println("j=i++; i=" + i +", j="+ j);

		i=5;        
		j=0;

		j = ++i;		// 선증가
		// j=++i; i=6, j=6
		System.out.println("j=++i; i=" + i +", j="+ j);
	}
}
