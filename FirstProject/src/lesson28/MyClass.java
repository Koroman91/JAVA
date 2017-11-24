package lesson28;

public class MyClass {
	
    public static int factorial (int N)
    {
    	if (N <= 0)
    	{
    		return 1;
    		
    	}
    	else
    	{
    		return (N * factorial(N-1));
    	}
    }
	public static void main(String args[])
	{
		System.out.println(factorial(5));
	}

}
