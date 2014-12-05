public class ZadatakBr12BinarniBrojevi {
	/*
	 * Napisite funkciju koja kao parametar prima cijeli broj n a vraca njegovu
	 * binarnu reprezentaciju u obliku string-a. Binarna reprezentacija treba da
	 * ima 8 bitova, odnosno broj 255 ce biti 11111111 a broj 3 ce biti
	 * 00000011.
	 */
	public static void main(String[] args) {
		System.out.println("Unesi broj: ");
		int x = TextIO.getlnInt();
		// String bin = Integer.toBinaryString(x); // ovo ne smijemo koristiti
		// System.out.println(bin); // ovo ne smijemo koristiti
        System.out.println("Binarni broj je :  "+ decimalniUBinarni(x));
	}

	public static String decimalniUBinarni(int broj) {
         String strBin = "";

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
