package ch08.ex01;

@Universal
@Type(name="class", value=1)
public class MyClass { // 기본 attribute name은 value 여서 value는 생략가능.
	@Field(1) @Universal
	private String myName;
	
	@Constructor
	public MyClass() {}
	
	@Method
	public void play(@Param String userName, @Param int age) {
		@Local int i = 0;
	}
}
