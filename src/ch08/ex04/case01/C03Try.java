package ch08.ex04.case01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C03Try {
	public static void main(String[] args) {
		PrintWriter out = null; // 출력장치로 파일을 쓸 수 있다.
		int[] arr = {1, 2, 3};
		
		try {
			out = new PrintWriter(new FileWriter("c:/DEV/a.txt"));
			for(int i: arr) out.println("arr[" + i + "]: " + arr[i]);
		} catch(ArrayIndexOutOfBoundsException e) {
			out.println("array error.");
		} catch(IOException e) {
			System.out.println("IO error.");
		} finally { // 꼭 실행하고 싶은 명령문을 적는다.
			if(out != null) out.close(); // out.close - close는 out을 없앤다.
		}
		
		System.out.println("end.");
	}
}
