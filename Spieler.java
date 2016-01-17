import java.util.ArrayList;

public class Spieler {

	protected int id;
	public ArrayList<Karte> hand = new ArrayList<Karte>();

	public Spieler(){

	}
	public Spieler(int id){

		this.id = id;	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
