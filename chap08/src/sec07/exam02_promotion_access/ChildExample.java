package sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		Child child1 = new Child();
		
		Parent parent = child;
		
		parent.method1();
		
		parent.method2();  //Child에 override에 의해 Child의 method2가 나중에 실행된다 그래서 결과적으로 Child의 method2가 호출된다
		
		//parent.method3(); (호출 불가능) Child class에 method3 가있지만 부모class로 형변환 되면서 method3 호출 불가하다
		//child1.method3(); (호출가능) 형변환 안된 child1이기 때문에 호출가능
	}

}
