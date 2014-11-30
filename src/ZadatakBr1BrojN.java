     /*
	 * Napisite funkciju koja kao paramerar prima cijeli broj n a koja vraca sumu cifara broja n. 
	 */

public class ZadatakBr1BrojN {
	
	public static void main(String[] args) {
		System.out.println("Unesi broj: ");
		int broj = TextIO.getlnInt(); // Proizvoljan broj koji zelimo unijeti.

		System.out.println("Suma cifara broja je: " + sumaCifara(broj));

	}
	/**
	 * Funkcija koja prima broj , a vraca sumu njegovig cifara.
	 * @param broj = proizvoljan broj koji unesemo.
	 * @return Sumu cifara broja koji smo unijeli ( broj =123, suma cifara : 1+2+3=6)
	 */

	private static int sumaCifara(int broj) {

		int sum = 0;
		while (broj != 0) {
			int k = broj % 10;
			sum = sum + k;
			broj = broj / 10;
		}
		return sum;
	}
}
