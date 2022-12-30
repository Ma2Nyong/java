package ch05.ex05.case10;

public class Main {
	public static void main(String[] args) {
		Pajamas pajamas = new Pajamas();
		Man man = new Man();
		
		man.strip();
		man.wash();
		man.wear(pajamas);
		man.lie();
		
		man.strip();
		man.wash();
		man.wear(pajamas);
		man.lie();
		
		man.sleep(pajamas);
		man.sleep(pajamas);//다 못적은거같은데..흠
	}
}
//member method 가 member method call 하는것.