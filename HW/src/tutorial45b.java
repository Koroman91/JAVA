import java.util.EnumSet;
class  tutorial45b {
	public static void main(String[] args)
	{
		for (tutorial45a people: tutorial45a.values())
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(),people.getYear());
		
		System.out.println("\nAnd now for the range of  contains!!!\n");
		
		for (tutorial45a people: EnumSet.range(tutorial45a.kelsey, tutorial45a.candy))
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(),people.getYear());

	}

}
