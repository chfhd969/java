package sec05.exam01_arithmetic;

public class CheckOverflowExample {

	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000,2000000000);
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		}
	}
	
	public static int safeAdd(int left, int right) {
		if((right>0)) {
			if(left>(Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우  발생");
			}
		}else {
			if(left>(Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버플로우  발생");
			}
		}
		return left + right;
	}
}
//try 아래 코드를 실행 catch 오류가발생하면 잡아서 아래코드실행 
//safeAdd의 값을 변수 left, right로 설정
//if문에 들어갈경우 아래 코드실행
//아니면 리턴값 실행해서 다시 위에 try에 변수값넣고 아래 코드실행