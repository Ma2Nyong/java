package ch07.ex07.case04;

public class Main {
	public static void main(String[] args) {
		Shooter shooter = new Shooter();
		Smith smith = new Smith();
		
		shooter.fire(() -> System.out.println("탕탕."));
		shooter.fire(smith.makeGun());
		
	}
}
// data를 mathod로 넘기고 parameter로 넘기는 방법.