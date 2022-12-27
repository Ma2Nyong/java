package ch05.ex01.case03;

public class User {
	private String userName;
	private int age;// private = 나만 볼꺼야, 감춘다
	
	public void setUserName(String userName) { //메소드 선언문 보이고, 메소드 바디는 투명,
		this.userName = userName;
	}//this는 객체이고 유저타입의객체가 들어간다.
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getUserName() { //ppt 제작할때 쓴다..
		return this.userName;
	}
	
	public int getAge() {
		return this.age;
	} // 멤버 변수에 접근한다, 접근
}//this 변수의 타입은 유저 이다.
//return 값이 없기에 void,// 동사인 set + parameter.
// 리턴타입 메소드네임 
//transparency