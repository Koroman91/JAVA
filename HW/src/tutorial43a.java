
public class tutorial43a {
	
	private String name;
	private tutorial42a birthday;
	
	public tutorial43a(String theName, tutorial42a theDate)
	{
		name = theName;
		birthday = theDate;
	}
	public String toString()
	{
		return String.format("My name is %s, my birthday is %s", name, birthday);
	}

}
