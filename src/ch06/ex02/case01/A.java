package ch06.ex02.case01;

public class A {
	private int a; //객체 내에서만 보인다.
	int b; //패키지가 똑같은 객체들에게만 보인다.
	protected int c; // 같은 패키지를 가진 개체들에게만 보인다. 다른패키지에 있더라도 자식이면 보인다.
	public int d; //모드에게 보인다.
	
	private void m1() {}
	void m2() {}
	protected void m3() {} // 자식객체에도 보인다.
	public void m4() {}
}
//접근 제한자.