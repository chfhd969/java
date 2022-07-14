package sec04.exam02_super;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flymode = NORMAL;
	
	
	@Override
	public void fly() {
		if(flymode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");		
		}else {
			//Airplane 객체의 fly()메소드 호출
			super.fly();
		}
	
	}
	
}
