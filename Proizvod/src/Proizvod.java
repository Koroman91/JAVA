/*Napisati klasu Proizvod koja ima samo jedan atribut - naziv i samo jednu metodu "ispisi"
 * koja ispisuje vrednost ovog atributa na ekranu. Napraviti klasu  TestProizvod koja kreira dva
 * objekta klase Proizvod sa nazivima "Automobil" i "Traktor". Ispisati vrednosti atributa oba
 * proizvoda. Dodeliti drugom objektu adresu prvog objekta. Ponovo ispisati vrednosti atributa oba
 * proizvoda. Izmeniti naziv drugog proizvoda u kombajn i jos jednom ispisati vrenosti atributa
 * oba proizvoda.
 */
public class Proizvod {
	String naziv;
	
	void ispisiSve(){
		System.out.println("Naziv je:" +naziv);
	}

}
