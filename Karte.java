public class Karte {

	private int nummer;
	private int wert;

	public Karte(int nummer,int wert){

		this.nummer = nummer;
		this.wert = wert;		
	}
	public int getNummer() {
		return nummer;
	}
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
	public int getWert() {

		return wert;
	}
	public void setWert(int wert) {

		this.wert = wert;
	}
}
