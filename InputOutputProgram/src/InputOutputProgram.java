import java.util.Scanner;

public class InputOutputProgram {
	public static void main(String[] args)
	{
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite svoje ime: ");
		String ime = ulaz.nextLine(); // ime korisnikovo ime daje promenljivoj
		
		System.out.println("Vase ime je " +ime);
	}

}
