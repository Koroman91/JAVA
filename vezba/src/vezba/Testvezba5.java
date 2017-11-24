package vezba;

public class Testvezba5 {
	public static void main(String[] args)
	{
		
		vezba5 t = new vezba5();
		t.canRecord = true;
		t.playTape();
		
		DVDPlayer d = new DVDPlayer();
		d.canRecord = true;
		d.recordDVD();
		
		
		if (t.canRecord == true)
		{
			t.recordTape();
		}
		if (d.canRecord == true)
		{
		   d.recordDVD();
		}
	}

}
