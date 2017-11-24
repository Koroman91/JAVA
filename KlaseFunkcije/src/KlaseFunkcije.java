
public class KlaseFunkcije {
	public static void main(String[] args)
	{
		klasa objekat = new klasa();
		
		
		objekat.novaFunkcija();
		
		int promenljiva = objekat.returnfunkcija();
		System.out.println(promenljiva);
		
		objekat.sabiranje(promenljiva, 3);
		
		int razlika = objekat.returnOduzimanje(promenljiva, 100);
		System.out.println(razlika);
	}

}
