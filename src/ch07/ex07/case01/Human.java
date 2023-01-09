package ch07.ex07.case01;

@FunctionalInterface
public interface Human {
	void say();
	//void tell();
} // function 에서는 하나의 데이터만 입력할 수 있다
// say 도 data가 된다.
//람다식