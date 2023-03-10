package ch04.ex01;

public class C03If {
	public static void main(String[] args) {
		int hour = 13;
		
		if(hour < 12) {
			System.out.println("Good Morning.");
		} else if (hour < 18) {
			System.out.println("Good Afternoon.");
		} else if (hour < 21) {
			System.out.println("Good evening.");
		} else {
			System.out.println("Good night.");
		} // if는 베타적이라 하나만 사용된다.
		// 계산하는 순서는 위에서부터 아래로 내려온다.
		// 과제: ~println() 을 한번만 사용하라. code 7 ~ 15 Line을 개선해라.
		
		String bow = "";
		if(hour < 12) bow = "Good Morning.";
		else if(hour < 18) bow = "Good Afternoon.";
		else if(hour < 21) bow = "Good Evening.";
		else bow = "Good night.";
		System.out.println(bow);
	}
}
