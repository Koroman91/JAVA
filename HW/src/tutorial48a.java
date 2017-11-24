
public class tutorial48a {

	private int sum;
	private final int NUMBER;
	
	public tutorial48a(int x)
	{
		NUMBER = x;
	}
	public void add()
	{
		sum+=NUMBER;
	}
	public String toString()
	{
		return String.format("sum = %d\n", sum);
	}

}
