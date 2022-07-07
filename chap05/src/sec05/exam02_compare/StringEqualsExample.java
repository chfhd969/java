package sec05.exam02_compare;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철"); //new String() 안에 값이 같아도 주소가 달라서 다름..
		
		System.out.println( strVar1 == strVar2);
		System.out.println( strVar1 == strVar3);
		System.out.println();
		System.out.println( strVar1.equals(strVar2));
		System.out.println( strVar1.equals(strVar3)); //equals는 주소가 달라고 형태만 같으면 같은 취급함

	}

}
