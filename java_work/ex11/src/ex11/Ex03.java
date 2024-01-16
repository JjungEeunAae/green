package ex11;

// 1.배열선언 2.배열정렬 3.배열의 모든값의 합
public class Ex03 {
	Ex03() {
		int arr[] = new int[] {10,20,5,2,11};
		
		ArrayU arr_fnt = new ArrayU(); 
		arr_fnt.sort(arr);
		arr_fnt.sum(arr);
		arr_fnt.print(arr);
	};
	
	public static void main(String[] args) {
		new Ex03();
	};
}
