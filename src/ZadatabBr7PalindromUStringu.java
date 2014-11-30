/*
 * Napisati funkciju koja za neku unesenu recenicu(string) ispisuje sve simetricne rijeci
 * (palindrome), odnosno sve rijeci koje se citaju jednako sa obje strane.
 */

public class ZadatabBr7PalindromUStringu {
	public static void main(String[] args) {
		
		System.out.println("Unesi jednu recenicu:");
		
		String recenica = TextIO.getlnString();
		char razmak = ' ';
      //  String [] rezultat;
	
        String []rezultat = razdvajanjeRijeci(recenica, razmak) ;
		
		if (rijecPalindrom(rezultat)) {
			System.out.println("U stringu ima rijeci koje su palindorm!");
		} else {
			System.out.println("U stringu nema rijeci koje su palindorm!");
		}
	}
/**
 * Funkcija koja prima string i char, a razdvaja recenicu na pojedinacne rijeci.
 * @param recenica = proizvoljna unesena recenica
 * @param znak =  je char koji sluzi za razdvajanje rijeci u recenici, a ovom slucaju je razmak.
 * @return vraca niz od pojedinacnih rijeci iz recenice.
 */
	private static String[] razdvajanjeRijeci(String recenica, char znak) {
		String[] nizRijeci = {};
		String[] temp = {};

		int brojac = 0;
		int x = recenica.indexOf(znak);
		do {
			brojac++;
			
			String rijec = recenica.substring(0, x);
			temp = new String[brojac];
			if (x==-1){
				for (int i = 0; i < nizRijeci.length; i++) {
					temp[i] = nizRijeci[i];
				}
				temp[brojac+1] = recenica;
				nizRijeci = temp;
			}


			for (int j = 0; j < nizRijeci.length; j++) {
				temp[j] = nizRijeci[j];
			}

			temp[brojac - 1] = rijec;
			nizRijeci = temp;

			recenica = recenica.substring(x + 1);
			x = recenica.indexOf(znak);
		} while (x >= 0);

		

		return nizRijeci;

	}
	/**
	 * Funkcija koja provjerava da li je rijec palindrom.
	 * @param rijec =  dio recenice koju smo unijeli ,a koji provjeravamo da li je palindrom.
	 * @return = vraca da li je rijec palindrom ili ne
	 */
  private static boolean rijecPalindrom(String [] rijec) {
		boolean rijecPalindrom = false;
//		String trenutnaRijec = null;
		int brojac = 0;
		for (  int i =0; i<rijec.length; i++){
			String trenutnaRijec = rijec [i];
			char [] slovo = trenutnaRijec.toCharArray();
			for ( int j = 0; j< trenutnaRijec.length(); j++){
				 if ( slovo[j]==slovo[(trenutnaRijec.length()-1)-j]) {
					 brojac++;
				 }
				 if (brojac > 0) {
			     return true;
				 }
			}
		}
			
		return rijecPalindrom;
	}
}
//boolean rijecPalindrom = false;
//int i = 0;

//for ( i = 0; i < rijec.length; i++) {
//	int brojac = 0;
//	
//	if (rijec.charAt(i) == rijec.charAt((rijec.length() - 1) - i)) {
//		brojac++;
//	}
//	if (brojac > 0) {
//		return true;
//	}
//}
//return rijecPalindrom;
//}
