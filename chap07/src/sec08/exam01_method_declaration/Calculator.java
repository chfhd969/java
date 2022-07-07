package sec08.exam01_method_declaration;

public class Calculator {

	//메소드   리턴값이 있을수도 있고 없을 수도있다 생성자는 리턴값이 당연히 없음 그러므로 메소드에서는 리턴값이 없으면 void를 붙여준다
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
}
