package sec05.exam01_arithmetic;

public class InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf( userInput );   /*.valueOf() 괄호안의 값을 .앞의 변수로 변환*/
		
		double currentBalance = 10000.0;
		
		if (Double.isNaN(val)) {    /*()안의 변수가 NaN이면 true 아니면 false출력*/
			System.out.println("NaN이 입력되어 처리할 수 없음");  /*val은 NaN기때문에 true 출력 */
			val = 0.0;
		}
		
		currentBalance += val;
		System.out.println(currentBalance);

	}

}
