package ch04.ex02;

public class C01Swich {
	public static void main(String[] args) {
		int grade = 2;
		String coupon = "";
		
		switch(grade) {
		case 1 -> coupon = "5만원";
		case 2 -> coupon = "1만원";
		default -> coupon = "1천원";
		}
		
		System.out.println(coupon);
	}
}