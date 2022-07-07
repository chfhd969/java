package sec03.exam01_for;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		for (int m=2; m<=9; m++) {                      //중첩 for문 첫번빼 for문이 1번 실행되면 뒤의 for문이 끝날때 까지 반복하여 실행한 후 다시 처음의 for문 1번 실행
			System.out.print("***" + m + "단***\t");
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
