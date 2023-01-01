package ch05.ex06.case01;

public class Main {
	public static void main(String[] args) {
		Man.say("I love java.");// 누가 말하는지 관심없다. 메세지에만 관심이 있다.
		//	Man.tell("");
		
		Man man = new Man(); //누가 말하는지 관심이 있다.
		man.tell("I LOVE JAVA.");
		man.say("Hello.");
	}
}
