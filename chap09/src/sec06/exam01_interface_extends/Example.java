package sec06.exam01_interface_extends;

public class Example {

	public static void main(String[] args) {
		ImplementationC imp1 = new ImplementationC();
		
		InterfaceA ia = imp1;
		ia.methodA();
		System.out.println();

		InterfaceB ib = imp1;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = imp1;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println();


	}

}
