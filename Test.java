public class Test {

	public static void main(String[] args) {

		Spieler a = new Spieler(1);
		Spieler b = new Spieler(2);
		Spieler c = new Spieler(3);

		Kartenvergabe.KartenNummerInitialisieren();

		Kartenvergabe.Karteziehen(a);
		Kartenvergabe.Karteziehen(a);
		Kartenvergabe.Karteziehen(a);
		Kartenvergabe.Karteziehen(b);
		Kartenvergabe.Karteziehen(c);
		Kartenvergabe.Karteziehen(b);

		System.out.println(a.hand.get(0).getNummer());
		System.out.println(a.hand.get(1).getNummer());
		System.out.println(a.hand.get(2).getNummer());
		System.out.println(b.hand.get(0).getNummer());
		System.out.println(b.hand.get(1).getNummer());
		System.out.println(c.hand.get(0).getNummer());
	}
}
