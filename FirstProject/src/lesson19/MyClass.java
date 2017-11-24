package lesson19;

public class MyClass {
	
	public static void main(String args[])
	{
		Hello hello1 = new Hello();
		hello1.age = 10;		
		System.out.println(hello1.age);
	
		hello1.DoSomething("Hello Stefan!");
	}

}
