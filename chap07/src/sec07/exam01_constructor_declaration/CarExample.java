package sec07.exam01_constructor_declaration;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("검정", 3000); /* 생성자에 아무것도 쓰지않았다면 자동으로 생성되지만 현재는 Car라는 생성자에 변수 선언을 해줬기 때문에
										 Class에 아래 처럼 파라매터 값을 주지 않았을 경우 에러를 내보낸다*/
		//Car myCar = new Car(); (x)
	}

}
