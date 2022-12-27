package ch05.home.ex01.case04;

import java.time.LocalDate;
import java.util.Scanner;

import ch05.ex01.case03.User;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user = new User();
		String input = "";
		boolean isGood = false;
		
		do {
			do {
				isGood = false;
				System.out.print("이름: "); input = sc.nextLine();
				isGood = input.matches(" ");
				if(!isGood) System.out.print("ERROR] text only\n");
				else user.setUserName(input);
			} while(isGood);
			
			do {
				isGood = false;
				System.out.print("나이: "); input = sc.nextLine();
				isGood = input.matches("[0-9]+");
				if(isGood) user.setAge(Integer.parseInt(input));
				else System.out.print("ERROR] number only\n");
			} while(!isGood);
			
			LocalDate signupDate = LocalDate.now();
			
			System.out.printf("이름: %s\n나이: %d\n가입일: %s ",user.getUserName(), user.getAge(), signupDate);
			
		}while(!isGood);
		
	}
}
/*가입일: %d
과제: 사용자를 생성하라.
user가 user의 이름, 나이를 입력한다.
app이 user의 가입일을 입력한다. 
--

이름: gambit
나이: 25

이름: gambit
나이: 25
가입일: 2022-12-27
*/