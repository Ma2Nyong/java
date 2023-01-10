package ch09.ex03;

public class Counter {
	private int val;
	
	public synchronized void increase() {
		val++;
	}
	
	public synchronized void decrease() {
		val--;
	}
	// synchronized << lock을 건다.
	public synchronized void print() {
		System.out.print(val + " ");
	}
}
