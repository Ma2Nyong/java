package ch05.home.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	private static boolean isGood;
	private static String tmp;
	private static int num;
	
	

	static {
		sc = new Scanner(System.in);
		isGood = false;
		tmp = "";
		num = 0;
	}// static member 변수를 초기화 하는법..
		
	private static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}//객체 내부에서 나만쓸꺼야.
	
	public static String inStr(String msg) {
		do {
			Console.inMsg(msg);
			tmp = sc.nextLine().trim();
			isGood = tmp.matches("[a-zA-Z가-힣]+");
			if(!isGood) Console.err(msg + "문자가 아닙니다.");
		}while(!isGood);
		return tmp;
	}
	
	public  static int inNum(String msg) {
		do {
			Console.inMsg(msg);
			tmp = sc.nextLine();
			isGood = tmp.matches("[0-9]+");
			if(!isGood) num = Integer.parseInt(tmp);
			else Console.err(msg + "숫자가 아닙니다.");
		}while(isGood);
		return num;
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void err(String msg) {
		System.out.println("ERROR]" + msg);
	}
}
