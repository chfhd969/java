package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run();
		
		/*vehicle.checkFare(); ����ȯ �ȵǾ� �־ ���Ұ�*/
		
		Bus bus = (Bus) vehicle; //���� Ÿ�� ��ȯ  vehicle --> Bus
		bus.run();
		bus.checkFare();
	}

}
