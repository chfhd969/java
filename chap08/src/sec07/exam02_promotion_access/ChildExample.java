package sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		Child child1 = new Child();
		
		Parent parent = child;
		
		parent.method1();
		
		parent.method2();  //Child�� override�� ���� Child�� method2�� ���߿� ����ȴ� �׷��� ��������� Child�� method2�� ȣ��ȴ�
		
		//parent.method3(); (ȣ�� �Ұ���) Child class�� method3 �������� �θ�class�� ����ȯ �Ǹ鼭 method3 ȣ�� �Ұ��ϴ�
		//child1.method3(); (ȣ�Ⱑ��) ����ȯ �ȵ� child1�̱� ������ ȣ�Ⱑ��
	}

}
