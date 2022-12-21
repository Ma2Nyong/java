package ch02.ex03;

public class C01IntDouble {
	public static void main(String[] args) {
		int i = 1;
		double d = 0.0;
		
		d = i;
		System.out.printf("%f, %d\n", d, i);
		
		d = (double)i; // d 변수에서 
		System.out.printf("%f, %d\n", d, i);
		
		//i = d;
		i = (int)d;
		System.out.printf("%f, %d", d, i);
	}
}
