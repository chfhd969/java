package sec02.exam03_abstract_method;

public interface RemoteControl {

	//���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ�
	void turnOn();            //���� �޼ҵ� ó�� {} ���� ���� ����  
	void turnOff();
	void setVolume(int volume);
}
