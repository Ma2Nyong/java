package ch05.ex07.case02;

import ch05.home.ex06.case02.Console;

public class Main {
	public static void main(String[] args) {
		Console.info("main() start.");
		
		int a = 0;
		Stack.first(); // vm이 호출하는, stack에 쌓여가는 순서는 main > first > second
		
		Console.info("main() stop.");
	}
}
