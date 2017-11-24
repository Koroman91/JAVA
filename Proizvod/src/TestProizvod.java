
public class TestProizvod {
	public static void main(String[] args){
	
		Proizvod p1 = new Proizvod();
		Proizvod p2 = new Proizvod();
		
		p1.naziv = "automobil";
		p2.naziv = "traktor";
		
		p1.ispisiSve();
		p2.ispisiSve();
		
		p2=p1;
		
		p1.ispisiSve();
		p2.ispisiSve();
		
		
		p2.naziv ="kombajn";
		
		p1.ispisiSve();
		p2.ispisiSve();
		
	}

}
