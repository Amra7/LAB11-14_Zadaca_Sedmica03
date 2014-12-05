/*
 * Napisati funkciju razdijeli koja prima 2 parametra, varijablu tipa string i varijablu tipa char.
   Funkcija treba da vrati niz stringova koji se sastoje od dijelova koje dobijemo kad 
   poslani string podijelimo na mjestima gdje se pojavljuje znak koji smo poslali.
 */

public class ZadatakBr5RazdjeliString {
	public static void main(String[] args) {

		String recenica = "Ovo je zabavan zadatak. ";
		System.out.println(recenica);
		char razmak = ' ';

		String[] rez = razdijeli(recenica, razmak);
		for (int i = 0; i < rez.length; i++) {
			System.out.print(rez[i] + ", ");
		}

	}

	/**
	 * Funkciju koja prima 2 parametra, varijablu tipa string i varijablu tipa
	 * char.
	 * 
	 * @param recenica
	 *            = string koji pretvaramo u niz rijeci
	 * @param razmak
	 *            = je prazan prostor izmedju rijeci
	 * @return = vraca niz stringova koji se sastoje od dijelova koje dobijemo
	 *         kad poslani string podijelimo
	 */
	public static String[] razdijeli(String recenica, char razmak) {
		String[] rezultat = {}; // niz stringova koji zelimo dobiti
		String[] temp = {}; // privremeni niz stringova

		int counter = 0;
		int x = recenica.indexOf(razmak); // broj elemnata u stringu na kojem se
											// nalazi razmak.
		while (x >= 0) {
			counter++;
			String rijec = recenica.substring(0, x);
			temp = new String[counter];
			for (int j = 0; j < rezultat.length; j++) {
				temp[j] = rezultat[j];
			}
			temp[counter - 1] = rijec;
			rezultat = temp;
			recenica = recenica.substring(x + 1);
			x = recenica.indexOf(razmak);

		}

		if (recenica != " ") {
			temp = new String[counter + 1]; // u posljednjem krugu vracanja u
											// while petlju x=-1 jer nema vise
											// razmaka u recenici
			// zbog toga se ma ovaj nain ispisuje posljednja rijec
			for (int j = 0; j < rezultat.length; j++) {
				temp[j] = rezultat[j];
			}
			temp[counter] = recenica;
			rezultat = temp;
		}

		return rezultat;
	}
}
