package ch05.ex08.case01;

public class Baby {
	private String babyName;
	
	public Baby() {}
	
	public Baby(String babyName) {
		this.babyName = babyName;
	}// 객체생성하자마자 멤버변수값을 light한다. 직후.
	
	public void setBabyName(String babyName) {
		this.babyName = babyName;
	}// 객체생성된 뒤에 멤버변수값을 light한다. 후.
}
