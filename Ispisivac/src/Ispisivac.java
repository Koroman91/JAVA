
public class Ispisivac {
	
	static void ispisiPorukuPetPuta()
	{
		for( int i = 1; i<=5; i++ )
			System.out.println("Dobar dan!");
	}
	static void ispisiPorukuNPuta(String poruka, int n)
	{
		for ( int i=1; i<=n; i++)
		System.out.println(poruka);
	}
	static void ispisiOd0do30()
	{
		for ( int i = 0; i<=30; i++ )
		System.out.println(i);
	}
	static void ispisiOd30do0()
	{
		for ( int i = 30; i>=0; i-- )
			System.out.println(i);
	}
	static int faktorijel(int n)
	{
	  int f = 1;
	  for ( int i = 1; i<=n; i++ )
	  f = f*i;
	  return f;
	}
	static void veciOd1000(int a)
	{
		int rez=1;
		while (rez <1000)
		rez = rez * a;
		System.out.println(rez);
	}
	
	static void ispisiPrvihDesetDeljivihSa6ili9()
	{
		int broj_deljivih = 0;
		int i = 0;
		while (broj_deljivih < 10) {
			if (( i % 6 == 0) || ( i % 9 == 0))
			{
				System.out.println(i);
				broj_deljivih++;
			}
			i++;
		}
		
	}
	
	static void ispisiPrvihNDeljivihSa5ili6(int n)
	{
		int broj_deljivih = 0;
		int i = 1;
		while (broj_deljivih < n){
		if (( i % 5 == 0) || ( i % 6 == 0 ))
		{
			System.out.println(i);
			broj_deljivih++;
		}
		i++;
	}
	}
}
	

