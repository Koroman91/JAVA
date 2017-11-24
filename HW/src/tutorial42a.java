
public class tutorial42a {
	
	private int mounth;
	private int day;
	private int year;
	
	public tutorial42a(int m, int d, int y)
	{
		mounth = m;
		day = d;
		year = y;
		//System.out.printf("The constructor for this is %s", this);
	}
	public String toString()
	{
		return String.format("%d/%d/%d", mounth, day, year);
	}

}
