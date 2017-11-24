

public class ElseIfPetlja {
	public static void main(String[] args)
	{
		int x = 5, y = 5;
	// oblik sa jednom operacijom u if petlji, bez viticastih zagrada, a sa vise onda idu viticaste
	//
		if(x<y){
			System.out.println("If petlja se izvrsava");
		}
		else if(x>y)
		{
			System.out.println("Else if petlja se izvrsava");
		}
		else // else petlja se izvrsava ako nijedan od ovih uslova iznad nije tacan
		System.out.println("Else petlja se izvrsava");
		
		if(x>=y&&x==y)
		{
			System.out.println("If petlja se izvrsava");
		}
	}

}