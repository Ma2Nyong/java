package ch06.ex03.case03;

public class Main {
	public static void main(String[] args) {
		Duck duck = new Duck();
		Hen hen = new Hen();
		
		System.out.printf("%s \n%s", duck, hen.toString() );
	}//duck 뒤에 .toString()이 생략된 것이다.
}
