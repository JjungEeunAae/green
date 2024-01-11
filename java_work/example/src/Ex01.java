public class Ex01 {
    public static void main(String[] args) {
        
        // 이름을 String[] 배열안에 넣고 향상된 for구문으로 출력하세요.
        String[] names = {"철수", "유리", "짱구", "맹구", "훈이"};

        for(int i = 0 ; i < names.length ; i++) {
            System.out.println(names[i]);
        };

        for(String name : names) {
            System.out.println(name);
        };
    }
}
