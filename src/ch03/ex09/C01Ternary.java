package ch03.ex09;

public class C01Ternary {
	public static void main(String[] args) {
		int x = 1;
		int y = -1;
		
		int absX = (x >= 0) ? x : -x;
		int absY = (y >= 0) ? y : -y;
		
		System.out.println(absY + "," + absY);
	}
}// 절댓값을 표시하는 알고리즘.
