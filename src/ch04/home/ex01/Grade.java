package ch04.home.ex01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		
		System.out.print("점수: ");
		score = sc.nextInt();
		
		if(score >= 90) {
			String grade = "";
			if(score >= 98) grade = "A+";
			else if(score >= 94) grade = "A";
			else grade = "A-";
			System.out.println(grade);
		}
		else if (score >= 80) {
			String grade = "";
			if(score >= 88) grade = "B+";
			else if(score >= 84) grade = "B";
			else grade = "B-";
			System.out.println(grade);
		}
		else { System.out.println("C");}
	}
}
/*
과제: 다음 구간별로 학점을 부여하라.
98 이상 A+
94 이상 A
90 이상 A-
88 이상 B+
84 이상 B
80 이상 B-
80 미만 C
--

점수: 100
A+
*/