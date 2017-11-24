
public class tutorial35 {
	
	public static void main(String[] args)
	{
		System.out.println(average(45,2,34,3,5,63,21));
	}

	public static int average(int...numbers)
	{
		int total = 0;
		for (int x:numbers)
			total+=x;
		return total/numbers.length;
	}
}
