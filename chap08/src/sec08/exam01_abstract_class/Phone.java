package sec08.exam01_abstract_class;

public abstract class Phone {
	//abstract 가 붙으면 객체를 못만드는 class가됨
	//필드
	public String owner;
	
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}

}
