/*
 * Napisati funkciju koja korisniku omogucava da unosi proizvoljni broj cijelih brojeva,
 unos brojeva treba prekinuti kad korisnik unese -1, ovdje -1 ne racunamo kao deseti 
 uneseni broj. Fukcija treba da vrati zadnjih 10 unesenih brojeva. Funciju demonstrirati 
 u programu koji ce od korisnika traziti da unosi brojeve a zatim ispisuje zadnjih 10 
 unesenih brojeva u istom redoslijedu u kojem su uneseni.
 */
public class ZadatakBr4UnosenjeNiza {
	public static void main(String[] args) {

		int brojElemenata = 0;
		int[] niz = new int[brojElemenata];

		unosenjeBrojevaNiza(niz);

	}

	private static void printPrvih10Brojeva(int[] niz) {
		for (int i = 0; i < 10; i++) {
			System.out.print(niz[i] + ", ");

		}
	}

	/**
	 * Funckija koja prima niz brojeva sve dok se ne unese broj -1, a vraca
	 * prvih deset brojeva niza.
	 *
	 * @param niz= proizvoljan niz brojeva koji unosimo.
	 *            
	 */

	private static void unosenjeBrojevaNiza(int[] niz) {
		System.out.println("Unesi vrijednost duzine niza: ");
		int brojElemenata = TextIO.getlnInt();
		niz = new int[brojElemenata];
		System.out.println("Unesi brojeve u  niza: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = TextIO.getInt();
			int a = niz[i];
			if (a == -1) {
				System.out.println("Unijeli ste broj -1!");
				System.out.println("prvih 10 clanova niza je: ");
				printPrvih10Brojeva(niz);
				return;
			}
		}

	}
}
