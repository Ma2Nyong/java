package ch05.ex09.case01;

import ch05.home.ex06.case02.Console;

public class Init {
	private static int s;
	private int i;
	
	static { //static 블럭의 초기화 방법.
		Init.s = 1; // static variable 을 잘 안쓴다.
		//this.i = 1; 
		Console.info("static{}");
	}
	
	{ //instance 블럭의 초기화 방법.
		this.i = 1;
		Init.s = 1; // static 변수 이기에 보통의 경우 instace 에서는 초기화 안한다.
		Console.info("instance{}");
	}
	
	{ // instance 블럭을 여러개 만들 수 있지만 의미가 없다 구별되는 게 없기에 위에 붙혀서 쓰면 된다.
		Console.info("instance{}2");
	}
	
	public Init() {
		Console.info("Init()");
	}
	
	public Init(int i) {
		Console.info("Init(int)");
	} // instance와 생성자의 차이는 생성자를 실행할지 말지를 선택할 수 있는게 차이점이다.
}
