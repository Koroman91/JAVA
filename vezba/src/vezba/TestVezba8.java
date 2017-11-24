package vezba;

public class TestVezba8 {

	public static void main(String[] args)
	{
		vezba8[] myBooks = new vezba8[3];
		myBooks[0]= new vezba8();
		myBooks[1]= new vezba8();
		myBooks[2]= new vezba8();
		int x = 0;
		myBooks[0].title = "The Grapes of Java";
		myBooks[1].title = "The Java Gatsby";
		myBooks[2].title = "The Java Cookbook";
		myBooks[0].author = "bob";
		myBooks[1].author = "sue";
		myBooks[2].author = "ian";
		
		while (x < 3)
		{
			System.out.print(myBooks[x].title);
			System.out.println(" b ");
			System.out.println(myBooks[x].author);
			x = x + 1;
		}
	}
}
