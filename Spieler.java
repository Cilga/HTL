
public class Spieler {

	protected int id;
	protected int[] hand = new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	
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
	public int[] getHand() {
		return hand;
	}
}
