package lesson30;

import java.util.LinkedList;
public class MyClass {
	
	public static void main(String args[])
	{
		LinkedList<String> name = new LinkedList<String>();
		name.add("Patrick");
		name.add("Tom");
		name.add("Mark");
		name.add("Stefan");
		name.addFirst("John"); // dodavanje elementa linkedliste na pocetak
		name.addLast("Zack"); // dodavanje elementa linkedliste na kraj
		name.add(2,"Liam");
		System.out.println("size is = " +name.size());
		
		for (String x : name)
			System.out.println(x);
		name.remove(1);
		System.out.println("size is = " +name.size());

	}

}
