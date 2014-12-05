public class ZadatakBr14SabiranjeBInNizova {

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
		
		System.out.println("Suma binranih brojeva : ");

		int [] sumaBinara = sabiranjeBinarnihBrojeva(prviBrBinar, drugiBrBinar);
        print(sumaBinara);
	}

	private static int [] sabiranjeBinarnihBrojeva(int [] prviBrBinar,int [] drugiBrBinar) {	
		int[] rezultat = new int[9];

		for (int i =1 ; i < prviBrBinar.length; i++) {

			rezultat [rezultat.length-1 -i] =prviBrBinar[prviBrBinar.length-i] + drugiBrBinar[prviBrBinar.length-i] ; ///!!!!! greska

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
