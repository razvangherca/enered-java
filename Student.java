package ro.enered.exemple;

public class Student {
	// proprietatile studentului
	public String nume;
	public int grup;

	public String invata(String numeCurs,int numarOre) {
		String rezultat = "Studentul " + nume +" din grupa "+grup+ " a invatat la " + numeCurs + " timp de "+numarOre+" ore.";
		return rezultat;
	}
	
}
