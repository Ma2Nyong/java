package ch05.ex01.case02;

public class Main {
	public static void main(String[] args) {
		String userName = "최한석"; // 코드 데이터가 두개가 생성된다.
		int age = 35;
		
		User user = new User(); // 코드 데이터가 하나로 인식된다.
		user.userName = "최한석";
		user.age = 35;
	}
}
