package testpack;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days{
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday,Sunday
}

public class EnumClassTest {
	public void enumMethodTest() {
		System.out.println(EnumSet.of(days.Friday));
		Set<days> set = EnumSet.of(days.Friday);
		 Iterator<days> itr = set.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		System.out.println(days.valueOf("Monday"));
	}

	public static void main(String[] args) {
		EnumClassTest obj = new EnumClassTest();
		obj.enumMethodTest();
	}
}
