package sec07.exam03_field_polymorphism;

public class KumhoTire extends Tire{
	//�ʵ�
	//������
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//�޼ҵ�
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "KumhokTire  ���� :" + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		}else {
			System.out.println("*** " + location + "KumhoTire ��ũ ***");
			return false;
		}
	}
}