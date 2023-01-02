package ch06.ex02.case02.sub;

import ch06.ex02.case02.Parent;

public class Child extends Parent {
	public void play() {
		//this.getRegNum();
		this.getParentName();
		this.getMoney();
		//this.addMoney(1000); default 값이라 자식이 부모에게 돈을 줄 수 없다.
	}
}
