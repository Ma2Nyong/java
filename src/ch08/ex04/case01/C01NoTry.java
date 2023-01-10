package ch08.ex04.case01;

public class C01NoTry {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int result = arr[10]; // bug로 인해 실행되지않는다.
		System.out.println("끝.");
	}
}
