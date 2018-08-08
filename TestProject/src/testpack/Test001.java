package testpack;

 abstract class Test001 implements Eatable {
	 
	public void post() {
		System.out.println("Post method implemented in Test001");
	}
	 
	Test001(int age) {
		System.out.println();
	}
	public Test001() {
		System.out.println();
	}
	
	abstract void run();
	
	public static void main(String[] args) {
		EncapTest obj = new EncapTest();
		obj.setFirstName("Manish Sharma");
		System.out.println(obj.getFirstName());
	}

}
