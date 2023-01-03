package ch06.ex04.case01;

public class Cat extends Animal {
	private int age;
	
	public Cat(String catName, int age) {
		super(catName);// 초기화 방법.
		//this.animalName = catName;
		this.age = age;
	} // 자식클래스의 생략된 코드 중 첫번째 멘트는 super이다.
	
	public int getAge() {
		return this.age;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d", this.getAnimalName(), this.getAge());
	}
}
// subclass(자식) extends superclass(부모)