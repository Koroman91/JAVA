package vezba;

public class A {
	
	public static void main(String[] args)
	{
		A obj = new A();
		obj.method1();
	}
	
	public void method1()
	{
		method2();
	}
	
	private void method2()
	{
		System.out.println("Hi!");
	}

}
