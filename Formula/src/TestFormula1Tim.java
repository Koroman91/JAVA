
public class TestFormula1Tim {
	public static void main(String[] args)
	{
		Formula1Tim t = new Formula1Tim();
		
		t.naziv = "Scuderia Ferrari Malboro";
		
		t.menadzer = new Osoba();
		t.menadzer.ime = "Berny";
		t.menadzer.prezime = "Eckleston";
		
		t.prviVozac = new Osoba();
		t.prviVozac.ime = "Kimi";
		t.prviVozac.prezime = "Raikkonen";
		
		t.drugiVozac = new Osoba();
		t.drugiVozac.ime = "Felipe";
		t.drugiVozac.prezime = "Massa";
		
		t.ispisi();
	}

}
