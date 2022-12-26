package ch03.ex02;

public class C02Not {
	public static void main(String[] args) {
		boolean power = false; // 전원이 꺼져있다. flag variable
		power = !power;
		System.out.println(power); //toggle
		
		power = !power;
		System.out.println(power);
	}
}
//논리 부정 연산자.