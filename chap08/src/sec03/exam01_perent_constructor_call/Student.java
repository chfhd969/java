package sec03.exam01_perent_constructor_call;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn); //부모의 생성자 부분 호출
		this.studentNo = studentNo;
	}
}
