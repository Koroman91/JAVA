
public class tutorial48b {
	
	public static void main(String[] args)
	{
		tutorial48a tunaObject = new tutorial48a(10);
		
		for (int i=0; i<5; i++)
		{
			tunaObject.add();
			System.out.printf("%s", tunaObject);
		}
	}

}
