package sec11.exam01_final;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-123456", "계백");
		Person p2 = new Person("555556-123456", "계해");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		
		//p1.nation = "usa";    final의 객체를 바꾸려고 하기때문에 컴파일 오류가난다.
		//p1.ssn = "654321-7654321";
		p1.name = "을지문덕";
	}

}
