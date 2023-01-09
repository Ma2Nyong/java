package ch07.ex06.case05;

public class Cabinet<T extends A> {
	public T getLastVal(T[] arr) {
		return arr[arr.length - 1];
	} // extends 말고 super를 쓰면 이상 이 된다.
	// Cabinet Genaral type 을 A 이하로 설정한것이다.
	
	public <S extends C> S getFinalVal(S[] arr){
		return arr[arr.length -1];
	}
	// Cabinet Genaral type 을 C 이하로 설정한것이다.
}
