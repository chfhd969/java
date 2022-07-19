package sec02.exam03_abstract_method;

public interface RemoteControl {

	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();            //이전 메소드 처럼 {} 실행 블럭이 없다  
	void turnOff();
	void setVolume(int volume);
}
