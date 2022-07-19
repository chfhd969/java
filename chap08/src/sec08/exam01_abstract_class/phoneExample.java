package sec08.exam01_abstract_class;

public class phoneExample {

	public static void main(String[] args) {
//		Phone phone = new Phone(); // Phone class는 객체를 생성하지 못하기 때문에 오류발생
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
