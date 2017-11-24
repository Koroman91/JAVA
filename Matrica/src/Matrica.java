
public class Matrica {
	
	int [][] matrica; // atribut matrice koji ima dvodimenzionalni niz celih brojeva
	
	Matrica(int brojRedova, int brojKolona) // konstruktor prima ulazni parametar broj redova i broj kolona
	{
		matrica = new int[brojRedova][brojKolona]; 
	}
	
	void nulaMatrica()  // metoda koja pravi maricu u nulu matricu(da su joj svi elementi nule)
	{
	 for (int i=0; i< matrica.length; i++)   // prolaz po redovima
		 for (int j=0; j< matrica[0].length; j++)  // prolaz po kolonama
			 matrica[i][j] = 0;    // postavljanje nula
	 
	}
	
	void jedinicnaMatrica()
	{
	if (matrica.length == matrica[0].length) // proverava da li je matrica kvadratna, da li ima isti broj redova i kolona
	{
		for (int i=0; i<matrica.length; i++)   // prolaz kroz redove
			for(int j=0; j<matrica[0].length;j++)  // prola kroz kolone
				if (i == j)               // ako su jednaki i i j
					matrica [i][j] = 1;   // stavi 1
				else
					matrica [i][j] = 0;  // ako nisu stavi 0
	}
	else
		System.out.println("Greska!");
	}
	 void ispisi()
	 {
		 for(int i=0; i<matrica.length; i++)
		 {
			 for (int j=0; j<matrica[0].length; j++)
		System.out.println(matrica[i][j] + " ");
			 System.out.println();
	 }

}
}