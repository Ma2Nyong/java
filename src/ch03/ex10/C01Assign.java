package ch03.ex10;

public class C01Assign {
	public static void main(String[] args) {
		int i = 3;
		
		i = i + 2;
		i += 2;
		i -= 2;
		i *= 2;
		i /= 2;
		i %= 2;
		
		System.out.println(i);
	}
}
//할당 연산자 계산순서는 오른쪽에서 왼쪽이다.