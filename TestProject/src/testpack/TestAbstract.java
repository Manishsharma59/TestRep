package testpack;

public class TestAbstract extends Abstract {

	public void testMethod2() {
		System.out.println("Abstract Class method2 implemented in TestAbstract Class");
		
	}

	public void testMethod3() {
		System.out.println("Abstract Class method3 implemented in TestAbstract Class");
		
	}
	
	public static void main(String[] args) {
		TestAbstract obj = new TestAbstract();
		obj.testMethod1();
		System.out.println(obj.a);
		
		Abstract obj1 = new TestAbstract();
		obj1.testMethod2();
		obj1.testMethod3();
	}

}
