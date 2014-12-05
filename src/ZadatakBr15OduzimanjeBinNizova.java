/*
 * Napisati funkciju oduzmiBinarne koja prima dva niza ciji elemnti predstavljaju
 * osmobitni binarni broj a koja vraca niz ciji su elemnti broj koji se dobije sabiranjem ta dva binarna broja.
 */
public class ZadatakBr15OduzimanjeBinNizova {
	public static void main(String[] args) {

		System.out.println("Unesi prvi broj : ");
		int prviBroj = TextIO.getlnInt();

		System.out.println("Unesi drugi broj: ");
		int drugiBroj = TextIO.getInt();

		int [] prviBrBinar = decimalniUBinarni(prviBroj);
		int [] drugiBrBinar = decimalniUBinarni(drugiBroj);
		
		System.out.println("Prvi binarni broj je: ");
		print(prviBrBinar);
		System.out.println("Drugi binarni broj je: ");
		print(drugiBrBinar);
			
//		int [] sumaBinara = sabiranjeBinarnihBrojeva(prviBrBinar, drugiBrBinar);
//        print(sumaBinara);
        
		System.out.println("Razlika binranih brojeva : ");
        int [] razlikaBinara = odizimanjeBinarnihBrojeva(prviBrBinar,drugiBrBinar);
        print(razlikaBinara);
	}

	private static int[] odizimanjeBinarnihBrojeva(int[] prviBrBinar,
			int[] drugiBrBinar) {
		
		int [] k2 =  {0,0,0,0,0,0,0,1};
		for ( int  i=0; i< drugiBrBinar.length; i++ ){
			if (drugiBrBinar[i] ==0){
				drugiBrBinar[i] =1;
			} else if (drugiBrBinar[i] ==1){
				drugiBrBinar[i] =0;
			}
		}
		
		int [] sumK2Br2 = sabiranjeBinarnihBrojeva(drugiBrBinar, k2);
		int [] razlika = sabiranjeBinarnihBrojeva(prviBrBinar, sumK2Br2);
	
		
		
		
		// oduzimannje binarnih brojeva uz pomoc komplementa dvojke
		
		
		return razlika;
	}

	private static int [] sabiranjeBinarnihBrojeva(int [] prviBrBinar,int [] drugiBrBinar) {	
	
		int[] rezultat = new int[9];

		for (int i =1 ; i < prviBrBinar.length; i++) {

			rezultat [rezultat.length -i] =prviBrBinar[prviBrBinar.length-i] + drugiBrBinar[prviBrBinar.length-i] ; ///!!!!! greska

			if (prviBrBinar[prviBrBinar.length-i] + drugiBrBinar[prviBrBinar.length-i] ==2){
				rezultat [rezultat.length -i] = 0;
				prviBrBinar[prviBrBinar.length-i]++;

			} else if (prviBrBinar[prviBrBinar.length-i] + drugiBrBinar[prviBrBinar.length-i] >2)
					rezultat [rezultat.length-i] = 0;
			prviBrBinar[prviBrBinar.length-i]++;

		}
		return rezultat;
	
	}

	public static int [] decimalniUBinarni ( int broj) {
        int [] binar = new int [8];
         int i = 8;
		 while ( broj > 0){
			 int ostatak = broj %2;
			  binar [i-1] = ostatak;
			  i--;
			  broj = broj /2;
			  
		}
		return binar;
	}

	public static void print ( int[] niz) {
		for (int i = 1; i < niz.length; i++) {
			System.out.print(niz[i]);
		}
		System.out.println();
	}
}
