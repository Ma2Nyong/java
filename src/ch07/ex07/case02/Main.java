package ch07.ex07.case02;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("Human say.");
		human.say();
		//human.walk(); static이기에 사용안됨.
		Human.walk(); // static이면 이렇게 사용.
		human.sleep();
		
		human = new Student();
		human.say();
		human.sleep();
	}
}
