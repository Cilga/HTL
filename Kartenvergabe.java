import java.util.ArrayList;
import java.util.Random;

public class Kartenvergabe {

	static Karte karten[] = new Karte[312];
	static int counter = 1;

	public static void KartenNummerInitialisieren(){
		for(int i = 0; i < 6; i++){
			for(int j = 1; j < 53; j++){

				Karte karte = new Karte(j-1,0);
				karten[(i*52+j)-1] = karte;
			}
		}
	}
	public static void KartenWerte(ArrayList<Karte> hand){

		for(int i = 0; i < hand.size(); i++){
			
			hand.get(i).setWert(hand.get(i).getNummer()%13);
			
			if(hand.get(i).getNummer() == 9 || hand.get(i).getNummer() == 10 || 
					hand.get(i).getNummer() == 11 || hand.get(i).getNummer() == 12){
				
				hand.get(i).setWert(10);
				
			}
			if(hand.get(i).getNummer()%12 == 1 || hand.get(i).getNummer() == 0 && 
					getWert(hand) < 11){
				
				hand.get(i).setWert(11);
				
			}
			if(hand.get(i).getNummer()%12 == 1 || hand.get(i).getNummer() == 0 && 
					getWert(hand) > 10){
				
				hand.get(i).setWert(1);
				
			}
		}
	}
	public static int getWert(ArrayList<Karte> hand){
		int summe = 0;
		
		for(int i = 0; i < hand.size(); i++){
			
			summe += hand.get(i).getWert();
		}
		return summe;
	}
	public static void Karteziehen(Spieler a){

		if(getWert(a.hand) > 21){
			
			return;
			
		}
		
		Karte platzhalter = new Karte(0,0);
		Random rnd = new Random();
		int zz = rnd.nextInt(karten.length-counter);
		
        a.hand.add(karten[zz]);
        
        platzhalter = karten[zz];
        karten[zz] = karten[karten.length-counter];
        karten[karten.length-counter] = platzhalter;
        counter++;
        KartenWerte(a.hand);
		
	}
}
