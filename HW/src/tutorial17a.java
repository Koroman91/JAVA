
public class tutorial17a {
	
	private String girlName;
	public tutorial17a(String name)
	{
		girlName=name;
	}
	public void setName(String name)
	{
		girlName=name;
	}
	public String getName()
	{
		return girlName;
	}
	public void saying()
	{
		System.out.println("Your first gf was " +girlName);
	}

}
