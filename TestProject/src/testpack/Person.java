package testpack;

abstract class Person{  
	  abstract void eat(); 
	  abstract void play();
	}  
	class TestAnonymousInner{  
	 public static void main(String args[]){  
	  Person p=new Person() {

		void eat() {
			System.out.println("Nice Fruits");
		}

		void play() {
			System.out.println("Played well");
			
		}
		  };
	  p.eat(); 
	  p.play();
	 }  
	}
