package sec10.exam02_static_block;

public class Television {
	int field1;
	
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	//static String info = company + "-" + model; 밑에 static block 과 같은 표현
	
	static {
		//field1 = 10; x
		//method1(); x
		info = company + "-" + model;
	}
	
/*	static void Method1() {
		obj1.company = Television("LG 전자");
		}*/ //객체를 만들어도 컴파일 오류가 난다
	void method1() {
		
	}
	static void method2() {
		//this.field1 = 10; x    static에 하나가 아닌 변수 값이 들어가게 되면 오류가 난다.
		//this.method1(); 
	} 
	static void Method3() {
		Television obj = new Television();
		obj.field1 = 10;
		obj.method1();
	}
}
