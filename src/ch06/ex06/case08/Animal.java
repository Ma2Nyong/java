package ch06.ex06.case08;

public interface Animal {
	void move();
	
	default void eat() { }
}
//알고리즘을 알고있으면 default를 사용한다.
//default 를 사용함으로서 추상메소드가 아니라는것을 선언한다.