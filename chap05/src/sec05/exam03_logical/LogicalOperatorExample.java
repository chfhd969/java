package sec05.exam03_logical;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A';
		
		if( (charCode>=65) & (charCode<=90) ) { //�� �ڸ� ��� ��
			System.out.println("�빮�� �̱���");
		}

		if( (charCode>=97) && (charCode<=122) ) { //���� true �̸� �׳� ���
			System.out.println("�ҹ��� �̱���");
		}

		if( (charCode>=48) && !(charCode<=57) ) {
			System.out.println("0~9 ���� �̱���");
		}

		
		int value = 6;
		
		if( (value%2==0) | (value%3==0)) {
			System.out.println("2 �Ǵ� 3�� ��� �̱���");
		}
	
		if( (value%2==0) || (value%3==0)) {
			System.out.println("2 �Ǵ� 3�� ��� �̱���");
		}

	}

}