package sec13.exam02_constructor_access.package2;

import sec13.exam02_constructor_access.package1.A;

public class D {
	//필드
	A a1 = new A(true);    // (O)
	//A a2 = new A(1);       // (X) default 생성자 접근 불가
	//A a3 = new A("문자열"); //(X) private 생성자 접근 불가
}
