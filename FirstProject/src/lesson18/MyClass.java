package lesson18;

public class MyClass {
	public static void main(String args[])
	{
		System.out.println(Add(23,32));
		System.out.println(Add(5.656,40.66));
		System.out.println(Add("Hello","World"));
	}
	
	public static int Add(int a, int b)
	{
		return(a+b);
	}
	
	public static double Add(double a, double b)
	{
		return(a+b);
	}
	
	public static String Add(String a, String b)
	{
		return(a+b);
	}

}
