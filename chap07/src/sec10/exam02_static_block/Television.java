package sec10.exam02_static_block;

public class Television {
	int field1;
	
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	//static String info = company + "-" + model; �ؿ� static block �� ���� ǥ��
	
	static {
		//field1 = 10; x
		//method1(); x
		info = company + "-" + model;
	}
	
/*	static void Method1() {
		obj1.company = Television("LG ����");
		}*/ //��ü�� ���� ������ ������ ����
	void method1() {
		
	}
	static void method2() {
		//this.field1 = 10; x    static�� �ϳ��� �ƴ� ���� ���� ���� �Ǹ� ������ ����.
		//this.method1(); 
	} 
	static void Method3() {
		Television obj = new Television();
		obj.field1 = 10;
		obj.method1();
	}
}
