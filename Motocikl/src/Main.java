
public class Main {
	
	public static void main(String[] args)
	{
		Motocikl m1;
		Motocikl m2;
		
		m1 = new Motocikl();
		m2 = new Motocikl();
		
		m1.markaIModel = "Suzuki GS";
		m1.kubikaza = 500;
		
		m2.markaIModel = "Yamaha R6";
		m2.kubikaza = 600;
		
		System.out.println(m1.markaIModel);
		System.out.println(m1.kubikaza);
		System.out.println(m2.markaIModel);
		System.out.println(m2.kubikaza);
		
	}

}
