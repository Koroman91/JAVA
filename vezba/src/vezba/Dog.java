package vezba;

public class Dog {
	
	private int size;
	String name;
	
	public int getSize(){   // getter metoda javna - public
		return size;
	}
	public void setSize(int s){   // setter metoda javna - public
		size = s;
	}
	
	void bark(){
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

}
