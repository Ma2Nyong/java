package ch04.ex02;

public class C02Switch {
	public static void main(String[] args) {
		String grade = "silver";
		String coupon = "";
		
		switch(grade) {
		case "gold" -> coupon = "5만원"; // arrow 옆에 실행문이 들어가있다.
		case "silver" -> coupon = "5만원";
		default -> coupon = "1천원";
		}
		
		switch(grade) {
		case "gold", "silver" -> coupon = "5만원";
		default -> coupon = "1천원";
		} // 코드 중복을 해결.
		// 기준값의 수를 정확하게 입력해야 한다. int 면 숫자 string이면 문자.
		System.out.println(coupon);
	}
}
