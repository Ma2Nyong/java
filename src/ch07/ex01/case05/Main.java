package ch07.ex01.case05;

public class Main {
	public static void main(String[] args) {
		Car car = new FireEngine();
		car.run();
		// car.water(); 소방차가 도로를 달리때는 물을 뿌리지 않는다.
		
		FireEngine fireEngine = (FireEngine)car;
		fireEngine.water();
		fireEngine.run();
		
		((Car)fireEngine).run();
	}
}
