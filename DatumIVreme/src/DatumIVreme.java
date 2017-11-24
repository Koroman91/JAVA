import java.util.*; // aktiviranje biblioteke za sve koje su util, meni treba zbog datuma
import java.text.*; // biblioteka za promenu formata vremena
public class DatumIVreme {
	
	public static void main(String[] args)
	{
	   Date datum = new Date();
	   System.out.println(datum.toString()); // stampa datum sa toString() konverzijom
	   
	   Date sada = new Date();
	   SimpleDateFormat formatDatuma = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
	   System.out.println(formatDatuma.format(sada));
	}

}
