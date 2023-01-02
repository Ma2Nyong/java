package ch05.ex07.case01;

public class Main {
	public static void main(String[] args) {
		int a = 0;
		Stack.first(); // vm이 호출하는, stack에 쌓여가는 순서는 main > first > second
	}
}
