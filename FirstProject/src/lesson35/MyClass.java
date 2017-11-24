package lesson35;

public class MyClass {
	
	public static int retInt()
	{
		int a = 100;
		try{
			return a;
			
		}
		catch(ArithmeticException e){
			System.out.println("Catch caled");
			System.out.println(e);
			return a;
		
		} finally{
			a = 5000;
			System.out.println("finnaly called");
			return a;
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println(retInt());
	}

}
