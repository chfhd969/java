package sec11.exam01_final;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-123456", "���");
		Person p2 = new Person("555556-123456", "����");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		
		//p1.nation = "usa";    final�� ��ü�� �ٲٷ��� �ϱ⶧���� ������ ����������.
		//p1.ssn = "654321-7654321";
		p1.name = "��������";
	}

}
