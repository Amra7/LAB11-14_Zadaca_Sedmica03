/*
 *   Napisati funkciju koja prima cijeli broj n , a koja ispisuje na ekran sve brojeve od 1 do n koji su dijeljivi sa sumom svojih cifara.
 */

public class ZadatakBr2DijeljivostBrojaSaSvojomSumom {
	public static void main(String[] args) {
		System.out.println("Unesi jedan broj: ");
		int broj = TextIO.getInt();// Proizvoljan broj koji zelimo unijeti.

		System.out.println("Brojevi koji su djeljivi sa svojom sumom: ");
		brojeviDjeljiviSaSvojomCifrom(broj);

	}
/**
 * Funkcija koja vraca brojeve iz niza [1, broj] koji su sjedljivi sa sumom svojih cifara.
 * @param broj = proizvoljan broj koji smo unijeli.
 */
	private static void brojeviDjeljiviSaSvojomCifrom(int broj) {
		for (int i = 1; i <= broj; i++) {
			if (i % sumaCifara(i) == 0) {
				System.out.print(i + ", ");
			}
		}
	}
/**
 * Funkcija koja vraca sumu cifara broja.
 * @param i = brojevi ciju sumu cifara provjeravamo
 * @return Suma cifara brojeva
 */
	private static int sumaCifara(int i) {
		int sum = 0;
		while (i != 0) {
			int k = i % 10;
			sum = sum + k;
			i = i / 10;
		}
		return sum;
	}
}
