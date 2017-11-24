package lesson32;

import java.util.*;

public class MyClass {
	
	public static void main(String args[])
	{
		ArrayList<String> name = new ArrayList<String>();
		name.add("Stefan");
		name.add("Anja");
		name.add("Ivan");
		name.add("Vuk");
		name.add("Mina");
		
		ListIterator<String> itr = name.listIterator();
		
		while (itr.hasNext())
			System.out.println(itr.next());
		while (itr.hasPrevious())
			System.out.println(itr.previous());
	}

}
