package sec03.exam02_noname_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			//익명 구현 객체
			public void turnOn() {}
			public void turnOff() {}
			public void setVolume(int volume) {}
		};

	}

}
