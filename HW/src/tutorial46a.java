
public class tutorial46a {

	private String first;
	private String last;
	private static int members=0;
	
	public tutorial46a(String fn, String ln)
	{
		first=fn;
		last=ln;
		members++;
		System.out.printf("Constructor for %s%s, members in the club: %d\n", first,last,members);
		
	}
	
}
