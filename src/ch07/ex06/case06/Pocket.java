package ch07.ex06.case06;

import java.util.List;

public class Pocket {
	{
		int i = 1 + 2;
		double d = 1.0 + 2.0;
		//new Number(1) + new Number(2);
	}
	
	// unbounded wildcard 제한이 없는 와일드카드
	public void printList(List<?> list) {
		System.out.println(list);
	} // list를 design할때 generic type을 쓰고 있다.
	
	// upper bounded wildcard 상한선을 정한다.
	public double add(List<? extends Number> list) {
		double sum = 0;
		for(Number n: list) sum += n.doubleValue();
		
		return sum;
	}
}
