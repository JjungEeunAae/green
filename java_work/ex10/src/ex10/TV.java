package ex10;
/*	접근제어자
 * 	public, default, protected, private
 */

public class TV {
	//속성(변수)과 기능(메서드)으로 이루어져있다.
	
	// 속성(변수)
	public String  color;		// 색상(초기값:null)
	public boolean power;		// 전원상태(초기값:false)
	public int     channel;	// 채널(초기값:0)
	
	// 기능(메서드)
	public void power() {
		System.out.println("power 버튼 누름");
		power = !power;
	};
	
	public void channelUp() {
		System.out.println("채널을 위로 올립니다.");
		channel++;
	};
	
	public void channelDown() {
		System.out.println("채널을 아래로 내립니다.");
		channel--;
		
		if(channel < 0) {
			System.err.println("error");
			channel = 0;
		}
	};
}
