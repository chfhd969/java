package chap06.sec06.exam01_string_equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "������";
		String strVar2 = "������";
		if(strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		}else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		}
		String strVar3 = new String("������");
		String strVar4 = new String("������");
		if(strVar3 == strVar4) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		}else {
		System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}
		if(strVar1.equals(strVar2)) {
		System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		}
	}

}
