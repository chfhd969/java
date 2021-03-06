package sec05.exam04_bit;

public class BitLogicExample {

	public static void main(String[] args) {
		System.out.println("45 & 25 =" + (45 & 25));
		//00101101  =45
		//00011001  =25
		//00001001  =9
		System.out.println("45 | 25 =" + (45 | 25));
		//00101101  =45
		//00011001  =25
		//00110100  =52
		System.out.println("45 ^ 25 =" + (45 ^ 25));
		//00101101  =45
		//00011001  =25
		//00111101  =61
		System.out.println("~45 =" + ( ~45 ));
		
		System.out.println(toBinaryString(45));
		System.out.println("&");
		System.out.println(toBinaryString(25));
		//System.out.println("||");
		System.out.println(toBinaryString(45&25));
		
	}
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}

}
