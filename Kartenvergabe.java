import java.util.Random;


public class Kartenvergabe {

	static Karte karten[] = new Karte[52];
	public static int arraylänge = karten.length;

	public static void KartenNummerInitialisieren(){

		for(int i = 0; i < karten.length; i++){

			Karte karte = new Karte(i,0);
			karten[i] = karte;
		}
	}
	public static void KartenWertInitialisieren(){

		for(int i = 0; i < karten.length; i++){

			karten[i].setWert(i%13);

			if(i == 0 || i == 10 || i == 11 || i == 12){

				karten[i].setWert(10);
			}
			if(i == 13 || i == 23 || i == 24 || i == 25){

				karten[i].setWert(10);
			}
			if(i == 26 || i == 36 || i == 37 || i == 38){

				karten[i].setWert(10);
			}
			if(i == 39 || i == 49 || i == 50 || i == 51){

				karten[i].setWert(10);
			}
		}
	}

	public static void Karteziehen(Spieler a){

		int platzhalter = 0;
		Random rnd = new Random();
		int zz = rnd.nextInt(arraylänge);

		if(a.getHand()[0] == -1){

			a.getHand()[0] = zz;
			arraylänge--;

		}
		else if(a.getHand()[1] == -1){

			a.getHand()[1] = zz;
			platzhalter = karten[zz].getNummer();
			karten[zz].setNummer(karten[arraylänge].getNummer());
			karten[arraylänge].setNummer(platzhalter);
			arraylänge--;


		}
		else if(a.getHand()[2] == -1){

			a.getHand()[2] = zz;
			platzhalter = karten[zz].getNummer();
			karten[zz].setNummer(karten[arraylänge].getNummer());
			karten[arraylänge].setNummer(platzhalter);
			arraylänge--;

		}
		else if(a.getHand()[3] == -1){

			a.getHand()[3] = zz;
			platzhalter = karten[zz].getNummer();
			karten[zz].setNummer(karten[arraylänge].getNummer());
			karten[arraylänge].setNummer(platzhalter);
			arraylänge--;

		}
		else if(a.getHand()[4] == -1){

			a.getHand()[4] = zz;
			platzhalter = karten[zz].getNummer();
			karten[zz].setNummer(karten[arraylänge].getNummer());
			karten[arraylänge].setNummer(platzhalter);
			arraylänge--;

		}
		if(a.getHand()[5] == -1){

			a.getHand()[5] = zz;
			platzhalter = karten[zz].getNummer();
			karten[zz].setNummer(karten[arraylänge].getNummer());
			karten[arraylänge].setNummer(platzhalter);
			arraylänge--;

		}
	}
}
