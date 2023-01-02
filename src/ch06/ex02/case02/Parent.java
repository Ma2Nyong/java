package ch06.ex02.case02;

public class Parent {
	private String regNum;
	private String parentName;
	private int money;
	
	private String getRegNum() {
		return regNum;
	}
	
	public String getParentName() {
		return parentName;
	}
	
	protected int getMoney() {
		return money;
	}
	
	void addMoney(int money) {
		this.money += money;
		//this.money = money;
	} // setMoney를 쓰지않고 addMoney를 쓰는이유는 재산이 + 되도록 만드려고.
}
