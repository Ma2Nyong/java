package ch06.ex06.case05;

import java.time.LocalDate;

public interface Electronic {
	public static final int VOLTAGE = 200; // 코드네임 = 코드벨류
	static final String MAKER_NAME = "LG";
	final int WEIGHT = 10;
	LocalDate PRODUCED_DATE = LocalDate.now();
	
	public abstract void displayMsg();
	abstract int getTemperature();
	String getModelName();
}
// public static final 은 기본적으로 들어가있는 , 안써도 자동으로 추가된다.
// public abstract 도 마찬가지이다.