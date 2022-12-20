package ch02.ex01;

public class C02Output {
	public static void main(String[] args) {
		int score = 100;
		System.out.println(100); // 100이라는 값이 저장된 공간이 constent이다.
		System.out.println(score);
		System.out.println(100 + 1);// expression
		System.out.println(Math.random()); // method/ random은 0.0 이상 1.0미만의 값을 나타낸다.
		
		System.out.print(200);
		System.out.print(300);
		System.out.print('\n'); //char 스타일이다. ''싱글쿼터이면 char, ""더블쿼터이면 string
		System.out.print(400);//  \n은 줄바꿈의 뜻이 아니다, 엔터키의 역할.
		System.out.println();
		
		System.out.printf("%b %c %d %f %s\n", true, 'a', 10, 1.15, "hello"); //boolean을 뜻해 %b
		// 과제: 위 출력문에서 구분자로 '/' 를 사용하라.
		System.out.printf("%b/%c/%d/%f/%s\n", true, 'a', 10, 1.15, "hello");
	
		System.out.printf("%5b|%-5c|%5d|%5.2f|%5s\n", true, 'a', 10, 1.156, "hello");
	
		String name = "최한석";
		int age = 22;
		System.out.printf("%s %d", name, age);
		System.out.printf("\n%s은 %d살입니다.", name, age);
		System.out.println();
		System.out.println(name + "은" + age + "살입니다."); //snippet 코드 조각.
	} 
}