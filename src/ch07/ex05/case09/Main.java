package ch07.ex05.case09;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		String msg = "";
		if(c instanceof C) msg += "C ";
		if(c instanceof B) msg += "B ";
		if(c instanceof A) msg += "A ";
		if(c instanceof Object) msg += "Object";
		System.out.println(msg);
		
		B b = new B();
		msg = "";
		if(b instanceof C) msg += "C ";
		if(b instanceof B) msg += "B ";
		if(b instanceof A) msg += "A ";
		if(b instanceof Object) msg += "Object";
		System.out.println(msg);
		
//		if(b instanceof F) compile error / C가 B에 속해있기이 가지고 있을 가능성이 있어서.
//		if(c instanceof F) 왼쪽에 있는 객체가 가질 가능성이 있는 것들만 가능하다. 
		
		F f = new F();
		msg = "";
//		if(f instanceof C)
		if(f instanceof A) msg += "A "; // A의 타입이 interface 이기에 가능성이 있다.
		System.out.println(msg);
	}
}
//parameter가 어떤 값을 가지고 있는지 알아보는 방법.