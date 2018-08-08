package testpack;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

class TestCollection12 {
	
	public void linkedListExample() {
	LinkedList<String> lnklst = new LinkedList<String>();
	lnklst.add("M");
	lnklst.add("a");
	lnklst.add("n");
	lnklst.add("i");
	lnklst.add("s");
	lnklst.add("h");
	lnklst.add("S");
	
	for(String str : lnklst) {
		System.out.println(str);
	}
	System.out.println(lnklst.size());
	System.out.println(lnklst.isEmpty());
	System.out.println(lnklst.get(3));
	System.out.println(lnklst.contains("t"));
	System.out.println(lnklst.hashCode());
	System.out.println(lnklst.pop());
	
	}
	
	public void priorityQueueExample() {
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		queue.remove();  
		queue.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		} 
	}
	
	
	public void hashMapExample() {
		
		Map<Integer,String> hsmp = new HashMap<Integer,String>();
		
		hsmp.put(9, "Manish1");
		hsmp.put(2, "Manish2");
		hsmp.put(3, "Manish3");
		hsmp.put(4, "Manish4");
		hsmp.put(5, "Manish5");
		hsmp.put(6, "Manish6");
		hsmp.put(7, "Manish7");
		hsmp.put(8, "Manish8");
		hsmp.put(1, "Manish9");
		
		for(Map.Entry entry : hsmp.entrySet()) {
			
			System.out.println(entry.getKey()+" - "+entry.getValue());
			
		}
		System.out.println(hsmp);
		
		System.out.println(hsmp.size());
		System.out.println(hsmp.get(2));
		System.out.println(hsmp.keySet());
		System.out.println(hsmp.containsKey(10));
		System.out.println(hsmp.containsValue("MAnish1"));
		System.out.println(hsmp.isEmpty());
		hsmp.clear();
		System.out.println(hsmp);
		System.out.println(hsmp.isEmpty());
	}
	
public void lnkdhashMapExample() {
		
		LinkedHashMap<Integer,String> hsmp = new LinkedHashMap<Integer,String>();
		
		hsmp.put(9, "Manish");
		hsmp.put(2, "Sharma");
		hsmp.put(3, "Kumar");
		hsmp.put(4, "Xavient");
		hsmp.put(5, "Manish5");
		hsmp.put(6, "Manish6");
		hsmp.put(7, "Manish7");
		hsmp.put(8, "Manish8");
		hsmp.put(1, "Manish1");
		hsmp.put(null, null);
		hsmp.put(10, null);
		hsmp.put(11, null);
		
		for(Map.Entry entry : hsmp.entrySet()) {
			
			System.out.println(entry.getKey()+" - "+entry.getValue());
			
		}
		System.out.println(hsmp);
		
		System.out.println(hsmp.size());
		System.out.println(hsmp.get(2));
		System.out.println(hsmp.keySet());
		System.out.println(hsmp.containsKey(10));
		System.out.println(hsmp.containsValue("MAnish1"));
		System.out.println(hsmp.isEmpty());
		hsmp.clear();
		System.out.println(hsmp);
		System.out.println(hsmp.isEmpty());
	}

public void treehashMapExample() {
	
	TreeMap<Integer,String> hsmp = new TreeMap<Integer,String>();
	
	hsmp.put(9, "1");
	hsmp.put(2, "2");
	hsmp.put(3, "3");
	hsmp.put(4, "Xavient");
	hsmp.put(5, "Manish5");
	hsmp.put(6, "Manish6");
	hsmp.put(7, "Manish7");
	hsmp.put(8, "Manish8");
	hsmp.put(1, "Manish1");
	hsmp.put(10, null);
	hsmp.put(11, null);
	
	for(Map.Entry entry : hsmp.entrySet()) {
		
		System.out.println(entry.getKey()+" - "+entry.getValue());
		
	}
	System.out.println(hsmp);
	
	System.out.println(hsmp.size());
	System.out.println(hsmp.get(2));
	System.out.println(hsmp.keySet());
	System.out.println(hsmp.containsKey(10));
	System.out.println(hsmp.containsValue("MAnish1"));
	System.out.println(hsmp.isEmpty());
	hsmp.clear();
	System.out.println(hsmp);
	System.out.println(hsmp.isEmpty());
}
	

public void hashTableExample() {
	
	Hashtable<Integer,String> hsmp = new Hashtable<Integer,String>();
	
	hsmp.put(9, "1");
	hsmp.put(2, "2");
	hsmp.put(3, "3");
	hsmp.put(4, "Xavient");
	hsmp.put(5, "Manish5");
	hsmp.put(6, "Manish6");
	hsmp.put(7, "Manish7");
	hsmp.put(8, "Manish8");
	hsmp.put(1, "Manish1");
	
	
	for(Map.Entry entry : hsmp.entrySet()) {
		
		System.out.println(entry.getKey()+" - "+entry.getValue());
		
	}
	System.out.println(hsmp);
	
	System.out.println(hsmp.size());
	System.out.println(hsmp.get(2));
	System.out.println(hsmp.keySet());
	System.out.println(hsmp.containsKey(10));
	System.out.println(hsmp.containsValue("MAnish1"));
	System.out.println(hsmp.isEmpty());
	System.out.println(hsmp.hashCode());
	hsmp.clear();
	System.out.println(hsmp);
	System.out.println(hsmp.isEmpty());
}
	
public static void main(String[] args) {
	
	TestCollection12 obj = new TestCollection12();
	obj.hashTableExample();
}  
} 

/*head:Amit
head:Amit
iterating the queue elements:
Amit
Jai
Karan
Vijay
Rahul
after removing two elements:
Karan
Rahul
Vijay*/
