package ch05.home.ex01.case04;

import java.time.LocalDate;

public class User { 
	private String userName;
	private int age;
	private LocalDate signupDate;
	
	public void setUserName(String userName) { 
		this.userName = userName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void signupDate(LocalDate signupDate) { 
		this.signupDate = signupDate;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public LocalDate signupDate() {
		return this.signupDate;
	}
	
}
