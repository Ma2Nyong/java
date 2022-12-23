package ch03.ex07;

public class C02StrCompare {
	public static void main(String[] args) {
		boolean b = false;
		
		String s = "a";
		b = s == "a";
		
		s = new String("a");
		System.out.println(s);
		b = s == "a";
		
		b = s.equals("a"); // 두 데이터의 논리적인 값으로 true 와 false로 구분한다.
		
		System.out.println(b);
	}
}
