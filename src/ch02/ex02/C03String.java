package ch02.ex02;

public class C03String {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		System.out.printf("sum: %d\n", sum);
		
		String sumStr = "" + sum;
		System.out.println(sumStr);
		
		String s = a + b + ""; //숫자 3이 아닌 문자3이 출력된다.
		System.out.println(s);
		
		s = "" + a + b; // "1" + b / "1,2" 문자 1,2 가 출력된다.
		System.out.println(s);
		
		
		String dialog = "John said, \"hello\".";
		System.out.println(dialog);
	}
}
