package sec10.exam04_singleton;

public class Singleton {
	//객체를 하나 밖에 선언하지 못함 private 외부에서 접근금지 public 외부에서 접근가능
	private static Singleton Singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return Singleton;
	}
}
