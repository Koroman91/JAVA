
public class tutorial47b {
	
	public static void main (String[] args)
	{
		tutorial47a member1 = new tutorial47a("Megan","Fox");
		tutorial47a member2 = new tutorial47a("Natalie","Potman");
		tutorial47a member3 = new tutorial47a("Taylor", "Swift");
		
		System.out.println();
		System.out.println(member1.getFirst());
		System.out.println(member1.getLast());
		System.out.println(member1.getMembers());
		
		System.out.println(tutorial47a.getMembers());
	}

}
