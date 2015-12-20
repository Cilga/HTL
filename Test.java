
public class Test {

	public static void main(String[] args) {
		
		Spieler a = new Spieler(1);
		Spieler b = new Spieler(2);
		Spieler c = new Spieler(3);

		Kartenvergabe.KartenNummerInitialisieren();
		Kartenvergabe.KartenWertInitialisieren();
		
		Kartenvergabe.Karteziehen(a);
		Kartenvergabe.Karteziehen(a);
		Kartenvergabe.Karteziehen(a);
		Kartenvergabe.Karteziehen(b);
		Kartenvergabe.Karteziehen(c);
		Kartenvergabe.Karteziehen(b);
		
		System.out.println(a.getHand()[0]);
		System.out.println(a.getHand()[1]);
		System.out.println(a.getHand()[2]);
		System.out.println(b.getHand()[0]);
		System.out.println(b.getHand()[1]);
		System.out.println(c.getHand()[0]);
	}
}
