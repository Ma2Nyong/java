package ch09.ex04;

public class Buffer {
	private Integer val;
	
	public synchronized int remove() {
		while(val == null) {
			try {
				wait();
			} catch(InterruptedException e) {}
		} // 값이 없으면 wait
		
		int val = this.val;
		this.val = null;
		
		notifyAll(); // 불특정 다수를 깨우는것.
		
		return val;
	} // 소비자가 사용할 메소드
	
	public synchronized void add(Integer val) {
		while(this.val != null) {
			try {
				wait();
			} catch(InterruptedException e) {}
			// 값이 있으면 wait
			this.val = val;
			notifyAll();
		}// 생산자가 사용할 메소드
	}
}
