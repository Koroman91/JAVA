package lesson39;

import java.util.Hashtable;

public class MyClass {
	
	public static void main(String[] args)
	{
		Hashtable<String, String> employees = new Hashtable<String, String>();
		employees.put("Stefan", "Korolija");
		employees.put("Dennis", "Bergkamp");
		employees.put("Frank", "Lampard");
		employees.put("Garry", "Neville");
		
		for (String itm : employees.keySet())
		{
			System.out.println(itm + " " + employees.get(itm));
		}
	}

}
