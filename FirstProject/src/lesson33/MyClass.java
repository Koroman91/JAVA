package lesson33;

import java.util.*;

public class MyClass {

	public static void main(String[] args)
	{
		HashSet<String> name = new HashSet<String>();
		name.add("Mark");
		name.add("Toma");
		name.add("John");
		name.add("Liam");
		name.add("Zack");
		
		Iterator<String> iter = name.iterator();
		
		while (iter.hasNext())
			System.out.println(iter.next());
	}
}
