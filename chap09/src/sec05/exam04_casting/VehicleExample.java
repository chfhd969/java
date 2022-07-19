package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run();
		
		/*vehicle.checkFare(); 형변환 안되어 있어서 사용불가*/
		
		Bus bus = (Bus) vehicle; //강제 타입 변환  vehicle --> Bus
		bus.run();
		bus.checkFare();
	}

}
