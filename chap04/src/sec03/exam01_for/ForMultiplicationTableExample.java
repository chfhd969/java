package sec03.exam01_for;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		for (int m=2; m<=9; m++) {                      //��ø for�� ù���� for���� 1�� ����Ǹ� ���� for���� ������ ���� �ݺ��Ͽ� ������ �� �ٽ� ó���� for�� 1�� ����
			System.out.print("***" + m + "��***\t");
		}
		System.out.println();
		for(int m=1; m<=9; m++) {
			for (int n=2; n<=9; n++) {
				System.out.print(n + "x" + m + "=" + (n*m) + "\t\t");
			}
		
			System.out.println();
		}
		
	}		
	

}
