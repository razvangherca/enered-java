package ro.enered.exemple;

public class Stoc {

	
	public String calcNr(){
		Produs p1;
		Produs p2;
		Produs p3;
		Produs p4;
		Produs p5;
		
		p1=new Produs();
		p2=new Produs();
		p3=new Produs();
		p4=new Produs();
		p5=new Produs();
		p1.nume="Carne";
		p2.nume="Oua";
		p3.nume="Paine";
		p4.nume="Pix";
		p5.nume="Hartie";
		p1.tip="Alimentar";
		p2.tip="Alimentar";
		p3.tip="Alimentar";
		p4.tip="Nealimentar";
		p5.tip="Nealimentar";
		p1.cantitate=5;
		p2.cantitate=3;
		p3.cantitate=6;
		p4.cantitate=10;
		p5.cantitate=13;
		
		int cantTotal=p1.cantitate+p2.cantitate+p3.cantitate+p4.cantitate+p5.cantitate;
		String rezultat="Sunt "+cantTotal+" produse pe stoc.";
		return rezultat;
	}
}
