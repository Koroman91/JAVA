package vezba;

public class Proba {
	
	public static void main(String[] args)
	{
		int a = 23;
		
		
		int b[] = new int[5];
		b[0]=1;
		b[1]=2;
		b[2]=3;
		b[3]=4;
		b[4]=5;
		
		int max = 0;
		for (int j=0; j<b.length; j++)
		{
			    //b[j] = max;
                if(b[j] > max )
                {
				max = b[j];
                }
		}
		System.out.println(max);
		
		
		for (int i=1;i<=a;i++)
		{
			if (i == a/2)
			{
			System.out.println("Half is: " +i+ "!");
			}
		}
		
		
		
		
		
	}

	
	
}	
	


