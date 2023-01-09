package ch07.ex05.case06;

import java.util.HashSet;
import java.util.Set;

public class MySet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
		System.out.println(set);
	}
}
//set은 중복된 값이 없다. key가 없다, value로 객체를 구분하기때문에 중복이 없다.
