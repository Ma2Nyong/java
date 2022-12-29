package ch05.home.ex05.case04;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Men men = new Men();
		LocalDate birthDay = LocalDate.of(2025,6,7);
		
		men.setMenName("최한석");
		men.setAge(33);
		men.setBirthDay(birthDay);
		
		men.sitDown();
		men.introDuction();
		men.foodWait();
		men.singIng();
		men.eat();
		men.run();
	}
}
/*
남자 객체만로 class로 디자인하라.
--

식당에서 한 남자가 다가와 앉습니다.
남자가 자기 소개를 합니다.
이름은 최한석, 나이는 33살, 생일은 2025-6-7 입니다.

남자는 음식을 기다리는 동안, 노래를 부릅니다.
음식이 나오자 맛있게 먹습니다.
다 먹더니, 계산 안 하고, 달려 나갑니다.
*/