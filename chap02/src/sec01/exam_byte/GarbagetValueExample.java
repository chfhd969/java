package sec01.exam_byte;

public class GarbagetValueExample {

	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i=0; i<5; i++) {
			var1++;
			var2++;
			System.out.println("var1:"+ var1 + "\t" + "var2:" + var2);
		}

	}

}
