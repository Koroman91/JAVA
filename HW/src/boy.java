import java.util.Scanner;

 class boy {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		girl girlObject = new girl();
		System.out.println("Enter name of the first gf here: ");
		String temp = input.nextLine();
		girlObject.setName(temp);
		girlObject.saying();
	}
	

}
