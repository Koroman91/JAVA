import java.io.*; // biblioteka koja je potrebna za rad sa fajlovima/input/output
public class RadSaFajlovima {
	public static void main(String[] args) throws IOException
	{
	 //BufferedReader fin = new BufferedReader(new FileReader("C:/lazio.txt"));
	 //String linija = null; // prazna promenljiva
	 //while((linija = fin.readLine()) !=  null)
	//{
		 //System.out.println(linija);
    //}
	 //fin.close();
	
// Upis u fajl
	try
	{
		byte niz [] = {1,2,3,4,5,6};
		OutputStream fout = new FileOutputStream("C:/Downloads/lazio.txt");
		
		for(int i = 0; i < niz.length; i++)
		{
			fout.write(niz[i]);
		}
		fout.close();
	}
	catch(IOException e){
		System.out.println("Greska");
	}
	}
}
