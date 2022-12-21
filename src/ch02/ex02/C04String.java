package ch02.ex02;

public class C04String {
	public static void main(String[] args) {
		String s = "|" + " a happy ".trim() + "|";// 머리부분과 꼬리부분의 스페이스를 제거하는 법. .trim()
		s = s.concat(" dog");//주어에 목적어를 붙히는 목적.
		s = s.substring(2); //지정한 문자 이하의 문서를 잘라낸다.
		System.out.println(s);
		
		s = "hello";
		System.out.printf("%c\n", s.charAt(1)); // 지정한 숫자의 문서를 뜯어낸다.
		
		int i = "apple".codePointAt(0); // 지정한 숫자의 문서의 유니코드값을 표시한다.
		i = "a".hashCode(); // 유니코드의 값.
		i = "b".hashCode();
		i = "b".compareTo("a"); // 유니코드의 값끼리을 뺀다.
		i = "a".compareTo("b");
		i = "A".compareTo("a");
		i = "A".compareToIgnoreCase("a");
		i = s.indexOf("l"); //첫번째 l의 index를 알려준다.
		i = s.lastIndexOf("l");//마지막 l의 index를 알려준다.
		i = s.length(); // 문자의 길이, 즉 개수를 알려준다.
		System.out.println(i); 
		
		s = "develop";
		boolean b = s.startsWith("de"); // 
		b = s.endsWith("lop");
		b = s.equals("develop");
		b = s.equals("Develop");
		b = s.equalsIgnoreCase("Develop");
		b = "".isEmpty(); // empty의 값
		b = s.matches("[a-zA-Z]*");
		b = s.matches("[0-9]*");
		
		
		System.out.println(b);
	}
}
