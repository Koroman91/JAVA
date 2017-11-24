package vezba;

public class TestVezba6 {
	public static void main(String[] args)
	{
		vezba6 v = new vezba6();
		v.playSnare();
		v.snare = false;
		v.playTopHat();
		
		if (v.snare == true)
		{
			v.playSnare();
		}
	}

}
