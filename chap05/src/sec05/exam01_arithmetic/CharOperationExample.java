package sec05.exam01_arithmetic;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		//char c3 = c2 + 1;    // 컴파일 에러 c2 + c1 값이 int로 나타나기 때문에 오류가난다
		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);
		//System.out.println("c3:" + c3);
	}

}
