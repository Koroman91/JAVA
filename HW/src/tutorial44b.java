class tutorial44b{
	
public static void main (String[] args)
{
	for (tutorial44a people: tutorial44a.values())
		System.out.printf("%s\t%s\t%s\n", people, people.getDesc(),people.getYear());
}

}
