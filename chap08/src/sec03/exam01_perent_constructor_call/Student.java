package sec03.exam01_perent_constructor_call;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn); //�θ��� ������ �κ� ȣ��
		this.studentNo = studentNo;
	}
}
