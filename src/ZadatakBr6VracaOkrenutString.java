/*
 * Napisati funkciju koja prima string a vraca okrenut taj string,
 */


public class ZadatakBr6VracaOkrenutString {
	public static void main(String[] args) {
		
		System.out.println("Unesi jednu recenicu: ");
		String recenica = TextIO.getlnString();

		okretanjeStringa(recenica);
	}
/**
 * Funkcija koja prima string i vraca okrenut string.
 * @param recenica = proizvoljna recenica koju unosimo
 */
 //opet funkcija treba nesto da vrati, znaci umjesto ispisa trebalo je vratiti neki string
	private static void okretanjeStringa(String recenica) {
		for (int i = 1; i <= recenica.length(); i++) {

			System.out.print(recenica.charAt((recenica.length() - i)));
		}

	}
}
