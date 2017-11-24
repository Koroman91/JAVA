package lesson29;

import java.util.ArrayList;

public class MyClass {
	
	public static void main(String args[])
	{
		int simple_array[] = new int[5]; // elementi {1,2,3,4,5}
		
		ArrayList<Integer> myList = new ArrayList<Integer>(5);
		myList.add(1);
		myList.add(5);
		myList.add(3);
		myList.add(25);
		myList.add(93);
		
		for (Integer x : myList)
			System.out.println(x);
		    System.out.println("size is = " +myList.size());
		    
		    myList.remove(2);
		    
		    for (Integer x : myList)
				System.out.println(x);
			    System.out.println("size is = " +myList.size());
			    
			//myList.clear(); brisanje svih vrednosti liste
			myList.set(1, 100);
			for (Integer x : myList)
			System.out.println(x);

	}

}
