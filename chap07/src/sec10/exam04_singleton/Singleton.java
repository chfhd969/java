package sec10.exam04_singleton;

public class Singleton {
	//��ü�� �ϳ� �ۿ� �������� ���� private �ܺο��� ���ٱ��� public �ܺο��� ���ٰ���
	private static Singleton Singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return Singleton;
	}
}
