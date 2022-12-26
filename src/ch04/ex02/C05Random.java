package ch04.ex02;

public class C05Random {
	public static void main(String[] args) {
		int a = (int)(Math.random() * 10) +1; //double type 이기에 0.0 이상 10.0 미만.
		System.out.println(a);
	}
}
