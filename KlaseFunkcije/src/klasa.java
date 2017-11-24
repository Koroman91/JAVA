
public class klasa {
// modifikator void imeFunkcije(tip_podatka formalan parametar)
	
	public void novaFunkcija(){
		System.out.println("Ovo je funkcija"); // funkcija koja ispisuje ovo je nova funkcija
	}
	
	public int returnfunkcija(){
		return 123;                // tip funkcije koja vraca vrednost int-a
	}
	public void sabiranje(int jedan, int dva)
	{
		int zbir = jedan + dva;   //tip funkcije koja ne vraca vrednost ali ima parametre
		System.out.println("Zbir dva parametra je " +zbir);
	}
	public int returnOduzimanje(int prvi, int drugi)
	{
		int razlika = prvi - drugi;  // tip funkcije koja vraca vrednost sa parametrima
		return razlika;
	}
	
}
