package vezba;

public class TestVezba7 {
	public static void main(String[] args)
	{
		vezba7 e1 = new vezba7();
		vezba7 e2 = new vezba7();
		int x =0;
		
		while (x < 4)
		{
			e1.hello();
			e1.count = e1.count+1;
			if ( x==3 )
			{
				e2.count = e2.count + 1;
			}
			if ( x==0 )
			{
				e2.count = e2.count + e1.count;
			}
			x = x+1;
		}
		System.out.println(e2.count);
	}

}
