package testpack;

class TestMemberOuter1{  
 private int data=30;  
 class Inner{  
  void msg(){
	  System.out.println("data is "+data);
	  }  
 }  
 public static void main(String args[]){  
	 
	 TestMemberOuter1.Inner in  = new TestMemberOuter1().new Inner();
	 
	 in.msg();  
 }
  
}
