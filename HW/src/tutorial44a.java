
public enum tutorial44a {
	
	bucky ("nice", "22"),
	kesley ("cutie", "10"),
	julia ("bigmistake", "12");
	
	private final String desc;
	private final String year;
	
	tutorial44a(String description, String birthday)
	{
		desc = description;
		year = birthday;
	}
	public String getDesc()
	{
		return desc;
	}
	public String getYear()
	{
		return year;
	}

}
