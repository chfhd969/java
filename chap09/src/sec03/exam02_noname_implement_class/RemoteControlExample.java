package sec03.exam02_noname_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			//�͸� ���� ��ü
			public void turnOn() {}
			public void turnOff() {}
			public void setVolume(int volume) {}
		};

	}

}
