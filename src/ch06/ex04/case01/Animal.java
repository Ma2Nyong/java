package ch06.ex04.case01;

public class Animal {
	private String animalName;
	
	//public Animal() {}
	
	public Animal(String animalName) {
		this.animalName = animalName;
	} // 멤버가 아니기에 상속하지 않는다.
	
	public String getAnimalName() {
		return this.animalName;
	}
}
