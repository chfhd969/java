package sec05.exam01_arithmetic;

public class InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf( userInput );   /*.valueOf() ��ȣ���� ���� .���� ������ ��ȯ*/
		
		double currentBalance = 10000.0;
		
		if (Double.isNaN(val)) {    /*()���� ������ NaN�̸� true �ƴϸ� false���*/
			System.out.println("NaN�� �ԷµǾ� ó���� �� ����");  /*val�� NaN�⶧���� true ��� */
			val = 0.0;
		}
		
		currentBalance += val;
		System.out.println(currentBalance);

	}

}
