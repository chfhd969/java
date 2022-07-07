package sec03.exam02_while;

public class WhilePrintForm1To10Example {

	public static void main(String[] args) {
		
		int i = 0;
		int total = 0;
		while(i<10) {
			i++;
			total += i;
			System.out.print(i);
			if(i!=10) System.out.print("+");
		}
		System.out.print("="+total);
	}


	

}
