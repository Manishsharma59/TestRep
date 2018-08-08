package testpack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringTest01 {
	
	public void duplicateWords(String inputString) {
		
		String[] strArray = inputString.split(" ");
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		for(String obj : strArray) {
			if(map.containsKey(obj.toLowerCase())) {
				map.put(obj.toLowerCase(), map.get(obj.toLowerCase())+1);
			}
			
			else {
				map.put(obj.toLowerCase(),1);
			}
		}
		
		for(String st : map.keySet()) {
			if(map.get(st)>1) {
			System.out.println(st);
			}
		}
	}
	
	public void repeatedWordInFile() {
	 
	 
	        //Creating wordCountMap which holds words as keys and their occurrences as values
	         
	        HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
	     
	        BufferedReader reader = null;
	         
	        try
	        {
	            //Creating BufferedReader object
	             
	            reader = new BufferedReader(new FileReader("C:\\sample.txt"));
	             
	            //Reading the first line into currentLine
	             
	            String currentLine = reader.readLine();
	             
	            while (currentLine != null)
	            {    
	                //splitting the currentLine into words
	                 
	                String[] words = currentLine.toLowerCase().split(" ");
	                 
	                //Iterating each word
	                 
	                for (String word : words)
	                {
	                    //if word is already present in wordCountMap, updating its count
	                     
	                    if(wordCountMap.containsKey(word))
	                    {    
	                        wordCountMap.put(word, wordCountMap.get(word)+1);
	                    }
	                     
	                    //otherwise inserting the word as key and 1 as its value
	                    else
	                    {
	                        wordCountMap.put(word, 1);
	                    }
	                }
	                 
	                //Reading next line into currentLine
	                 
	                currentLine = reader.readLine();
	            }
	             
	            //Getting the most repeated word and its occurrence
	             
	            String mostRepeatedWord = null;
	             
	            int count = 0;
	             
	            Set<Entry<String, Integer>> entrySet = wordCountMap.entrySet();
	             
	            for (Entry<String, Integer> entry : entrySet)
	            {
	                if(entry.getValue() > count)
	                {
	                    mostRepeatedWord = entry.getKey();
	                     
	                    count = entry.getValue();
	                }
	            }
	             
	            System.out.println("The most repeated word in input file is : "+mostRepeatedWord);
	             
	            System.out.println("Number Of Occurrences : "+count);
	        } 
	        catch (IOException e) 
	        {
	            e.printStackTrace();
	        }
	        finally
	        {
	            try
	            {
	                reader.close();           //Closing the reader
	            }
	            catch (IOException e) 
	            {
	                e.printStackTrace();
	            }
	        }
	    }   
	
	
	public void fabonicSeries(int number) {
		
		int n1=0,n2=1,n3;
		System.out.print(n1+","+n2);
		for(int i = 0; i< number;i++) {
			
			n3 = n1 + n2;
			System.out.print(","+n3);
			n1=n2;
			n2=n3;
			
		}
	}
	
	public void primeNumber(int number) {
		int flag = 0;
		
		if(number ==0||number==1) {
			
			System.out.println("This is not a prime number");
		}
		
		for(int i = 2;i<=number/2;i++) {
			
			if(number%i==0) {
				System.out.println("This is not a prime number");
				flag=1;
				break;
			}
			
		}
		
		if(flag==0) {
			System.out.println("This is a prime number");
		}
		
	}
	
	public void isPalindromeNUmber(int number) {
		
		int temp = 0;
		int num = number;
		while(number>0) {
			temp = temp*10 + number%10;
			number = number/10;
		}
		if(num==temp) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println(" NOt Palindrome number");
		}
		
	}
	
	public void factorialNUmber(int num) {
		
		int factorial = 1;
		for(int i = num;i>0;i--) {
			factorial = factorial*i;
			
		}
		System.out.println(factorial);
	}
	
	
	public void armStrongNumber(int numb) {
		int dig;
		int temp = numb;
		int sum = 0;
		while(numb>0) {
			dig = numb%10;
			numb = numb/10;
			sum = sum+dig*dig*dig;
		}
		
		if(temp==sum) {
			System.out.println("Armstrong");
		}
		
		else
			System.out.println("Not Armstrong");
		
	}
	public static void main(String[] args) {
		StringTest01 obj = new StringTest01();
		obj.armStrongNumber(153);
	}

}
