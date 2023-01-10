package ch09.ex02;

public class Main {
	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread().getName() + ": start");
		
		Thread counter = new Thread(new Counter());
		counter.start();
		
		int tries = 1;
		while(counter.isAlive()) { // 내가 sleep할꺼니까 너는 일을해?
			if(tries <= 2) { // 양보할꺼야 두번정도만? 뭔소리야 시발..
				counter.join(1000); 
				System.out.println(Thread.currentThread().getName() + ": wait" + tries++);
			} else {
				System.out.println(Thread.currentThread().getName() + ": irritated.");
				counter.interrupt();
				counter.join();
			}
		} 
		
		System.out.println(Thread.currentThread().getName() + ": end");
	}
}
