package ch06.ex06.case01;

public abstract class Appliance {
	public void on() {}
	public abstract void off();
}
// abstract 는 객체를 생성하지 않을꺼라는거다.
// 추상명사, 부모의 역할, ks표준의 역할.
//추상 메소드를 두면 추상 클래스를 추가해야한다.
// 추상 메소드를 주는 이유는 off의 알고리즘을 모를때에 사용한다.