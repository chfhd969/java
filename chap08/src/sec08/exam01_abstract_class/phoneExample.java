package sec08.exam01_abstract_class;

public class phoneExample {

	public static void main(String[] args) {
//		Phone phone = new Phone(); // Phone class�� ��ü�� �������� ���ϱ� ������ �����߻�
		SmartPhone smartPhone = new SmartPhone("ȫ�浿");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
