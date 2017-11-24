package lesson15;

public class MyClass {
	public static void main(String args[])
	{
		ispis("Stefan");
		Add(200,300,400);
		int sum = Adder(203,200,222);
		System.out.println(sum);
	}
	
	public static void ispis(String name)
	{
	   System.out.println("Hello " + name);	
	}
	
	public static void Add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	public static int Adder(int a, int b, int c){
		return (a+b+c);
	}

}
