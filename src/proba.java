
public class proba {

	private static int[] saberiBinarne(int[] binarni, int[] binarni2) {
		int[] binarni3 = new int[9];
		
		for (int i = 7, k = 8; i > 0; i--, k--) {
			binarni3[k] = binarni[i] + binarni2[i];
				if (binarni3[k] == 2) {
					binarni3[k] = 0;
					binarni[i-1] = binarni[i-1] +1;
				} else if (binarni3[k] > 2) {
					binarni3[k] = 1;
					binarni[i-1] = binarni[i-1] +1;
				}
			
		} return binarni3;
		
	}
	
	
	/**
	 * Funkcija pretvara neki int broj u njegov binarni pandan
	 * @param broj Uneseni integer
	 */
	private static int[] binarniKod(int broj) {
		int k = 7;
		int niz[] = new int [8];
		while (broj > 0) {
			int bin = broj % 2;
			niz[k] = bin;
			k--;
			broj = broj /2;
		}
		return niz;
	}
	
	/**
	 * Funkcija ispisuje niz
	 * @param niz Uneseni niz
	 */
	public static void print(int[] niz) {
		System.out.print("Binarni kod je: ");
		for(int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		System.out.print("Unesite prvi broj: ");
		int broj = TextIO.getlnInt();
		
		System.out.print("Unesite drugi broj: ");
		int broj2 = TextIO.getlnInt();
		
		int [] binarni = binarniKod(broj);
		print(binarni);
		int [] binarni2 = binarniKod(broj2);
		print(binarni2);
		int [] sumaBin = saberiBinarne(binarni, binarni2);
		print(sumaBin);
	}
	}


