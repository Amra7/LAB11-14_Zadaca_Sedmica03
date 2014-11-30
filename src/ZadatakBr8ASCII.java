/*
 * Napišite program koji trazi da se sa tastature unese neki cijeli broj, a koji æe zatim na
 * ekranu ispisati znak èija je ASCII šifra jednaka unesenom broju.
 */
public class ZadatakBr8ASCII {
public static void main(String[] args) {
	System.out.println("Unesi neki broj: ");
	int broj = TextIO.getlnInt(); // prizvoljan broj koji unosimo
		
	System.out.println("Asci znak za broj je: " + ASCIIToChar(broj));
}

/**
 * Funkcija koja pretvara ASCII vrijednosti u karaktere.
 * @param ascii ASCII vrijednost karaktera
 * @return Vraca vrijednost broja koji smo unijeli.
 */

public static char ASCIIToChar(final int ascii){
	return (char)ascii;		
}
}
