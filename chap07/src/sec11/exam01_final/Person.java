package sec11.exam01_final;

public class Person {
	//static은  바꿀수 없다 final은 바꿀수 없지만 객체마다 설정할 수 있다.
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
