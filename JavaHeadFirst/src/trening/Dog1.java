package trening;

public class Dog1 {
	
	int size;
	String name;
	
	void bark()
	{
		if (size > 60)
		{
			System.out.println("Woof! Woof!");
		}
		else if (size > 14)
		{
			System.out.println("Ruff! Ruff!");
		}
		else
		{
			System.out.println("Yip! Yip");
		}
		
	}
	void parameter(int numOfBarks)
	{
	  while (numOfBarks > 0)
	  {
		  System.out.println("Woof! Ruff! Yip!");
		  numOfBarks = numOfBarks - 1;
	  }
	}

}
