/*
 * Napisati funkciju pomjeriLijevo koja prima niz brojeva a zatim svaki od clanova niza
   pomjeri za jedno mjesto u lijevo. Vrijednost iz prvog clana niza treba biti izbacena, a 
   zadnji clan niza (nakon pomjeranja) treba imati vrijednost 0.
 */
public class ZadatakBr3PomjeriLijevo {
public static void main(String[] args) {
	
	int [] niz = {1,2,3,4,5};

	pomrijeriLijevo(niz); 
			
}
/**
 * Funkcija pomjeriLijevo koja prima niz brojeva a zatim svaki od clanova niza
   pomjeri za jedno mjesto u lijevo
 * @param niz = niz brojeva koje funkcija prima
 */
private static void pomrijeriLijevo(int[] niz) { //ovakva postavka petlje radi samo ako je vrijednost prvog clana 1
		                                         //probaj niz {4, 3, 1, 2, 5}
	for( int i = niz[0]; i< niz.length; i++ ) {
		niz [i-1]=niz[i];
		System.out.print(niz [i] + ",");		
	}
	System.out.print("0");
}
}
