package ch05.ex08.case03;

public class Citrus {
	private String citrusName;
	
	public Citrus() {
		//this.citrusName = "레드향"; // 나쁜코드, 중복된다.
		this("레드향");
	}
	
	public Citrus(String citrusName) {
		this.citrusName = citrusName;
	} // 무엇을 해야하는지 알때, 귤을 따기 전 무엇을 따야되는지 알때 사용한다.
	
	public void setCitrusName(String citrusName) {
		this.citrusName = citrusName;
	}
}
