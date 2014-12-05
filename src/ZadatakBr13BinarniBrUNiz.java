public class ZadatakBr13BinarniBrUNiz {
	/*
	 * Napisati funkciju koja kao parametar prima cijeli ne negativni broj n a
	 * koja vraca niz od 8 clanova gdje svaki od clanova predstavlja jednu cifru
	 * broja n napisanog u binarnom zapisu. Za broj 3 program treba da vrati niz
	 * {0, 0, 0, 0, 0, 0, 1, 1}.
	 */
	public static void main(String[] args) {
		System.out.println("Unesi broj: ");
		int x = TextIO.getlnInt();


		String nizBinara = decimalniUBinarni(x);
		char [] konacniNizBinBrojeva = nizBinara.toCharArray();
		System.out.print("Binarni niz je: {");
		for (int i = 0; i < 8; i++) {
			System.out.print(konacniNizBinBrojeva[i] + ", ");
		}
		System.out.print("}");
	}

	public static String decimalniUBinarni(int broj) {
        String strBin = "";
//        String str = "";
        for ( int i = 0; i<8; i++){
       	 if ( broj%2==1){
       		 strBin =  '1' + strBin;	 
       	 }
       	 if ( broj%2==0){
       		 strBin =  '0' + strBin;	 
       	 }
       	broj =  broj/2;
	
		}
		return strBin;
	}
}
