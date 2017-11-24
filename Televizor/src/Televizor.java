
public class Televizor {
	
	int jacinaTona = 0;
	int trenutniProgram = 1;
	boolean ukljucen = false;
	
	void ukljuci()
	{
		if (ukljucen == false)
			ukljucen = true;
		else
			System.out.println("Televizor je ukljucen!");
	}
	void iskljuci()
	{
	   if (ukljucen == true)
		   ukljucen = false;
	   else
		   System.out.println("Televizor je iskljucen!");
	}
	void pojacajTon()
	{
	  if (jacinaTona < 10)
		  jacinaTona  = jacinaTona + 1;
	  else
		  System.out.println("Televizor jer pojacan do kraja!");
	}
	void smanjiTon()
	{
		if (jacinaTona > 0)
			jacinaTona = jacinaTona - 1;
		else
			System.out.println("Televizor je smanjen do kraja!");
	}
	void promeniProgramNavise()
	{
		if (trenutniProgram < 99)
			trenutniProgram = trenutniProgram + 1;
		else
			trenutniProgram = 1;
	}
	void promeniProgramNanize()
	{
	    if (trenutniProgram > 1)
	    	trenutniProgram = trenutniProgram - 1;
	    else 
	    	trenutniProgram = 99;
	}
	void ispisiParametre() {
		if (ukljucen)
		{
			System.out.println("Jacina tona je: " +jacinaTona);
			System.out.println("Trenutni program je: "+trenutniProgram);
			System.out.println("Televizor je ukljucen!");
		}	
		else
			System.out.println("Televizor je iskljucen!");
	}
	}
			
	

