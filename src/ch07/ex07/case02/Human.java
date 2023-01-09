package ch07.ex07.case02;

@FunctionalInterface
public interface Human {
	void say();
	
	static void walk() {
		System.out.println("Human walk.");
	}
	
	default void sleep() {
		System.out.println("Human sleep.");
	}
}//interface에서 body가 있는 method는 static 과 default가 있다.
