package testpack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class ProgramPractice {
	
	public void pattern1() {
		
		for(int i=1;i<=7;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j+ " ");
			}
			System.out.println(" ");
		}
	}
	
	public void pattern2() {
		
		for(int i=1;i<=7;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(i+ " ");
			}
			System.out.println(" ");
		}
	}
	
	
	public void pattern3() {
		
		for(int i=7;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j+ " ");
			}
			System.out.println(" ");
		}
	}
	
public void pattern4() {
		
		for(int i=1;i<=7;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j+ " ");
			}
			System.out.println(" ");
		}
		for(int i=6;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j+ " ");
			}
			System.out.println(" ");
		}
	}

public void pattern5() {
	int k=1;
	for(int i=7;i>=1;i--) {
		
		for(int j=7;j>=k;j--) {
			System.out.print(j+ " ");
		}
		System.out.println("");
		k++;
	}
}

public void pattern6() {
	
	for(int i=7;i>=1;i--) {
		
		for(int j=1;j<=i;j++) {
			System.out.print(j+ " ");
		}
		System.out.println("");
		
	}
	
	for(int i=2;i<=7;i++) {
		
		for(int j=1;j<=i;j++) {
			System.out.print(j+ " ");
		}
		System.out.println("");
		
	}
}


public void pattern7() {
	
	for(int i=1;i<=7;i++) {
		
		for(int j=1;j<=i;j++) {
			System.out.print(j+ " ");
		}
		for(int k=i-1;k>=1;k--) {
			System.out.print(k+ " ");
		}
		System.out.println("");
		
	}
	
}

//a perfect number is a positive integer that is equal to the sum of its proper positive divisors eg 28
public void isPerfectNumber(int num) {
	//6
	int sum=0;
	for(int i=1;i<=num/2;i++) {
		if(num%i==0) {
			sum =sum+ i;
		}
	}
	if(sum==num) {
		System.out.println("Given number is perfect number");
	}
	else {
	System.out.println("Given number is not perfect number");
	}
}


public void reverseTheNumber(int num) {
	
	//123
	int rev=0;
	while(num!=0) {
	rev = rev*10+(num%10);
	num=num/10;
	
	}
	System.out.print(rev);
}

public void generateRandomNumber() {
	
	Random num = new Random();
	System.out.println(num.nextInt(50));
}

public void twoMaxNumberInArray() {
	
	int array[] = {5,10,3,18,21,9};
	int temp;
	for(int i =0;i<array.length;i++) {
		for(int j=i+1;j<array.length;j++) {
		if(array[i]>array[j]) {
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
		}
		System.out.print(array[i]+",");
	}
	System.out.println("");
	System.out.println(array[array.length-1]+","+array[array.length-2]);
}

public void sumOfArrayNum() {
	
	int array[] = {1,2,3,4,5,6,7};
	int sum=0;
	for(int i=0;i<array.length;i++) {
		sum = sum + array[i];
	}
	System.out.println(sum);
}

public void reverseTheString() {
	String statement = "Chennai won the IPL third time";
	String[] array = statement.split(" ");
	for(int i = 0;i<array.length;i++) {
    char[] array1 = array[i].toCharArray();
    for(int j=array1.length-1;j>=0;j--) {
    System.out.print(array1[j]);
	}
    System.out.print(" ");
	}
	System.out.println("");
	char[] array2 = statement.toCharArray();
	for(int j=array2.length-1;j>=0;j--) {
	    System.out.print(array2[j]);
		}
	    System.out.print(" ");
		}

public void findDuplicateChar() {
	
	String str = "chennai won the IPL third time";
	
	char[] charArray = str.toCharArray();
	StringBuffer strBuffer = new StringBuffer(str);
	int count = 1;
	for(int i=0;i<charArray.length;i++) {
		for(int j=i+1;j<charArray.length;j++) {
		if(charArray[i]==charArray[j]) {
			count++;
			strBuffer.deleteCharAt(j);
		}
		
		}
		System.out.println(charArray[i]+ "-"+count);
	}
}

public void duplicateChar() {
	
	String str = "Manishsharma";
	char[] chars = str.toCharArray();
	Map<Character,Integer> hasMap = new HashMap<Character,Integer>();
	for(Character c : chars ) {
		if(hasMap.containsKey(c)) {
			hasMap.put(c, hasMap.get(c)+1);
		}
		else {
		hasMap.put(c, 1);
		}
	}
	Set<Character> keys = hasMap.keySet();
	for(Character ch: keys) {
		if(hasMap.get(ch)>1) {
			
			System.out.println(ch+"--------"+hasMap.get(ch));
		}
		
	}
}


public void distinctElementsInArray() {
	
	int[] intArray = {5,10,2,5,21,10};
	
	for(int i = 0;i<intArray.length;i++) {
		boolean isDistinct = false;
		for(int j = 0;j<i;j++) {
			if(intArray[i]==intArray[j]) {
				isDistinct = true;
				break;
			}
		}
		if(!isDistinct) {
			System.out.print(intArray[i]+ ",");
		}
	}
}

public String toggle(String str) {
	//String My name is manish.
	 String[] words = str.split(" ");
	 String toggleString = "";
	 for(String s : words) {
	 String firstStr = s.substring(0,1);
	 String remainStr = s.substring(1);
	 toggleString += firstStr + remainStr.toUpperCase()+" ";
	 }
	 return toggleString.trim();
}

public void reverseEachWordOfString(String st) {
	
	String[] str = st.split(" ");
	String revwordstr = "";
	
	for(String s: str) {
		StringBuffer strB = new StringBuffer(s);
		String revWord = strB.reverse().toString();
		revwordstr += revWord+" ";
	}
	System.out.println(revwordstr.trim());
}

public void reverseStringBufferBuilder() {
	
	String str = "Reverse the String";
	String [] stsplit = str.split(" ");
	for(int i =0 ;i<stsplit.length;i++) {
	StringBuilder stb = new StringBuilder(stsplit[i]);
	System.out.print(stb.reverse().toString().trim()+" ");
	}
}

//0,1,1,2,3,5,8
public void fibonacciSeries() {
	
	int number1 = 0;
	int number2 = 1;
	int sum;
	System.out.print(number1+","+number2+",");
	for(int i = 0;i<=10;i++) {
		sum = number1+number2;
		System.out.print(sum+",");
		number1 = number2;
		number2 = sum;
		
	}
	
}

public void isfibonicSeries() {
	
	int [] array1 = {0,1,1,2,5,5,8};
	boolean flag = false;
	for(int i = 0;i<array1.length-2;i++) {
		if(array1[i+2] ==array1[i]+array1[i+1]) {
			flag = true;
		}
		else {
			flag = false;
			break;
		}
	}
	if(flag) {
		System.out.println("Fibonic");
	}
	else {
	System.out.println(" not Fibonic");
	}
}


public void isPrimeNUmber() {
	
	int number = 6;
	
	for(int i= 2;i<number/2;i++) {
		
		if(number%i==0) {
			System.out.println("not prime");
			break;
		}
		else
			System.out.println("prime number");
	}
	
	
}

public void ispalindromeNumber() {
	
	int number = 121;
	int temp = number;
	int rev = 0;
	
	while(temp!=0) {
		rev = rev*10 + (temp%10);
		temp = temp/10;
		System.out.println(rev);
	}
	if(number==rev) {
		System.out.println("Palindrome");
	}else {
	System.out.println("Not Palindrome");
	}
}

public void factorial() {
	int num = 5;
	int factorial=1;
	for(int i = 1;i<=num;i++) {
		factorial = factorial*i;
		
	}
	System.out.println(factorial);
	
}

public void armStrongNumber() {//153...........1*1*1 + 5*5*5 + 3*3*3
	
	 int num = 153;
	 int numCopy = num;
	 int temp;
	 int sum = 0;
	 while(num!=0) {
		temp =  num%10;
		num = num/10;
		sum = sum + temp*temp*temp;
		System.out.println(sum);
	 }
	 
	 if(sum==numCopy) {
		 
		 System.out.println("armstrong");
	 }
	 else{
		 
		 System.out.println("not armstrong");
	 }
}

public void bubbleSort() {
	
	int [] array1 = {10,7,2,9,87,89,121,3,6,4};
	int temp;
	for(int i = 0; i<array1.length;i++) {
		
		for(int j = i+1;j<array1.length;j++) {
			
			if(array1[i]>array1[j]) {
				temp = array1[i];
				array1[i] =array1[j];
				array1[j]=temp;
			}
		}
	}
	for(int i = 0; i<array1.length;i++) {
	System.out.print(array1[i]+",");
	}
}

	public void setTest() {
		
		Set<String> set = new HashSet<String>();
		set.add(" ");
		set.add(" ");
		set.add("1");
		set.add("2");
		set.add("2");
		set.add(" ");
		for(String obj : set) {
			System.out.println(obj);
		}
	}
	public static void main(String args[]) {
		ProgramPractice obj = new ProgramPractice();
		obj.setTest();
	}

}
