package testpack;

public class MyClassLoader{
	
	static int statVar = 9;
	int instVar= 10;
	
	public static void main(String[] args) {
		MyClassLoader obj =new MyClassLoader();
		MyClassLoader obj1 =new MyClassLoader();
		System.out.println(statVar+","+obj.instVar+","+obj1.instVar);
	}

}
