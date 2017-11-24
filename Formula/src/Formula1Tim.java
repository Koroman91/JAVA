
public class Formula1Tim {
	
	String naziv;
	
	Osoba menadzer;
	Osoba prviVozac;
	Osoba drugiVozac;
	
	void ispisi()
	{
		System.out.println("Naziv tima: "+naziv);
		System.out.println("Menadzer");
		menadzer.ispisi();
		System.out.println("Prvi vozac");
		prviVozac.ispisi();
		System.out.println("Drugi vozac");
		drugiVozac.ispisi();
	}

}
