/*
 * Napisite program koji trazi da se sa tastature unese neki znak, a koji æe zatim na
 * ekranu ispisati njegovu ASCII šifru, kao i znakove koji prethode
 * odnosno koji slijede iza njega prema tablici ASCII sifri.
 */
public class ZadatakBr9AsciiZnak {
public static void main(String[] args) {
	System.out.println("Unesi neki znak sa tastaute: ");
	char znak = TextIO.getAnyChar();//uneseni znak sa  tastature
	int ascii = (int) znak;
	System.out.println("Ascii broj za uneseni znak je " + ascii);
	
	System.out.println("Ascii susjedni znakovi su " + (char)(ascii+1) + "=" + (ascii+1)); 
	System.out.println("Ascii susjedni znakovi su " + (char)(ascii-1) + "=" + (ascii-1));
}


}
