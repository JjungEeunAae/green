package question;

public class Main {
	public static void main(String[] args) {
		Accumulator accumulator = new Accumulator();
		for(int i = 0 ; i < 10 ; i++) {
			accumulator.add(i);			// 인자로 전달되는 값을 모두 누적
		};
		accumulator.showResult();	// 최종 누적 결과를 출력
	};
};

class Accumulator {
	int sum;
	
	public void add(int num) {
		sum += num;
	};
	
	public void showResult() {
		System.out.println(sum);
	};
}

