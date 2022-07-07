package sec03.exam03_accuracy;

public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
//		double num3 = num2; float의 범위를 벗어났기때문에 -4라는 grabage값이나온다 그럼으로 범위가큰 double을 써줘야 제대로된 값 0이 나온다.
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
		
	}

}
