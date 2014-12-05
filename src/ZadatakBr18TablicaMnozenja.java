
/*
 * Napisati funkciju tablicaMnozenja koja prima dva cjelobrojna parametra m i n I koja
 * kreira dvodimenzionalni niz popunjen tablicom mnozenja, pri cemu mnozenici u 
 * redovima tablice idu od 1 do m a mnozitelji u kolonama tablice idu od 1 do n. 
 * Na kraju vratite kreirani dvodimenzionalni niz kao rezultat.
 */

public class ZadatakBr18TablicaMnozenja {
	public static void main(String[] args) {

		System.out.println("Unesi mnozenik : ");
		int mnozenik = TextIO.getInt();

		System.out.println("Unesi mnozitelj : ");
		int mnozitelj = TextIO.getInt();

//		int[][] matrica = kreiranjeMatrice(mnozenik, mnozitelj);		
		tablicaMnozenja(mnozenik, mnozitelj);
	}

	/**
	 * Funkcija koja kreira tablicu mnozenja
	 * @param mnozenik  broj koji mnozimo
	 * @param mnozitelj broj koji oznacava koliko puta mnozimo
	 * @return tablicnu mnozenja dva broja koji ste unijeli
	 */
	private static void tablicaMnozenja(int x, int y) {
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {
				System.out.printf(" %2d ", i * j);
			}
			System.out.println();
		}
	}

	/**
	 * Funkcija koja kreira matricu
	 * @param mnozenik  broj koji mnozimo
	 * @param mnozitelj broj koji oznacava koliko puta mnozimo
	 * @return matricu od mnozenika i mnozitelja
	 */
//	private static int[][] kreiranjeMatrice(int mnozenik, int mnozitelj) {
//		int[][] matrica = new int[mnozenik][mnozitelj];
//		return matrica;
//	}
}
