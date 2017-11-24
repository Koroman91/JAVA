
public class MesecniProfiti {
	double[] profiti = new double [12];
	
	void unesiProfit(double profit, int mesec)
	{
		profiti[mesec-1] = profit;
	}
	void ispisi(){
		for(int i=0; i<profiti.length; i++)
			System.out.println(profiti[i]);
	}
}
