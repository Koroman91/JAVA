import java.lang.*; // importovanje biblioteke za matematicke funkcije
public class MatematickeFunkcije {
	public static void main(String[] args)
	{
		double a=5.6, b=3.2;
		int c=2, d=4;
		System.out.println(Math.min(a,b)); // najmanji broj izbacuje
		System.out.println(Math.max(a, b)); // najveci broj izbacuje
		System.out.println(Math.round(a)); //zaokruzivanje
		System.out.println(Math.pow(c,d)); // stepenovanje, prvi parametar je broj koji se stepenuje, a drugi broj je stepen
	    System.out.println(Math.sqrt(c)); // korenovanje
	    System.out.println(Math.sin(c)); // trigonometrijkse funkcije - sinus
	    System.out.println(Math.cos(c)); // trigonometrijske funkcije - cosinus
	    System.out.println(Math.tan(c)); // trigonometrijske funkcije - tangens
	    System.out.println(Math.random()); // slucajan broj od 0 do 1
	    System.out.println(100*Math.random()); // slucajan broj od 0 do 100 pa stavljamo 100*
	    System.out.println(Math.round(100*Math.random())); // zaokruzivanje slucajnog broja od 0 do 100
	     // Rad sa konstantama
	    System.out.println(Math.PI); // konstanta PI koja iznosi 3.14
	    System.out.println(Math.sin(Math.PI)); // sinus od PI a moze i kosinus
	    System.out.println(Math.E); // E je logaritamska konstanta
	}

}
