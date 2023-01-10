package ch09.ex03;

public class Player extends Thread {
	private Counter counter;
	//상상해라... 카운터 하나가 있고 버튼 3개가 있다 플레이어가 서로 누르려고 다투는걸..
	public Player(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			counter.increase();
			counter.decrease();
			
			if(i % 10 == 0) counter.print(); //10단위로 출력한다.
			
			try {
				Thread.sleep((int)(Math.random() * 2));
			} catch(InterruptedException e) {}
		}
	}
}
