
public class Main {
	
	public static void main(String[] args)
	{
		Automobil a = new Automobil(2010,100, "BG-007-JB", new Proizvodjac("bmw", 1910, 155536.5, new Mesto("BG", "11000")));
		
		System.out.println(" Godina proizvodnje: " +a.godProizvodnje + " \n Kubikaza: " +a.kubikaza + " \n Registracija: " +a.regTablice + " \n Proizvodjac: " +a.proizvodjac.naziv + " \n Mesto proizvodnje: " + a.proizvodjac.mesto.naziv );
	}

}
